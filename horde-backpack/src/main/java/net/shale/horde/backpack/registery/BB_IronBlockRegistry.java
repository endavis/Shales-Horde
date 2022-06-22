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
import net.shale.horde.backpack.block.iron.*;

public class BB_IronBlockRegistry {
    public static final Block IRON_BLACK_BLOCK = registerBlock("iron_black_block",
            new BlackBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_BLUE_BLOCK = registerBlock("iron_blue_block",
            new BlueBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_BROWN_BLOCK = registerBlock("iron_brown_block",
            new BrownBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_CYAN_BLOCK = registerBlock("iron_cyan_block",
            new CyanBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_GRAY_BLOCK = registerBlock("iron_gray_block",
            new GrayBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_GREEN_BLOCK = registerBlock("iron_green_block",
            new GreenBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_LIGHT_BLUE_BLOCK = registerBlock("iron_light_blue_block",
            new Light_BlueBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_LIGHT_GRAY_BLOCK = registerBlock("iron_light_gray_block",
            new Light_GrayBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_LIME_BLOCK = registerBlock("iron_lime_block",
            new LimeBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_MAGENTA_BLOCK = registerBlock("iron_magenta_block",
            new MagentaBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_ORANGE_BLOCK = registerBlock("iron_orange_block",
            new OrangeBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_PINK_BLOCK = registerBlock("iron_pink_block",
            new PinkBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_PURPLE_BLOCK = registerBlock("iron_purple_block",
            new PurpleBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_RED_BLOCK = registerBlock("iron_red_block",
            new RedBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_WHITE_BLOCK = registerBlock("iron_white_block",
            new WhiteBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block IRON_YELLOW_BLOCK = registerBlock("iron_yellow_block",
            new YellowBlockIron(FabricBlockSettings.copyOf(Blocks.CHEST)));

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