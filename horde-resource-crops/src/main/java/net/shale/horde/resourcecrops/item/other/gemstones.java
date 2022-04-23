package net.shale.horde.resourcecrops.item.other;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resourcecrops.Main;

public class gemstones {
    public static final Item CATALYST = registerItem("other/catalyst", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static final Item TIER0 = registerItem("other/bloodstone", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static final Item TIER1 = registerItem("other/rhodonite", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static final Item TIER2 = registerItem("other/aventurine", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static final Item TIER3 = registerItem("other/aragonite", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static final Item TIER4 = registerItem("other/spinel", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static final Item TIER5 = registerItem("other/larimar", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static final Item TIER6 = registerItem("other/chaorite", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
