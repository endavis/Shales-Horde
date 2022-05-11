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

public class m_T3__crops {
    public static final Block CROP_BRASS = registerBlockWithoutBlockItem("modded/crop_brass",
            new m_T3_brass_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_BRONZE = registerBlockWithoutBlockItem("modded/crop_bronze",
            new m_T3_bronze_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_CERTUS = registerBlockWithoutBlockItem("modded/crop_certus",
            new m_T3_certus_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_CINCINNASITE = registerBlockWithoutBlockItem("modded/crop_cincinnasite",
            new m_T3_cincinnasite_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_LEAD = registerBlockWithoutBlockItem("modded/crop_lead",
            new m_T3_lead_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_NIKOLITE = registerBlockWithoutBlockItem("modded/crop_nikolite",
            new m_T3_nikolite_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_REFINED_IRON = registerBlockWithoutBlockItem("modded/crop_refined_iron",
            new m_T3_refined_iron_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_SILVER = registerBlockWithoutBlockItem("modded/crop_silver",
            new m_T3_silver_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_TIN = registerBlockWithoutBlockItem("modded/crop_tin",
            new m_T3_tin_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_ZINC = registerBlockWithoutBlockItem("modded/crop_zinc",
            new m_T3_zinc_crop(FabricBlockSettings.copy(Blocks.WHEAT)
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