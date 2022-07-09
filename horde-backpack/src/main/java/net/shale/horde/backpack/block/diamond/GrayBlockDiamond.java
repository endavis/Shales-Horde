package net.shale.horde.backpack.block.diamond;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.shale.horde.backpack.block.Pickup;
import net.shale.horde.backpack.registry.BB_DiamondItemRegistry;

public class GrayBlockDiamond extends Pickup {
    public GrayBlockDiamond(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return null;
    }
    @Override
    protected ItemStack getBlock() {
        return BB_DiamondItemRegistry.DIAMOND_GRAY_ITEM.getDefaultStack();
    }
}
