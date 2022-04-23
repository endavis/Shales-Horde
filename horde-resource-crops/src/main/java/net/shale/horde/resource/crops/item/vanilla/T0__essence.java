package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;

public class T0__essence {
    public static final Item ESSENCE_RHODONITE = registerItem("vanilla/essence_rhodonite", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC
            )));
    public static final Item ESSENCE_AIR = registerItem("vanilla/essence_air", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item ESSENCE_EARTH = registerItem("vanilla/essence_earth", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item ESSENCE_FIRE = registerItem("vanilla/essence_fire", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item ESSENCE_WATER = registerItem("vanilla/essence_water", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
