package net.shale.horde.resource.crops.item.other;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.item.item_group;

public class gemstones {
    public static final Item CATALYST = registerItem("gemstones/catalyst", new Item(new FabricItemSettings()
            .group(item_group.MISC)));
    public static final Item TIER0 = registerItem("gemstones/bloodstone", new Item(new FabricItemSettings()
            .group(item_group.MISC)));
    public static final Item TIER1 = registerItem("gemstones/rhodonite", new Item(new FabricItemSettings()
            .group(item_group.MISC)));
    public static final Item TIER2 = registerItem("gemstones/aventurine", new Item(new FabricItemSettings()
            .group(item_group.MISC)));
    public static final Item TIER3 = registerItem("gemstones/aragonite", new Item(new FabricItemSettings()
            .group(item_group.MISC)));
    public static final Item TIER4 = registerItem("gemstones/spinel", new Item(new FabricItemSettings()
            .group(item_group.MISC)));
    public static final Item TIER5 = registerItem("gemstones/larimar", new Item(new FabricItemSettings()
            .group(item_group.MISC)));
    public static final Item TIER6 = registerItem("gemstones/chaorite", new Item(new FabricItemSettings()
            .group(item_group.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
