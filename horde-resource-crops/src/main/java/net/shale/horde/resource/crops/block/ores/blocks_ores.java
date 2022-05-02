package net.shale.horde.resource.crops.block.ores;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;

public class blocks_ores {
    public static final Block DRAGONSTONE_OVERWORLD_ORE = registerBlock("ores/dragonstone_overworld_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
            ));

    public static final Block DRAGONSTONE_DEEPSLATE_ORE = registerBlock("ores/dragonstone_deepslate_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block DRAGONSTONE_NETHER_ORE = registerBlock("ores/dragonstone_nether_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block DRAGONSTONE_END_ORE = registerBlock("ores/dragonstone_end_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block RHODONITE_OVERWORLD_ORE = registerBlock("ores/rhodonite_overworld_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block RHODONITE_DEEPSLATE_ORE = registerBlock("ores/rhodonite_deepslate_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block RHODONITE_NETHER_ORE = registerBlock("ores/rhodonite_nether_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block RHODONITE_END_ORE = registerBlock("ores/rhodonite_end_ore",
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
                new FabricItemSettings().group(ItemGroup.MISC)));
    }

    public static void registerBlock() {

    }
}
