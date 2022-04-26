package net.shale.horde.resource.crops;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.shale.horde.resource.crops.block.ores.blocks_ores;
import net.shale.horde.resource.crops.block.vanilla.T0__crops;
import net.shale.horde.resource.crops.block.vanilla.T1__crops;
import net.shale.horde.resource.crops.block.vanilla.T2__crops;
import net.shale.horde.resource.crops.item.items_ores;
import net.shale.horde.resource.crops.item.other.gemstones;
import net.shale.horde.resource.crops.item.other.shards;
import net.shale.horde.resource.crops.item.vanilla.T0__seeds;
import net.shale.horde.resource.crops.item.vanilla.T1__seeds;
import net.shale.horde.resource.crops.item.vanilla.T2__seeds;
import net.shale.horde.resource.crops.item.vanilla.mixes;

public class Main implements ModInitializer {
    public static final String ID = "horde-resource-crops";

    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }

    @Override
    public void onInitialize() {
        mixes.registerModItems();
        gemstones.registerModItems();
        shards.registerModItems();
        items_ores.registerModItems();
        blocks_ores.registerBlock();
        T0__crops.registerBlock();
        T0__seeds.registerModItems();
        T1__crops.registerBlock();
        T1__seeds.registerModItems();
        T2__crops.registerBlock();
        T2__seeds.registerModItems();
    }
}