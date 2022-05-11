package net.shale.horde.resource.crops.item.modded;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.item.item_group;

public class m_T4__essence {
    public static final Item ESSENCE_CHROME = registerItem("modded/essence_chrome", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_ELECTRUM = registerItem("modded/essence_electrum", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_FLUIX = registerItem("modded/essence_fluix", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_INVAR = registerItem("modded/essence_invar", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_NICKEL = registerItem("modded/essence_nickel", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_PERIDOT = registerItem("modded/essence_peridot", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_RUBY = registerItem("modded/essence_ruby", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_SAPPHIRE = registerItem("modded/essence_sapphire", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_STEEL = registerItem("modded/essence_steel", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_TITANIUM = registerItem("modded/essence_titanium", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_TUNGSTEN = registerItem("modded/essence_tungsten", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
