package net.shale.horde.backpack.block.gold;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.shale.horde.backpack.block.Pickup;
import net.shale.horde.backpack.registry.BB_GoldItemRegistry;

public class CyanBlockGold extends Pickup {
    public CyanBlockGold(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return null;
    }
    @Override
    protected ItemStack getBlock() {
        return BB_GoldItemRegistry.GOLD_CYAN_ITEM.getDefaultStack();
    }
}
