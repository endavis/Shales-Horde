package net.shale.horde.resourcecrops;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.shale.horde.resourcecrops.blocks.vanilla.*;

public class Main implements ModInitializer {
    public static final String ID = "horde-resource-crops";

    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }

    @Override
    public void onInitialize() {
        T0__essence.registerModItems();
        T0__seeds.registerModItems();
        T0__crops.registerModBlocks();
        T1__essence.registerModItems();
        T1__seeds.registerModItems();
        T1__crops.registerModBlocks();
    }
}