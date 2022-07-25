package net.shale.horde.resource.crops.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.custom.Farmland_Test;
import net.shale.horde.resource.crops.block.custom.recycler_block;
import net.shale.horde.resource.crops.item.item_group;

public class farmlands {
    public static final Block RHODONITE_FARMLAND = registerBlock("rhodonite_farmland",
            new Farmland_Test(FabricBlockSettings.of(Material.SOIL)
                    .strength(4.0f).nonOpaque()
            ));
    public static final Block AVENTURINE_FARMLAND = registerBlock("aventurine_farmland",
            new Farmland_Test(FabricBlockSettings.of(Material.SOIL)
                    .strength(4.0f).nonOpaque()
            ));
    public static final Block ARAGONITE_FARMLAND = registerBlock("aragonite_farmland",
            new Farmland_Test(FabricBlockSettings.of(Material.SOIL)
                    .strength(4.0f).nonOpaque()
            ));
    public static final Block SPINEL_FARMLAND = registerBlock("spinel_farmland",
            new Farmland_Test(FabricBlockSettings.of(Material.SOIL)
                    .strength(4.0f).nonOpaque()
            ));
    public static final Block LARIMAR_FARMLAND = registerBlock("larimar_farmland",
            new Farmland_Test(FabricBlockSettings.of(Material.SOIL)
                    .strength(4.0f).nonOpaque()
            ));
    public static final Block CHAROITE_FARMLAND = registerBlock("charoite_farmland",
            new Farmland_Test(FabricBlockSettings.of(Material.SOIL)
                    .strength(4.0f).nonOpaque()
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
                new FabricItemSettings().group(item_group.ORES)));
    }

    public static void registerBlock() {

    }
}
