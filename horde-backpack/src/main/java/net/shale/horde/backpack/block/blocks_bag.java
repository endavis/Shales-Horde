package net.shale.horde.backpack.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Backpack;
import net.shale.horde.backpack.block.custom.BackpackBaseBlock;

public class blocks_bag {
    public static final Block BACKPACK_BASE = registerBlock("backpack/backpack_base",
            new BackpackBaseBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(6.0f)
                    .requiresTool()
                    .nonOpaque()
            ));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Backpack.ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Backpack.ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Backpack.ID, name), new BlockItem(block,
                new FabricItemSettings()));

    }

    public static void registerBlock() {

    }
}
