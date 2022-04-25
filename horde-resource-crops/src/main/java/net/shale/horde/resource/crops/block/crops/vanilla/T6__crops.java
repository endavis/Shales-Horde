package net.shale.horde.resource.crops.block.crops.vanilla;

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

public class T6__crops {
    public static final Block CROP_DRAGON_EGG = registerBlockWithoutBlockItem("vanilla/crop_dragon_egg",
            new T6_dragon_egg_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_NETHER_STAR = registerBlockWithoutBlockItem("vanilla/crop_nether_star",
            new T6_nether_star_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_NETHERITE = registerBlockWithoutBlockItem("vanilla/crop_netherite",
            new T6_netherite_crop(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .noCollision()
            ));
    public static final Block CROP_SHULKER = registerBlockWithoutBlockItem("vanilla/crop_shulker",
            new T6_shulker_crop(FabricBlockSettings
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
