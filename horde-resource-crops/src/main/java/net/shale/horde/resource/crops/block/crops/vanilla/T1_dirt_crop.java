package net.shale.horde.resource.crops.block.crops.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T1_dirt_crop extends CropBlock {
    public T1_dirt_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T1__crops.CROP_DIRT;
    }
}
