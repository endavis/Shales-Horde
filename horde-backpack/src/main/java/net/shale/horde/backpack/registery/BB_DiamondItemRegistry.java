package net.shale.horde.backpack.registery;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.item.*;
import net.shale.horde.backpack.item.diamond.*;
import net.shale.horde.backpack.item.diamond.*;

public class BB_DiamondItemRegistry {
    public static final Item DIAMOND_BLACK_ITEM = registerItem("diamond_black_item", new
            BlackItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_BLUE_ITEM = registerItem("diamond_blue_item", new
            BlueItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_BROWN_ITEM = registerItem("diamond_brown_item", new
            BrownItemDiamond(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item DIAMOND_CYAN_ITEM = registerItem("diamond_cyan_item", new
            CyanItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_GRAY_ITEM = registerItem("diamond_gray_item", new
            GrayItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_GREEN_ITEM = registerItem("diamond_green_item", new
            GreenItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_LIGHT_BLUE_ITEM = registerItem("diamond_light_blue_item", new
            Light_BlueItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_LIGHT_GRAY_ITEM = registerItem("diamond_light_gray_item", new
            Light_GrayItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_LIME_ITEM = registerItem("diamond_lime_item", new
            LimeItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_MAGENTA_ITEM = registerItem("diamond_magenta_item", new
            MagentaItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_ORANGE_ITEM = registerItem("diamond_orange_item", new
            OrangeItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_PINK_ITEM = registerItem("diamond_pink_item", new
            PinkItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_PURPLE_ITEM = registerItem("diamond_purple_item", new
            PurpleItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_RED_ITEM = registerItem("diamond_red_item", new
            RedItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_WHITE_ITEM = registerItem("diamond_white_item", new
            WhiteItemDiamond(new FabricItemSettings()
    ));
    public static final Item DIAMOND_YELLOW_ITEM = registerItem("diamond_yellow_item", new
            YellowItemDiamond(new FabricItemSettings()
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}