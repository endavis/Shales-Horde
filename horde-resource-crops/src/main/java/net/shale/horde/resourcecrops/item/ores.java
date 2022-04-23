package net.shale.horde.resourcecrops.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resourcecrops.Main;

public class ores {
    public static final Item DRAGONSTONE_OVERWORLD = registerItem("dragonstone_overworld", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item RAW_DRAGONSTONE_OVERWORLD = registerItem("raw_dragonstone_overworld", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item DRAGONSTONE_NETHER = registerItem("dragonstone_nether", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item RAW_DRAGONSTONE_NETHER = registerItem("raw_dragonstone_nether", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item DRAGONSTONE_END = registerItem("dragonstone_end", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    public static final Item RAW_DRAGONSTONE_END = registerItem("raw_dragonstone_end", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
