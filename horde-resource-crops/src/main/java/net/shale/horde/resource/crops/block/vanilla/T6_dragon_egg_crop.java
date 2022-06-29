package net.shale.horde.resource.crops.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.resource.crops.block.custom.crop_block;
import net.shale.horde.resource.crops.item.vanilla.T6__seeds;

public class T6_dragon_egg_crop extends crop_block {
    public T6_dragon_egg_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T6__seeds.SEED_DRAGON_EGG;
    }
}
