package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;

public class T6__essence {
    public static final Item ESSENCE_DRAGON_EGG = registerItem("vanilla/essence_dragon_egg", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item ESSENCE_NETHER_STAR = registerItem("vanilla/essence_nether_star", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item ESSENCE_NETHERITE = registerItem("vanilla/essence_netherite", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item ESSENCE_SHULKER = registerItem("vanilla/essence_shulker", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
