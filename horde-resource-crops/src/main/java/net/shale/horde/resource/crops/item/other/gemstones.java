package net.shale.horde.resource.crops.item.other;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.item.custom.LimitedCatalyst;
import net.shale.horde.resource.crops.item.custom.UnlimitedCatalyst;
import net.shale.horde.resource.crops.item.item_group;

public class gemstones {
    public static final Item RHODONITE_CATALYST = registerItem("gemstones/rhodonite_catalyst", new LimitedCatalyst());
    public static final Item LARIMAR_CATALYST = registerItem("gemstones/larimar_catalyst", new UnlimitedCatalyst());

    public static final Item DRAGONSTONE_OVERWORLD = registerItem("ores/dragonstone_overworld", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item DRAGONSTONE_OVERWORLD_GEM = registerItem("gemstones/dragonstone_overworld_diamond", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item DRAGONSTONE_NETHER = registerItem("ores/dragonstone_nether", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item DRAGONSTONE_NETHER_GEM = registerItem("gemstones/dragonstone_nether_diamond", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item DRAGONSTONE_END = registerItem("ores/dragonstone_end", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item DRAGONSTONE_END_GEM = registerItem("gemstones/dragonstone_end_diamond", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item BISMUTH = registerItem("ores/bismuth", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item BISMUTH_GEM = registerItem("gemstones/bismuth_diamond", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER0 = registerItem("gemstones/bloodstone", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER0_GEM = registerItem("gemstones/bloodstone_diamond", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER1 = registerItem("gemstones/rhodonite", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER1_GEM = registerItem("gemstones/rhodonite_diamond", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER2 = registerItem("gemstones/aventurine", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER2_GEM = registerItem("gemstones/aventurine_diamond", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER3 = registerItem("gemstones/aragonite", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER3_GEM = registerItem("gemstones/aragonite_diamond", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER4 = registerItem("gemstones/spinel", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER4_GEM = registerItem("gemstones/spinel_diamond", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER5 = registerItem("gemstones/larimar", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER5_GEM = registerItem("gemstones/larimar_diamond", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER6 = registerItem("gemstones/chaorite", new Item(new FabricItemSettings()
            .group(item_group.ORES)));
    public static final Item TIER6_GEM = registerItem("gemstones/chaorite_diamond", new Item(new FabricItemSettings()
            .group(item_group.ORES)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }


}
