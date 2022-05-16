package net.shale.horde.deco;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.shale.horde.deco.block.blocks_nature;

public class Main implements ModInitializer {
    public static final String ID = "horde-deco";

    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }

    @Override
    public void onInitialize() {
        blocks_nature.registerBlock();

    }
}