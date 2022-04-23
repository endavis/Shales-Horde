package net.shale.horde.resourcecrops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resourcecrops.Main;

public class T1__essence {
    public static final Item ESSENCE_DIRT = registerItem("vanilla/essence_dirt", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item ESSENCE_ICE = registerItem("vanilla/essence_ice", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item ESSENCE_STONE = registerItem("vanilla/essence_stone", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item ESSENCE_WOOD = registerItem("vanilla/essence_wood", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
