package net.shale.horde.backpack.registery;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.item.*;
import net.shale.horde.backpack.item.copper.*;

public class BB_CopperItemRegistry {
    public static final Item COPPER_BLACK_ITEM = registerItem("copper_black_item", new
            BlackItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_BLUE_ITEM = registerItem("copper_blue_item", new
            BlueItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_BROWN_ITEM = registerItem("copper_brown_item", new
            BrownItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_CYAN_ITEM = registerItem("copper_cyan_item", new
            CyanItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_GRAY_ITEM = registerItem("copper_gray_item", new
            GrayItemCopper(new FabricItemSettings().group(Main.BAG).group(Main.BAG)
    ));
    public static final Item COPPER_GREEN_ITEM = registerItem("copper_green_item", new
            GreenItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_LIGHT_BLUE_ITEM = registerItem("copper_light_blue_item", new
            Light_BlueItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_LIGHT_GRAY_ITEM = registerItem("copper_light_gray_item", new
            Light_GrayItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_LIME_ITEM = registerItem("copper_lime_item", new
            LimeItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_MAGENTA_ITEM = registerItem("copper_magenta_item", new
            MagentaItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_ORANGE_ITEM = registerItem("copper_orange_item", new
            OrangeItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_PINK_ITEM = registerItem("copper_pink_item", new
            PinkItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_PURPLE_ITEM = registerItem("copper_purple_item", new
            PurpleItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_RED_ITEM = registerItem("copper_red_item", new
            RedItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_WHITE_ITEM = registerItem("copper_white_item", new
            WhiteItemCopper(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item COPPER_YELLOW_ITEM = registerItem("copper_yellow_item", new
            YellowItemCopper(new FabricItemSettings().group(Main.BAG)
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}