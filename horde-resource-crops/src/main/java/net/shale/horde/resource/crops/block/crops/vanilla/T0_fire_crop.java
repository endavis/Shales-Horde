package net.shale.horde.resource.crops.block.crops.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T0_fire_crop extends CropBlock {
    public T0_fire_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T0__crops.CROP_FIRE;
    }
}
