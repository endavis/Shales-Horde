package net.shale.horde.backpack.registery;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.item.*;
import net.shale.horde.backpack.item.netherite.*;

public class BB_NetheriteItemRegistry {
    public static final Item NETHERITE_BLACK_ITEM = registerItem("netherite_black_item", new
            BlackItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_BLUE_ITEM = registerItem("netherite_blue_item", new
            BlueItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_BROWN_ITEM = registerItem("netherite_brown_item", new
            BrownItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_CYAN_ITEM = registerItem("netherite_cyan_item", new
            CyanItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_GRAY_ITEM = registerItem("netherite_gray_item", new
            GrayItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_GREEN_ITEM = registerItem("netherite_green_item", new
            GreenItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_LIGHT_BLUE_ITEM = registerItem("netherite_light_blue_item", new
            Light_BlueItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_LIGHT_GRAY_ITEM = registerItem("netherite_light_gray_item", new
            Light_GrayItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_LIME_ITEM = registerItem("netherite_lime_item", new
            LimeItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_MAGENTA_ITEM = registerItem("netherite_magenta_item", new
            MagentaItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_ORANGE_ITEM = registerItem("netherite_orange_item", new
            OrangeItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_PINK_ITEM = registerItem("netherite_pink_item", new
            PinkItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_PURPLE_ITEM = registerItem("netherite_purple_item", new
            PurpleItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_RED_ITEM = registerItem("netherite_red_item", new
            RedItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_WHITE_ITEM = registerItem("netherite_white_item", new
            WhiteItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));
    public static final Item NETHERITE_YELLOW_ITEM = registerItem("netherite_yellow_item", new
            YellowItemNetherite(new FabricItemSettings().group(Main.BAG)
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}