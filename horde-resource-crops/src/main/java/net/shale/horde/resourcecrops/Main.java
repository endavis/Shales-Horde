package net.shale.horde.resourcecrops;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.shale.horde.resourcecrops.blocks.vanilla.*;
import net.shale.horde.resourcecrops.items.ores;
import net.shale.horde.resourcecrops.items.other.gemstones;
import net.shale.horde.resourcecrops.items.other.shards;
import net.shale.horde.resourcecrops.items.vanilla.*;

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
        ores.registerModItems();
        T0__essence.registerModItems();
        T0__seeds.registerModItems();
        T0__crops.registerModBlocks();
        T1__essence.registerModItems();
        T1__seeds.registerModItems();
        T1__crops.registerModBlocks();
        T2__essence.registerModItems();
        T2__seeds.registerModItems();
        T2__crops.registerModBlocks();
        T3__essence.registerModItems();
        T3__seeds.registerModItems();
        T3__crops.registerModBlocks();
        T4__essence.registerModItems();
        T4__seeds.registerModItems();
        T4__crops.registerModBlocks();
        T5__essence.registerModItems();
        T5__seeds.registerModItems();
        T5__crops.registerModBlocks();
        T6__essence.registerModItems();
        T6__seeds.registerModItems();
        T6__crops.registerModBlocks();
    }
}