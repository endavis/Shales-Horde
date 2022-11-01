package net.shale.horde.resource.crops.item.modded;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.item.item_group;

public class m_T6__essence {
    public static final Item ESSENCE_AETERNIUM = registerItem("modded/essence_aeternium", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_REFINED_RADIANCE = registerItem("modded/essence_refined_radiance", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_SHADOW_STEEL = registerItem("modded/essence_shadow_steel", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_GOBBER = registerItem("modded/essence_gobber", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_GOBBER_NETHER = registerItem("modded/essence_gobber_nether", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item ESSENCE_GOBBER_END = registerItem("modded/essence_gobber_end", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
