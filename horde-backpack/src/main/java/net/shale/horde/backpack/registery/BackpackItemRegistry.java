package net.shale.horde.backpack.registery;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.api.BackpackItem;

public class BackpackItemRegistry {
    public static final Item LEATHER_BACKPACK_ITEM = registerItem("leather_backpack_item", new
            BackpackItem(new FabricItemSettings()
            .maxCount(1)
            .group(Main.BAG)
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}