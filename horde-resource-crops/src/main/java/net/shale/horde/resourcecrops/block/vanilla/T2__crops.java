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

public class T2__crops {
    public static final Block CROP_AMETHYST = registerBlockWithoutBlockItem("vanilla/crop_amethyst",
            new T2_amethyst_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_CHICKEN = registerBlockWithoutBlockItem("vanilla/crop_chicken",
            new T2_chicken_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_COAL = registerBlockWithoutBlockItem("vanilla/crop_coal",
            new T2_coal_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_COPPER = registerBlockWithoutBlockItem("vanilla/crop_copper",
            new T2_copper_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_COW = registerBlockWithoutBlockItem("vanilla/crop_cow",
            new T2_cow_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_FISH = registerBlockWithoutBlockItem("vanilla/crop_fish",
            new T2_fish_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_IRON = registerBlockWithoutBlockItem("vanilla/crop_iron",
            new T2_iron_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_PIG = registerBlockWithoutBlockItem("vanilla/crop_pig",
            new T2_pig_crop(FabricBlockSettings
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
