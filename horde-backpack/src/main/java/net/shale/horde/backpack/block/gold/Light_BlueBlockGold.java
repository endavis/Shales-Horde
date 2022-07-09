package net.shale.horde.backpack.block.gold;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.shale.horde.backpack.block.Pickup;
import net.shale.horde.backpack.registry.BB_GoldItemRegistry;

public class Light_BlueBlockGold extends Pickup {
    public Light_BlueBlockGold(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return null;
    }
    @Override
    protected ItemStack getBlock() {
        return BB_GoldItemRegistry.GOLD_LIGHT_BLUE_ITEM.getDefaultStack();
    }
}
