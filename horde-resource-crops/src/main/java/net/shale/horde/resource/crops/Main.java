package net.shale.horde.resource.crops;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.shale.horde.resource.crops.block.ores.blocks_ores;
import net.shale.horde.resource.crops.block.vanilla.*;
import net.shale.horde.resource.crops.item.items_ores;
import net.shale.horde.resource.crops.item.other.gemstones;
import net.shale.horde.resource.crops.item.other.shards;
import net.shale.horde.resource.crops.item.vanilla.*;

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
        T3__crops.registerBlock();
        T3__seeds.registerModItems();
        T4__crops.registerBlock();
        T4__seeds.registerModItems();
    }
}