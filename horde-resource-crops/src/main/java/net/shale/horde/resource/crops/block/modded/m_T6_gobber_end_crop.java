package net.shale.horde.resource.crops.block.modded;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.resource.crops.block.custom.crop_block;
import net.shale.horde.resource.crops.item.modded.m_T6__seeds;

public class m_T6_gobber_end_crop extends crop_block {
    public m_T6_gobber_end_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return m_T6__seeds.SEED_GOBBER_END;
    }
}
