package net.shale.horde.resource.crops.item.other;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.item.item_group;

public class items {
    public static final Item BLANK_DISC = registerItem("other/blank_disc", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item WITHERED_BONE = registerItem("other/withered_bone", new Item(new FabricItemSettings()
            .group(item_group.ORES)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
