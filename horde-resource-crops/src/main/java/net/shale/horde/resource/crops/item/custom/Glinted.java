package net.shale.horde.resource.crops.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Glinted extends Item {
    public Glinted(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
