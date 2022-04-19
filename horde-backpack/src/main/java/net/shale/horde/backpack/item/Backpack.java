package net.shale.horde.backpack.item;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.shale.horde.backpack.api.OpenableBlockEntityProviderCustom;
import net.shale.horde.backpack.entity.BackpackEntity;

//public class Backpack extends Item implements OpenableBlockEntityProviderCustom {
public class Backpack extends TrinketItem implements OpenableBlockEntityProviderCustom {
    private final int inventorySize;

    public Backpack(Settings settings, int inventorySize) {
        super(settings);
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
        this.OpenCustomBackpack(player.world, player, context.getHand());
        return ActionResult.SUCCESS;
    }


    public ActionResult OpenCustomBackpack(World world, PlayerEntity player, Hand hand) {
        return this.ncl_onBlockUse(world, player.getBlockStateAtPos(), player.getBlockPos(), player, hand, null, new BackpackEntity(this.inventorySize, player.getStackInHand(hand)));
    }

    public ActionResult OpenCustomBackpack(PlayerEntity player, ItemStack stack) {
        return this.ncl_onBlockUse(player.getWorld(), player.getBlockStateAtPos(), player.getBlockPos(), player, player.getActiveHand(), null, new BackpackEntity(this.inventorySize, stack));
    }
}
