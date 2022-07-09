package net.shale.horde.backpack.block.copper;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.shale.horde.backpack.block.Pickup;
import net.shale.horde.backpack.registry.BB_CopperItemRegistry;

public class LimeBlockCopper extends Pickup {
    public LimeBlockCopper(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return null;
    }

    @Override
    protected ItemStack getBlock() {
        return BB_CopperItemRegistry.COPPER_LIME_ITEM.getDefaultStack();
    }
}
