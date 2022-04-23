package net.shale.horde.resourcecrops.blocks.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.shale.horde.resourcecrops.items.vanilla.T0__seeds;

public class T0_rhodonite_crop extends CropBlock {
    public T0_rhodonite_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T0__seeds.SEED_RHODONITE;
    }
}
