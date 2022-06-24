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
import net.shale.horde.backpack.block.copper.*;

public class BB_CopperBlockRegistry {
    public static final Block COPPER_BLACK_BLOCK = registerBlock("copper_black_block",
            new BlackBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_BLUE_BLOCK = registerBlock("copper_blue_block",
            new BlueBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_BROWN_BLOCK = registerBlock("copper_brown_block",
            new BrownBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_CYAN_BLOCK = registerBlock("copper_cyan_block",
            new CyanBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_GRAY_BLOCK = registerBlock("copper_gray_block",
            new GrayBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_GREEN_BLOCK = registerBlock("copper_green_block",
            new GreenBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_LIGHT_BLUE_BLOCK = registerBlock("copper_light_blue_block",
            new Light_BlueBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_LIGHT_GRAY_BLOCK = registerBlock("copper_light_gray_block",
            new Light_GrayBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_LIME_BLOCK = registerBlock("copper_lime_block",
            new LimeBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_MAGENTA_BLOCK = registerBlock("copper_magenta_block",
            new MagentaBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_ORANGE_BLOCK = registerBlock("copper_orange_block",
            new OrangeBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_PINK_BLOCK = registerBlock("copper_pink_block",
            new PinkBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_PURPLE_BLOCK = registerBlock("copper_purple_block",
            new PurpleBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_RED_BLOCK = registerBlock("copper_red_block",
            new RedBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_WHITE_BLOCK = registerBlock("copper_white_block",
            new WhiteBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block COPPER_YELLOW_BLOCK = registerBlock("copper_yellow_block",
            new YellowBlockCopper(FabricBlockSettings.copyOf(Blocks.CHEST)));

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