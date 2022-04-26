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

public class T1__crops {
    public static final Block CROP_DIRT = registerBlockWithoutBlockItem("vanilla/crop_dirt",
            new T1_dirt_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_ICE = registerBlockWithoutBlockItem("vanilla/crop_ice",
            new T1_ice_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_STONE = registerBlockWithoutBlockItem("vanilla/crop_stone",
            new T1_stone_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_WOOD = registerBlockWithoutBlockItem("vanilla/crop_wood",
            new T1_wood_crop(FabricBlockSettings.copy(Blocks.WHEAT)
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
