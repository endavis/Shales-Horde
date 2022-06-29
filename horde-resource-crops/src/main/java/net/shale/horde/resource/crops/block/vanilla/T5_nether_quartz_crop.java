package net.shale.horde.resource.crops.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.resource.crops.block.custom.crop_block;
import net.shale.horde.resource.crops.item.vanilla.T5__seeds;

public class T5_nether_quartz_crop extends crop_block {
    public T5_nether_quartz_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T5__seeds.SEED_NETHER_QUARTZ;
    }
}
