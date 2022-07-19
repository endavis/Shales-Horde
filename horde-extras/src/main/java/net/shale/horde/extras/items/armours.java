package net.shale.horde.extras.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.extras.Main;

public class armours {
    public static final Item NETHERITE_HORSE_ARMOR = registerItem("netherite_horse_armor",
            new HorseArmorItem(15, "netherite", new FabricItemSettings().fireproof().maxCount(1)
            .group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
