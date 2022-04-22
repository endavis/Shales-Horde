package net.shale.horde.resourcecrops.blocks.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T4_emerald_crop extends CropBlock {
    public T4_emerald_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T4__crops.CROP_EMERALD;
    }
}
