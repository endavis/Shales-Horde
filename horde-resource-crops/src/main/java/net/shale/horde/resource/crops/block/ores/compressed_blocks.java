package net.shale.horde.resource.crops.block.ores;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.item.item_group;

public class compressed_blocks {
    public static final Block DRAGONSTONE_OVERWORLD_BLOCK = registerBlock("compressed/dragonstone_overworld_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block DRAGONSTONE_NETHER_BLOCK = registerBlock("compressed/dragonstone_nether_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block DRAGONSTONE_END_BLOCK = registerBlock("compressed/dragonstone_end_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block BLOODSTONE_BLOCK = registerBlock("compressed/bloodstone_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block RHODONITE_BLOCK = registerBlock("compressed/rhodonite_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block AVENTURINE_BLOCK = registerBlock("compressed/aventurine_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block ARAGONITE_BLOCK = registerBlock("compressed/aragonite_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block SPINEL_BLOCK = registerBlock("compressed/spinel_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block LARIMAR_BLOCK = registerBlock("compressed/larimar_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block CHAROITE_BLOCK = registerBlock("compressed/charoite_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block BISMUTH_BLOCK = registerBlock("compressed/bismuth_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), new BlockItem(block,
                new FabricItemSettings().group(item_group.ORES)));
    }

    public static void registerBlock() {

    }
}
