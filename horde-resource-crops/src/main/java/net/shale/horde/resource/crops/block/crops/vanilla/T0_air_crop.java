package net.shale.horde.resource.crops.block.crops.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.shale.horde.resource.crops.item.vanilla.T0__seeds;

public class T0_air_crop extends CropBlock {
    public T0_air_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T0__seeds.SEED_AIR;
    }
}
