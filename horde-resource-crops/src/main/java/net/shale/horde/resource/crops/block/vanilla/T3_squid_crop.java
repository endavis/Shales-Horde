package net.shale.horde.resource.crops.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.resource.crops.item.vanilla.T3__seeds;

public class T3_squid_crop extends crop_block {
    public T3_squid_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T3__seeds.SEED_SQUID;
    }
}
