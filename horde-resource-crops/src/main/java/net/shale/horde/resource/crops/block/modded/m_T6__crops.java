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

public class m_T6__crops {
    public static final Block CROP_AETERNIUM = registerBlockWithoutBlockItem("modded/crop_aeternium",
            new m_T6_aeternium_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_REFINED_RADIANCE = registerBlockWithoutBlockItem("modded/crop_refined_radiance",
            new m_T6_refined_radiance_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_SHADOW_STEEL = registerBlockWithoutBlockItem("modded/crop_shadow_steel",
            new m_T6_shadow_steel_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_GOBBER = registerBlockWithoutBlockItem("modded/crop_gobber",
            new m_T6_gobber_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_GOBBER_NETHER = registerBlockWithoutBlockItem("modded/crop_gobber_nether",
            new m_T6_gobber_nether_crop(FabricBlockSettings.copy(Blocks.WHEAT)
            ));
    public static final Block CROP_GOBBER_END = registerBlockWithoutBlockItem("modded/crop_gobber_end",
            new m_T6_gobber_nether_crop(FabricBlockSettings.copy(Blocks.WHEAT)
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