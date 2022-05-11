package net.shale.horde.resource.crops.block.modded;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.resource.crops.block.custom.crop_block;
import net.shale.horde.resource.crops.item.modded.m_T1__seeds;

public class m_T1_sky_stone_crop extends crop_block {
    public m_T1_sky_stone_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return m_T1__seeds.SEED_SKY_STONE;
    }
}
