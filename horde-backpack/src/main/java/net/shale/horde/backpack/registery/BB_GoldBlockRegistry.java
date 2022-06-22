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
import net.shale.horde.backpack.block.gold.*;

public class BB_GoldBlockRegistry {
    public static final Block GOLD_BLACK_BLOCK = registerBlock("gold_black_block",
            new BlackBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_BLUE_BLOCK = registerBlock("gold_blue_block",
            new BlueBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_BROWN_BLOCK = registerBlock("gold_brown_block",
            new BrownBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_CYAN_BLOCK = registerBlock("gold_cyan_block",
            new CyanBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_GRAY_BLOCK = registerBlock("gold_gray_block",
            new GrayBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_GREEN_BLOCK = registerBlock("gold_green_block",
            new GreenBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_LIGHT_BLUE_BLOCK = registerBlock("gold_light_blue_block",
            new Light_BlueBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_LIGHT_GRAY_BLOCK = registerBlock("gold_light_gray_block",
            new Light_GrayBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_LIME_BLOCK = registerBlock("gold_lime_block",
            new LimeBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_MAGENTA_BLOCK = registerBlock("gold_magenta_block",
            new MagentaBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_ORANGE_BLOCK = registerBlock("gold_orange_block",
            new OrangeBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_PINK_BLOCK = registerBlock("gold_pink_block",
            new PinkBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_PURPLE_BLOCK = registerBlock("gold_purple_block",
            new PurpleBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_RED_BLOCK = registerBlock("gold_red_block",
            new RedBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_WHITE_BLOCK = registerBlock("gold_white_block",
            new WhiteBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block GOLD_YELLOW_BLOCK = registerBlock("gold_yellow_block",
            new YellowBlockGold(FabricBlockSettings.copyOf(Blocks.CHEST)));

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