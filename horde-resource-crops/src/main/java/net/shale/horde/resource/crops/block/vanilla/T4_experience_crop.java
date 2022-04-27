package net.shale.horde.resource.crops.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.resource.crops.item.vanilla.T4__seeds;

public class T4_experience_crop extends crop_block {
    public T4_experience_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T4__seeds.SEED_EXPERIENCE;
    }
}
