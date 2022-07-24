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

public class entities {
    public static final Block RECYCLER = registerBlock("recycler",
            new recycler_block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
            ));
    public static final Block FARMLANDTEST = registerBlock("farmland_test",
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
