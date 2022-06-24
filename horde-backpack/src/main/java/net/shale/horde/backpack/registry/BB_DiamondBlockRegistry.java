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
import net.shale.horde.backpack.block.diamond.*;

public class BB_DiamondBlockRegistry {
    public static final Block DIAMOND_BLACK_BLOCK = registerBlock("diamond_black_block",
            new BlackBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_BLUE_BLOCK = registerBlock("diamond_blue_block",
            new BlueBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_BROWN_BLOCK = registerBlock("diamond_brown_block",
            new BrownBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_CYAN_BLOCK = registerBlock("diamond_cyan_block",
            new CyanBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_GRAY_BLOCK = registerBlock("diamond_gray_block",
            new GrayBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_GREEN_BLOCK = registerBlock("diamond_green_block",
            new GreenBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_LIGHT_BLUE_BLOCK = registerBlock("diamond_light_blue_block",
            new Light_BlueBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_LIGHT_GRAY_BLOCK = registerBlock("diamond_light_gray_block",
            new Light_GrayBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_LIME_BLOCK = registerBlock("diamond_lime_block",
            new LimeBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_MAGENTA_BLOCK = registerBlock("diamond_magenta_block",
            new MagentaBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_ORANGE_BLOCK = registerBlock("diamond_orange_block",
            new OrangeBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_PINK_BLOCK = registerBlock("diamond_pink_block",
            new PinkBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_PURPLE_BLOCK = registerBlock("diamond_purple_block",
            new PurpleBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_RED_BLOCK = registerBlock("diamond_red_block",
            new RedBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_WHITE_BLOCK = registerBlock("diamond_white_block",
            new WhiteBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DIAMOND_YELLOW_BLOCK = registerBlock("diamond_yellow_block",
            new YellowBlockDiamond(FabricBlockSettings.copyOf(Blocks.CHEST)));

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