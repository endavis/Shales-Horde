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

public class m_T2__crops {
    public static final Block CROP_ALUMINUM = registerBlockWithoutBlockItem("modded/crop_aluminum",
            new m_T2_aluminum_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_LIGNITE = registerBlockWithoutBlockItem("modded/crop_lignite",
            new m_T2_lignite_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_RUBBER = registerBlockWithoutBlockItem("modded/crop_rubber",
            new m_T2_rubber_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_SILICON = registerBlockWithoutBlockItem("modded/crop_silicon",
            new m_T2_silicon_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_SULFUR = registerBlockWithoutBlockItem("modded/crop_sulfur",
            new m_T2_sulfur_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_THALLASIUM = registerBlockWithoutBlockItem("modded/crop_thallasium",
            new m_T2_thallasium_crop(FabricBlockSettings.copy(Blocks.WHEAT)
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