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

public class T3__crops {
    public static final Block CROP_CORAL = registerBlockWithoutBlockItem("vanilla/crop_coral",
            new T3_coral_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_CREEPER = registerBlockWithoutBlockItem("vanilla/crop_creeper",
            new T3_creeper_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_HONEY = registerBlockWithoutBlockItem("vanilla/crop_honey",
            new T3_honey_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_LAPIS = registerBlockWithoutBlockItem("vanilla/crop_lapis",
            new T3_lapis_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_RABBIT = registerBlockWithoutBlockItem("vanilla/crop_rabbit",
            new T3_rabbit_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_SHEEP = registerBlockWithoutBlockItem("vanilla/crop_sheep",
            new T3_sheep_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_SKELETON = registerBlockWithoutBlockItem("vanilla/crop_skeleton",
            new T3_skeleton_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_SLIME = registerBlockWithoutBlockItem("vanilla/crop_slime",
            new T3_slime_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_SPIDER = registerBlockWithoutBlockItem("vanilla/crop_spider",
            new T3_spider_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_SQUID = registerBlockWithoutBlockItem("vanilla/crop_squid",
            new T3_squid_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_TURTLE = registerBlockWithoutBlockItem("vanilla/crop_turtle",
            new T3_turtle_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_ZOMBIE = registerBlockWithoutBlockItem("vanilla/crop_zombie",
            new T3_zombie_crop(FabricBlockSettings
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
