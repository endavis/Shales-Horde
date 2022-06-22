package net.shale.horde.backpack.registery;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.item.*;
import net.shale.horde.backpack.item.iron.*;

public class BB_IronItemRegistry {
    public static final Item IRON_BLACK_ITEM = registerItem("iron_black_item", new
            BlackItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_BLUE_ITEM = registerItem("iron_blue_item", new
            BlueItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_BROWN_ITEM = registerItem("iron_brown_item", new
            BrownItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_CYAN_ITEM = registerItem("iron_cyan_item", new
            CyanItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_GRAY_ITEM = registerItem("iron_gray_item", new
            GrayItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_GREEN_ITEM = registerItem("iron_green_item", new
            GreenItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_LIGHT_BLUE_ITEM = registerItem("iron_light_blue_item", new
            Light_BlueItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_LIGHT_GRAY_ITEM = registerItem("iron_light_gray_item", new
            Light_GrayItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_LIME_ITEM = registerItem("iron_lime_item", new
            LimeItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_MAGENTA_ITEM = registerItem("iron_magenta_item", new
            MagentaItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_ORANGE_ITEM = registerItem("iron_orange_item", new
            OrangeItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_PINK_ITEM = registerItem("iron_pink_item", new
            PinkItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_PURPLE_ITEM = registerItem("iron_purple_item", new
            PurpleItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_RED_ITEM = registerItem("iron_red_item", new
            RedItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_WHITE_ITEM = registerItem("iron_white_item", new
            WhiteItemIron(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item IRON_YELLOW_ITEM = registerItem("iron_yellow_item", new
            YellowItemIron(new FabricItemSettings().group(Main.BAG)
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}