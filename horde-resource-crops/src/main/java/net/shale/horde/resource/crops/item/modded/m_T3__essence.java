package net.shale.horde.resource.crops.item.modded;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.item.item_group;

public class m_T3__essence {
    public static final Item ESSENCE_BRASS = registerItem("modded/essence_brass", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_BRONZE = registerItem("modded/essence_bronze", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_CERTUS = registerItem("modded/essence_certus", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_CINCINNASITE = registerItem("modded/essence_cincinnasite", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_LEAD = registerItem("modded/essence_lead", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_NIKOLITE = registerItem("modded/essence_nikolite", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_REFINED_IRON = registerItem("modded/essence_refined_iron", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_SILVER = registerItem("modded/essence_silver", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_TIN = registerItem("modded/essence_tin", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_ZINC = registerItem("modded/essence_zinc", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
