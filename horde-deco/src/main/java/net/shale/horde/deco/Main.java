package net.shale.horde.deco;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.shale.horde.deco.block.blocks_nature;
import net.shale.horde.deco.block.blocks_pride;
import net.shale.horde.deco.block.blocks_slabs_fruit;
import net.shale.horde.deco.block.blocks_slabs_logs;

public class Main implements ModInitializer {
    public static final String ID = "horde-deco";

    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }

    @Override
    public void onInitialize() {
        blocks_nature.registerBlock();
        blocks_slabs_fruit.registerBlocks();
        blocks_slabs_logs.registerBlocks();
        blocks_pride.registerBlock();
    }
}