package net.shale.horde.deco.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.deco.Main;
import net.shale.horde.deco.block.custom.RotatableBlock;

public class blocks_nature {
    public static final Block MELON_CARVED = registerBlock("melon_carved",
            new RotatableBlock(FabricBlockSettings.of(Material.GOURD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block MELON_LANTERN = registerBlock("melon_lantern",
            new RotatableBlock(FabricBlockSettings.of(Material.GOURD)
                    .strength(4.0f)
                    .requiresTool()
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
                new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

    }

    public static void registerBlock() {

    }
}
