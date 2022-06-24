package net.shale.horde.backpack.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.item.gold.*;

public class BB_GoldItemRegistry {
    public static final Item GOLD_BLACK_ITEM = registerItem("gold_black_item", new
            BlackItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_BLUE_ITEM = registerItem("gold_blue_item", new
            BlueItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_BROWN_ITEM = registerItem("gold_brown_item", new
            BrownItemGold(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item GOLD_CYAN_ITEM = registerItem("gold_cyan_item", new
            CyanItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_GRAY_ITEM = registerItem("gold_gray_item", new
            GrayItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_GREEN_ITEM = registerItem("gold_green_item", new
            GreenItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_LIGHT_BLUE_ITEM = registerItem("gold_light_blue_item", new
            Light_BlueItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_LIGHT_GRAY_ITEM = registerItem("gold_light_gray_item", new
            Light_GrayItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_LIME_ITEM = registerItem("gold_lime_item", new
            LimeItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_MAGENTA_ITEM = registerItem("gold_magenta_item", new
            MagentaItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_ORANGE_ITEM = registerItem("gold_orange_item", new
            OrangeItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_PINK_ITEM = registerItem("gold_pink_item", new
            PinkItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_PURPLE_ITEM = registerItem("gold_purple_item", new
            PurpleItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_RED_ITEM = registerItem("gold_red_item", new
            RedItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_WHITE_ITEM = registerItem("gold_white_item", new
            WhiteItemGold(new FabricItemSettings()
    ));
    public static final Item GOLD_YELLOW_ITEM = registerItem("gold_yellow_item", new
            YellowItemGold(new FabricItemSettings()
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}