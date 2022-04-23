package net.shale.horde.resource.crops.block.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;

public class T5__crops {
    public static final Block CROP_BLAZE = registerBlockWithoutBlockItem("vanilla/crop_blaze",
            new T5_blaze_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_DIAMOND = registerBlockWithoutBlockItem("vanilla/crop_diamond",
            new T5_diamond_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_END = registerBlockWithoutBlockItem("vanilla/crop_end",
            new T5_end_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_GHAST = registerBlockWithoutBlockItem("vanilla/crop_ghast",
            new T5_ghast_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_GLOWSTONE = registerBlockWithoutBlockItem("vanilla/crop_glowstone",
            new T5_glowstone_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_NETHER = registerBlockWithoutBlockItem("vanilla/crop_nether",
            new T5_nether_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_NETHER_QUARTZ = registerBlockWithoutBlockItem("vanilla/crop_nether_quartz",
            new T5_nether_quartz_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_WITHER_SKELETON = registerBlockWithoutBlockItem("vanilla/crop_wither_skeleton",
            new T5_wither_skeleton_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
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
                new FabricItemSettings().group(ItemGroup.FOOD)));
    }

    public static void registerModBlocks() {
    }
}
