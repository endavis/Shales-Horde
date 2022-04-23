package net.shale.horde.resourcecrops.block.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resourcecrops.Main;

public class T4__crops {
    public static final Block CROP_DYE = registerBlockWithoutBlockItem("vanilla/crop_dye",
            new T4_dye_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_EMERALD = registerBlockWithoutBlockItem("vanilla/crop_emerald",
            new T4_emerald_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_ENDERMAN = registerBlockWithoutBlockItem("vanilla/crop_enderman",
            new T4_enderman_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_EXPERIENCE = registerBlockWithoutBlockItem("vanilla/crop_experience",
            new T4_experience_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_GOLD = registerBlockWithoutBlockItem("vanilla/crop_gold",
            new T4_gold_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_NATURE = registerBlockWithoutBlockItem("vanilla/crop_nature",
            new T4_nature_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_OBSIDIAN = registerBlockWithoutBlockItem("vanilla/crop_obsidian",
            new T4_obsidian_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_PRISMARINE = registerBlockWithoutBlockItem("vanilla/crop_prismarine",
            new T4_prismarine_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_REDSTONE = registerBlockWithoutBlockItem("vanilla/crop_redstone",
            new T4_redstone_crop(FabricBlockSettings
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
