package net.shale.horde.resourcecrops.blocks.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T3_squid_crop extends CropBlock {
    public T3_squid_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T3__crops.CROP_SQUID;
    }
}
