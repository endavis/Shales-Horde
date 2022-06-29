package net.shale.horde.resource.crops.block.modded;

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

public class m_T5__crops {
    public static final Block CROP_ANTIMONY = registerBlockWithoutBlockItem("modded/crop_antimony",
            new m_T5_antimony_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_IRIDIUM = registerBlockWithoutBlockItem("modded/crop_iridium",
            new m_T5_iridium_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_PLATINUM = registerBlockWithoutBlockItem("modded/crop_platinum",
            new m_T5_platinum_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_TERMINITE = registerBlockWithoutBlockItem("modded/crop_terminite",
            new m_T5_terminite_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_URANIUM = registerBlockWithoutBlockItem("modded/crop_uranium",
            new m_T5_uranium_crop(FabricBlockSettings.copy(Blocks.WHEAT)
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