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

public class m_T4__crops {
    public static final Block CROP_CHROME = registerBlockWithoutBlockItem("modded/crop_chrome",
            new m_T4_chrome_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_ELECTRUM = registerBlockWithoutBlockItem("modded/crop_electrum",
            new m_T4_electrum_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_FLUIX = registerBlockWithoutBlockItem("modded/crop_fluix",
            new m_T4_fluix_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_INVAR = registerBlockWithoutBlockItem("modded/crop_invar",
            new m_T4_invar_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_NICKEL = registerBlockWithoutBlockItem("modded/crop_nickel",
            new m_T4_nickel_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_PERIDOT = registerBlockWithoutBlockItem("modded/crop_peridot",
            new m_T4_peridot_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_RUBY = registerBlockWithoutBlockItem("modded/crop_ruby",
            new m_T4_ruby_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_SAPPHIRE = registerBlockWithoutBlockItem("modded/crop_sapphire",
            new m_T4_sapphire_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_STEEL = registerBlockWithoutBlockItem("modded/crop_steel",
            new m_T4_steel_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_TITANIUM = registerBlockWithoutBlockItem("modded/crop_titanium",
            new m_T4_titanium_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_TUNGSTEN = registerBlockWithoutBlockItem("modded/crop_tungsten",
            new m_T4_tungsten_crop(FabricBlockSettings.copy(Blocks.WHEAT)
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