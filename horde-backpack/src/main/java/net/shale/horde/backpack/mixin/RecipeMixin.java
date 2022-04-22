package net.shale.horde.backpack.mixin;

import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.ShapedRecipe;
import net.shale.horde.backpack.entity.BackpackEntity;
import net.shale.horde.backpack.item.BackpackItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShapedRecipe.class)
public abstract class RecipeMixin {

    @Shadow
    public abstract ItemStack getOutput();

    @Inject(method = "craft", at = @At("HEAD"), cancellable = true)
    private void onCraft(CraftingInventory craftingInventory, CallbackInfoReturnable<ItemStack> cir) {
        // For our recipes, the backpack must sit in the middle, this is slot 4
        ItemStack centerItem = craftingInventory.getStack(4);

        // Is this item an upgradeable backpack?
        if (centerItem.getItem() instanceof BackpackItem) {
            // Yes, lets get the inventory of the old backpack
            NbtCompound oldItems = centerItem.getSubNbt(BackpackEntity.NBT_TAG);

            // Let's get the new item and make sure it's a backpack
            ItemStack newItem = this.getOutput().copy();
            if (newItem.getItem() instanceof BackpackItem) {
                newItem.setSubNbt(BackpackEntity.NBT_TAG, oldItems);
                cir.setReturnValue(newItem);
            }
        }
    }
}
