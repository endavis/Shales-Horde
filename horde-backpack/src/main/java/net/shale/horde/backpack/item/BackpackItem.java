package net.shale.horde.backpack.item;

import dev.emi.trinkets.api.Trinket;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shale.horde.backpack.api.OpenableBlockEntityProviderCustom;
import net.shale.horde.backpack.block.BackpackBlock;
import net.shale.horde.backpack.entity.BackpackBlockEntity;
import net.shale.horde.backpack.entity.BackpackEntity;

import static net.shale.horde.backpack.entity.BackpackEntity.NBT_TAG;

//public class Backpack extends Item implements OpenableBlockEntityProviderCustom {
public class BackpackItem extends BlockItem implements OpenableBlockEntityProviderCustom, Trinket {
    private final int inventorySize;

    public BackpackItem(Block block, Settings settings, int inventorySize) {
        super(block, settings);
        this.inventorySize = inventorySize;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        this.OpenCustomBackpack(world, user, hand);
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        if (player.isInSneakingPose()) {
            // Store the Items before Placing the block
            ItemStack stack = player.getStackInHand(context.getHand());
            NbtCompound tag = stack.getSubNbt(NBT_TAG);

            // Place and Fetch the block
            ItemPlacementContext convertedPlacementContext = new ItemPlacementContext(context);
            this.place(convertedPlacementContext);
            BlockPos blockPos = convertedPlacementContext.getBlockPos();
            World world = convertedPlacementContext.getWorld();
            BlockState blockState2 = world.getBlockState(blockPos);
            if (blockState2.getBlock() instanceof BackpackBlock) {
                // Put the items into the block
                BackpackBlockEntity backpack = (BackpackBlockEntity) world.getBlockEntity(blockPos);
                assert backpack != null;
                backpack.setItems(tag);

                // ((BackpackBlock) blockState2.getBlock()).item = this;
                // ((BackpackBlock) blockState2.getBlock()).inventory = player.getStackInHand(context.getHand());

                return ActionResult.SUCCESS;
            }

            return ActionResult.FAIL;
        } else {
            this.OpenCustomBackpack(player.world, player, context.getHand());
        }

        return ActionResult.SUCCESS;
    }


    public ActionResult OpenCustomBackpack(World world, PlayerEntity player, Hand hand) {
        return this.ncl_onBlockUse(world, player.getBlockStateAtPos(), player.getBlockPos(), player, hand, null, new BackpackEntity(this.inventorySize, player.getStackInHand(hand)));
    }

    public ActionResult OpenCustomBackpack(PlayerEntity player, ItemStack stack) {
        return this.ncl_onBlockUse(player.getWorld(), player.getBlockStateAtPos(), player.getBlockPos(), player, player.getActiveHand(), null, new BackpackEntity(this.inventorySize, stack));
    }
}
