package net.shale.horde.resource.crops.item.modded;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.item.item_group;

public class m_T2__essence {
    public static final Item ESSENCE_ALUMINUM = registerItem("modded/essence_aluminum", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_LIGNITE = registerItem("modded/essence_lignite", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_RUBBER = registerItem("modded/essence_rubber", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_SILICON = registerItem("modded/essence_silicon", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_SULFUR = registerItem("modded/essence_sulfur", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_THALLASIUM = registerItem("modded/essence_thallasium", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
