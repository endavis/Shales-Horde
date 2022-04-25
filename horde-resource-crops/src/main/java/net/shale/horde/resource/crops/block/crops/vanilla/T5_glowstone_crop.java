package net.shale.horde.resource.crops.block.crops.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T5_glowstone_crop extends CropBlock {
    public T5_glowstone_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T5__crops.CROP_GLOWSTONE;
    }
}
