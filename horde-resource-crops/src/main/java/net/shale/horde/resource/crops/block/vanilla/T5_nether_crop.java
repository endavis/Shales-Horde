package net.shale.horde.resource.crops.block.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T5_nether_crop extends CropBlock {
    public T5_nether_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T5__crops.CROP_NETHER;
    }
}
