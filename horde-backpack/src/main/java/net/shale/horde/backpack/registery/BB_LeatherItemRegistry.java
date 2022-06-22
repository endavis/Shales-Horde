package net.shale.horde.backpack.registery;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.item.*;
import net.shale.horde.backpack.item.leather.*;

public class BB_LeatherItemRegistry {
    public static final Item LEATHER_BLACK_ITEM = registerItem("leather_black_item", new
            BlackItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_BLUE_ITEM = registerItem("leather_blue_item", new
            BlueItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_BROWN_ITEM = registerItem("leather_brown_item", new
            BrownItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_CYAN_ITEM = registerItem("leather_cyan_item", new
            CyanItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_GRAY_ITEM = registerItem("leather_gray_item", new
            GrayItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_GREEN_ITEM = registerItem("leather_green_item", new
            GreenItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_LIGHT_BLUE_ITEM = registerItem("leather_light_blue_item", new
            Light_BlueItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_LIGHT_GRAY_ITEM = registerItem("leather_light_gray_item", new
            Light_GrayItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_LIME_ITEM = registerItem("leather_lime_item", new
            LimeItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_MAGENTA_ITEM = registerItem("leather_magenta_item", new
            MagentaItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_ORANGE_ITEM = registerItem("leather_orange_item", new
            OrangeItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_PINK_ITEM = registerItem("leather_pink_item", new
            PinkItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_PURPLE_ITEM = registerItem("leather_purple_item", new
            PurpleItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_RED_ITEM = registerItem("leather_red_item", new
            RedItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_WHITE_ITEM = registerItem("leather_white_item", new
            WhiteItemLeather(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item LEATHER_YELLOW_ITEM = registerItem("leather_yellow_item", new
            YellowItemLeather(new FabricItemSettings().group(Main.BAG)
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}