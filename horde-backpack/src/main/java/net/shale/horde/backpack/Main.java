package net.shale.horde.backpack;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.shale.horde.backpack.registery.*;
import net.shale.horde.backpack.render.BackpackRenderer;

public class Main implements ModInitializer {
    public static final String ID = "horde-backpack";
    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }
    public static final ItemGroup BAG = FabricItemGroupBuilder.build(new Identifier(ID, "bag"),
            () -> new ItemStack(Items.BUNDLE));
    @Override
    public void onInitialize() {
        BB_LeatherItemRegistry.registerModItems();
        BB_LeatherBlockRegistry.registerBlock();
        BB_CopperItemRegistry.registerModItems();
        BB_CopperBlockRegistry.registerBlock();
        BB_IronItemRegistry.registerModItems();
        BB_IronBlockRegistry.registerBlock();
        BB_GoldItemRegistry.registerModItems();
        BB_GoldBlockRegistry.registerBlock();
        BB_DiamondItemRegistry.registerModItems();
        BB_DiamondBlockRegistry.registerBlock();
        BB_NetheriteItemRegistry.registerModItems();
        BB_NetheriteBlockRegistry.registerBlock();

        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_BLACK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_BROWN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_CYAN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_GREEN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_LIGHT_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_LIGHT_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_LIME_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_MAGENTA_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_ORANGE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_PINK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_PURPLE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_RED_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_WHITE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_LeatherItemRegistry.LEATHER_YELLOW_ITEM);

        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_BLACK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_BROWN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_CYAN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_GREEN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_LIGHT_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_LIGHT_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_LIME_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_MAGENTA_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_ORANGE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_PINK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_PURPLE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_RED_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_WHITE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_CopperItemRegistry.COPPER_YELLOW_ITEM);

        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_BLACK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_BROWN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_CYAN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_GREEN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_LIGHT_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_LIGHT_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_LIME_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_MAGENTA_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_ORANGE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_PINK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_PURPLE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_RED_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_WHITE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_IronItemRegistry.IRON_YELLOW_ITEM);

        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_BLACK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_BROWN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_CYAN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_GREEN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_LIGHT_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_LIGHT_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_LIME_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_MAGENTA_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_ORANGE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_PINK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_PURPLE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_RED_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_WHITE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_GoldItemRegistry.GOLD_YELLOW_ITEM);

        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_BLACK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_BROWN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_CYAN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_GREEN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_LIGHT_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_LIGHT_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_LIME_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_MAGENTA_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_ORANGE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_PINK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_PURPLE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_RED_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_WHITE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_DiamondItemRegistry.DIAMOND_YELLOW_ITEM);

        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_BLACK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_BROWN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_CYAN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_GREEN_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_LIGHT_BLUE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_LIGHT_GRAY_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_LIME_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_MAGENTA_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_ORANGE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_PINK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_PURPLE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_RED_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_WHITE_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BB_NetheriteItemRegistry.NETHERITE_YELLOW_ITEM);
    }
}
