package net.shale.horde.deco.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.deco.Main;

public class blocks_slabs_logs {
    public static final Block LOG_OAK = registerBlock("slabs/log_oak",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_STRIPPED_OAK = registerBlock("slabs/log_stripped_oak",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_OAK_SPLIT = registerBlock("slabs/log_oak_split",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_DARK_OAK = registerBlock("slabs/log_dark_oak",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_STRIPPED_DARK_OAK = registerBlock("slabs/log_stripped_dark_oak",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_DARK_OAK_SPLIT = registerBlock("slabs/log_dark_oak_split",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_BIRCH = registerBlock("slabs/log_birch",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_STRIPPED_BIRCH = registerBlock("slabs/log_stripped_birch",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_BIRCH_SPLIT = registerBlock("slabs/log_birch_split",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_JUNGLE = registerBlock("slabs/log_jungle",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_STRIPPED_JUNGLE = registerBlock("slabs/log_stripped_jungle",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_JUNGLE_SPLIT = registerBlock("slabs/log_jungle_split",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_ACACIA = registerBlock("slabs/log_acacia",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_STRIPPED_ACACIA = registerBlock("slabs/log_stripped_acacia",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_ACACIA_SPLIT = registerBlock("slabs/log_acacia_split",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_SPRUCE = registerBlock("slabs/log_spruce",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_STRIPPED_SPRUCE = registerBlock("slabs/log_stripped_spruce",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_SPRUCE_SPLIT = registerBlock("slabs/log_spruce_split",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_CRIMSON = registerBlock("slabs/log_crimson",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_STRIPPED_CRIMSON = registerBlock("slabs/log_stripped_crimson",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_CRIMSON_SPLIT = registerBlock("slabs/log_crimson_split",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_WARPED = registerBlock("slabs/log_warped",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_STRIPPED_WARPED = registerBlock("slabs/log_stripped_warped",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block LOG_WARPED_SPLIT = registerBlock("slabs/log_warped_split",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
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
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

    public static void registerBlocks() {

    }
}
