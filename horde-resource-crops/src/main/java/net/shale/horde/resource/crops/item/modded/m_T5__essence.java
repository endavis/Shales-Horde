package net.shale.horde.resource.crops.item.modded;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.item.item_group;

public class m_T5__essence {
    public static final Item ESSENCE_ANTIMONY = registerItem("modded/essence_antimony", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_IRIDIUM = registerItem("modded/essence_iridium", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_PLATINUM = registerItem("modded/essence_platinum", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_TERMINITE = registerItem("modded/essence_terminite", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_URANIUM = registerItem("modded/essence_uranium", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
