package net.shale.horde.resource.crops.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;

public class items_ores {
    public static final Item RAW_DRAGONSTONE_OVERWORLD = registerItem("ores/raw_dragonstone_overworld", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item RAW_DRAGONSTONE_NETHER = registerItem("ores/raw_dragonstone_nether", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item RAW_DRAGONSTONE_END = registerItem("ores/raw_dragonstone_end", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item RAW_RHODONITE = registerItem("ores/raw_rhodonite", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item RAW_BISMUTH = registerItem("ores/raw_bismuth", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item SEED_BISMUTH = registerItem("vanilla/seed_bismuth", new Item(new FabricItemSettings()
            .group(item_group.SEEDS)));
    public static final Item SEED_DRAGONSTONE_OVERWORLD = registerItem("vanilla/seed_dragonstone_overworld", new Item(new FabricItemSettings()
            .group(item_group.SEEDS)));
    public static final Item SEED_DRAGONSTONE_NETHER = registerItem("vanilla/seed_dragonstone_nether", new Item(new FabricItemSettings()
            .group(item_group.SEEDS)));
    public static final Item SEED_DRAGONSTONE_END = registerItem("vanilla/seed_dragonstone_end", new Item(new FabricItemSettings()
            .group(item_group.SEEDS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
