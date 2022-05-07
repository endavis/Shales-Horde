package net.shale.horde.backpack.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shale.horde.backpack.entity.BackpackBlockEntity;
import ninjaphenix.container_library.api.v2.OpenableBlockEntityProviderV2;

public class BackpackBlock extends Block implements BlockEntityProvider, OpenableBlockEntityProviderV2 {
    private final int inventorySize;
    // public BackpackItem item = null;
    // public ItemStack inventory = null;

    public BackpackBlock(int inventorySize) {
        super(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
        this.inventorySize = inventorySize;
    }

    public int getInventorySize() {
        return inventorySize;
    }

    @Override
    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        System.out.print("I FEEL USED!");
        if (player.isInSneakingPose()) {
            System.out.print(player.getStackInHand(hand));
            if (player.getStackInHand(hand).isEmpty()) {
                // Get inventory items
                BackpackBlockEntity backpack = (BackpackBlockEntity) world.getBlockEntity(pos);
                if (backpack != null) {
                    DefaultedList<ItemStack> inventory = backpack.getInvStackList();
                    NbtCompound tag = new NbtCompound();
                    Inventories.writeNbt(tag, inventory);
                }
            }

        } else {
            return this.ncl_onBlockUse(world, state, pos, player, hand, hit);
        }
        return ActionResult.FAIL;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BackpackBlockEntity(pos, state);
    }
}
