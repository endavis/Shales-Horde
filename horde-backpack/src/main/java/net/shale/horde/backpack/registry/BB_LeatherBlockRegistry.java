package net.shale.horde.backpack.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.block.leather.*;

public class BB_LeatherBlockRegistry {
    public static final Block LEATHER_BLACK_BLOCK = registerBlock("leather_black_block",
            new BlackBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_BLUE_BLOCK = registerBlock("leather_blue_block",
            new BlueBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_BROWN_BLOCK = registerBlock("leather_brown_block",
            new BrownBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_CYAN_BLOCK = registerBlock("leather_cyan_block",
            new CyanBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_GRAY_BLOCK = registerBlock("leather_gray_block",
            new GrayBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_GREEN_BLOCK = registerBlock("leather_green_block",
            new GreenBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_LIGHT_BLUE_BLOCK = registerBlock("leather_light_blue_block",
            new Light_BlueBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_LIGHT_GRAY_BLOCK = registerBlock("leather_light_gray_block",
            new Light_GrayBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_LIME_BLOCK = registerBlock("leather_lime_block",
            new LimeBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_MAGENTA_BLOCK = registerBlock("leather_magenta_block",
            new MagentaBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_ORANGE_BLOCK = registerBlock("leather_orange_block",
            new OrangeBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_PINK_BLOCK = registerBlock("leather_pink_block",
            new PinkBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_PURPLE_BLOCK = registerBlock("leather_purple_block",
            new PurpleBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_RED_BLOCK = registerBlock("leather_red_block",
            new RedBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_WHITE_BLOCK = registerBlock("leather_white_block",
            new WhiteBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block LEATHER_YELLOW_BLOCK = registerBlock("leather_yellow_block",
            new YellowBlockLeather(FabricBlockSettings.copyOf(Blocks.CHEST)));

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