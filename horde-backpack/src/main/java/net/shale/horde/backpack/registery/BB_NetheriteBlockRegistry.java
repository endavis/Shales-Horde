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
import net.shale.horde.backpack.block.netherite.*;

public class BB_NetheriteBlockRegistry {
    public static final Block NETHERITE_BLACK_BLOCK = registerBlock("netherite_black_block",
            new BlackBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_BLUE_BLOCK = registerBlock("netherite_blue_block",
            new BlueBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_BROWN_BLOCK = registerBlock("netherite_brown_block",
            new BrownBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_CYAN_BLOCK = registerBlock("netherite_cyan_block",
            new CyanBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_GRAY_BLOCK = registerBlock("netherite_gray_block",
            new GrayBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_GREEN_BLOCK = registerBlock("netherite_green_block",
            new GreenBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_LIGHT_BLUE_BLOCK = registerBlock("netherite_light_blue_block",
            new Light_BlueBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_LIGHT_GRAY_BLOCK = registerBlock("netherite_light_gray_block",
            new Light_GrayBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_LIME_BLOCK = registerBlock("netherite_lime_block",
            new LimeBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_MAGENTA_BLOCK = registerBlock("netherite_magenta_block",
            new MagentaBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_ORANGE_BLOCK = registerBlock("netherite_orange_block",
            new OrangeBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_PINK_BLOCK = registerBlock("netherite_pink_block",
            new PinkBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_PURPLE_BLOCK = registerBlock("netherite_purple_block",
            new PurpleBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_RED_BLOCK = registerBlock("netherite_red_block",
            new RedBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_WHITE_BLOCK = registerBlock("netherite_white_block",
            new WhiteBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block NETHERITE_YELLOW_BLOCK = registerBlock("netherite_yellow_block",
            new YellowBlockNetherite(FabricBlockSettings.copyOf(Blocks.CHEST)));

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