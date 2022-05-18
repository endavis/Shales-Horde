package net.shale.horde.deco.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.deco.Main;
import net.shale.horde.deco.block.custom.SideStairsBlock;

public class blocks_side_stairs {
    // Planks
    public static final Block SS_OAK_PLANKS = registerBlock("side-stairs/ss_oak_planks",
            new SideStairsBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()));
    public static final Block SS_SPRUCE_PLANKS = registerBlock("side-stairs/ss_spruce_planks",
            new SideStairsBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()));
    public static final Block SS_BIRCH_PLANKS = registerBlock("side-stairs/ss_birch_planks",
            new SideStairsBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()));
    public static final Block SS_JUNGLE_PLANKS = registerBlock("side-stairs/ss_jungle_planks",
            new SideStairsBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()));
    public static final Block SS_ACAICA_PLANKS = registerBlock("side-stairs/ss_acacia_planks",
            new SideStairsBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()));
    public static final Block SS_DARK_OAK_PLANKS = registerBlock("side-stairs/ss_dark_oak_planks",
            new SideStairsBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()));
    public static final Block SS_CRIMSON_PLANKS = registerBlock("side-stairs/ss_crimson_planks",
            new SideStairsBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()));
    public static final Block SS_WARPED_PLANKS = registerBlock("side-stairs/ss_warped_planks",
            new SideStairsBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()));
    // Stones
    public static final Block SS_STONE = registerBlock("side-stairs/ss_stone",
            new SideStairsBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), new BlockItem(block,
                new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

    }

    public static void registerBlock() {

    }
}
