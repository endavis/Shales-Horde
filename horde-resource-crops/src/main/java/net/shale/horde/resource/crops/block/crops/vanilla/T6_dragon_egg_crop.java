package net.shale.horde.resource.crops.block.crops.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T6_dragon_egg_crop extends CropBlock {
    public T6_dragon_egg_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T6__crops.CROP_DRAGON_EGG;
    }
}
