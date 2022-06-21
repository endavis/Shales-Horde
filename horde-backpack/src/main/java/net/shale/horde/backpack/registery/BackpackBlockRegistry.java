package net.shale.horde.backpack.registery;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.block.*;

public class BackpackBlockRegistry {
    public static final Block LEATHER_BACKPACK_BLOCK = registerBlock("leather_backpack_block",
            new BackpackBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)
                    .strength(4.0f)
                    .nonOpaque()
            ));
    public static final Block COPPER_BACKPACK_BLOCK = registerBlock("copper_backpack_block",
            new BackpackBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)
                    .strength(4.0f)
                    .nonOpaque()
            ));
    public static final Block IRON_BACKPACK_BLOCK = registerBlock("iron_backpack_block",
            new BackpackBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)
                    .strength(4.0f)
                    .nonOpaque()
            ));
    public static final Block GOLD_BACKPACK_BLOCK = registerBlock("gold_backpack_block",
            new BackpackBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)
                    .strength(4.0f)
                    .nonOpaque()
            ));
    public static final Block DIAMOND_BACKPACK_BLOCK = registerBlock("diamond_backpack_block",
            new BackpackBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)
                    .strength(4.0f)
                    .nonOpaque()
            ));
    public static final Block NETHERITE_BACKPACK_BLOCK = registerBlock("netherite_backpack_block",
            new BackpackBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)
                    .strength(4.0f)
                    .nonOpaque()
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
                new FabricItemSettings()));
    }

    public static void registerBlock() {

    }

    public static void registerModItems() {
    }
}