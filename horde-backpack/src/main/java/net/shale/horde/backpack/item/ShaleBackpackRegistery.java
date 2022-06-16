package net.shale.horde.backpack.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Backpack;

public class ShaleBackpackRegistery {
    public static final Item SHALE_LEATHER_BACKPACK = registerItem("shale_leather_backpack", new
            Leather(new FabricItemSettings()
            .maxCount(1)
            ,54)
    );
    public static final Item SHALE_COPPER_BACKPACK = registerItem("shale_copper_backpack", new
            Copper(new FabricItemSettings()
            .maxCount(1)
            ,54)
    );
    public static final Item SHALE_IRON_BACKPACK = registerItem("shale_iron_backpack", new
            Iron(new FabricItemSettings()
            .maxCount(1)
            ,81)
    );
    public static final Item SHALE_GOLD_BACKPACK = registerItem("shale_gold_backpack", new
            Gold(new FabricItemSettings()
            .maxCount(1)
            .rarity(Rarity.UNCOMMON)
            ,108)
    );
    public static final Item SHALE_DIAMOND_BACKPACK = registerItem("shale_diamond_backpack", new
            Diamond(new FabricItemSettings()
            .maxCount(1)
            .rarity(Rarity.RARE)
            ,135)
    );
    public static final Item SHALE_NETHERITE_BACKPACK = registerItem("shale_netherite_backpack", new
            Netherite(new FabricItemSettings()
            .maxCount(1)
            .fireproof()
            .rarity(Rarity.EPIC)
            ,162)
    );
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Backpack.ID, name), item);
    }

    public static void registerModItems() {
    }
}
