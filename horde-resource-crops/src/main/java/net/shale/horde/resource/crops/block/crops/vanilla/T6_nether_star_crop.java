package net.shale.horde.resource.crops.block.crops.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T6_nether_star_crop extends CropBlock {
    public T6_nether_star_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T6__crops.CROP_NETHER_STAR;
    }
}
