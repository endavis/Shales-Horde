package net.shale.horde.resourcecrops.block.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T0_earth_crop extends CropBlock {
    public T0_earth_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T0__crops.CROP_EARTH;
    }
}
