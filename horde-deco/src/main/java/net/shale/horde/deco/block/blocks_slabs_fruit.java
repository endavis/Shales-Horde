package net.shale.horde.deco.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.deco.Main;

public class blocks_slabs_fruit {
    public static final Block MELON_SLAB = registerBlock("slabs/melon_slab",
            new SlabBlock(FabricBlockSettings.of(Material.GOURD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block PUMPKIN_SLAB = registerBlock("slabs/pumpkin_slab",
            new SlabBlock(FabricBlockSettings.of(Material.GOURD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block APPLE_SLAB = registerBlock("slabs/apple_slab",
            new SlabBlock(FabricBlockSettings.of(Material.GOURD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block APPLE_GREEN_SLAB = registerBlock("slabs/apple_green_slab",
            new SlabBlock(FabricBlockSettings.of(Material.GOURD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block CAKE_SLAB = registerBlock("slabs/cake_slab",
            new SlabBlock(FabricBlockSettings.of(Material.GOURD)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block BANANA_SLAB = registerBlock("slabs/banana_slab",
            new SlabBlock(FabricBlockSettings.of(Material.GOURD).requiresTool().strength(2.0F, 6.0F)));
    
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

    public static void registerBlocks() {

    }
}
