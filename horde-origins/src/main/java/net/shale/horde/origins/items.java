package net.shale.horde.origins;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class items {
    public static final Item GOGGLES =
            registerItem("goggles",
                    new Item(new FabricItemSettings()
                            .group(ItemGroup.COMBAT)));
    public static final Item GOGGLES_TRINKET = 
            registerItem("goggles_trinket",
                    new Item(new FabricItemSettings()
            .group(ItemGroup.COMBAT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
