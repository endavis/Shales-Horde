package net.shale.horde.resource.crops.mixin;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.shale.horde.resource.crops.item.RemainderItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public abstract class ItemMix<C extends Inventory> {
    @Inject(method = "getRecipeRemainder", at = @At("RETURN"), cancellable = true)
    private void magic(CallbackInfoReturnable<Item> cir) {
        if (((Object) this instanceof RemainderItem)) {
            if (((RemainderItem) (Object) this).hasRecipeRemainderActual()) {
                cir.setReturnValue(((RemainderItem) (Object) this).getRecipeRemainderActual());
            }
        }
    }
}
