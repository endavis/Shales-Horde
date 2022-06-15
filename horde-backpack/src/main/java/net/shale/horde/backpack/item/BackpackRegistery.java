package net.shale.horde.backpack.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Backpack;

public class BackpackRegistery {
    public static final Item LEATHER_BACKPACK = registerItem("leather_backpack", new
            Leather(new FabricItemSettings()
            .maxCount(1)
            .group(Backpack.BAG)
            ,27)
    );
    public static final Item COPPER_BACKPACK = registerItem("copper_backpack", new
            Copper(new FabricItemSettings()
            .maxCount(1)
            .group(Backpack.BAG)
            ,54)
    );
    public static final Item IRON_BACKPACK = registerItem("iron_backpack", new
            Iron(new FabricItemSettings()
            .maxCount(1)
            .group(Backpack.BAG)
            ,81)
    );
    public static final Item GOLD_BACKPACK = registerItem("gold_backpack", new
            Gold(new FabricItemSettings()
            .maxCount(1)
            .rarity(Rarity.UNCOMMON)
            .group(Backpack.BAG)
            ,108)
    );
    public static final Item DIAMOND_BACKPACK = registerItem("diamond_backpack", new
            Diamond(new FabricItemSettings()
            .maxCount(1)
            .rarity(Rarity.RARE)
            .group(Backpack.BAG)
            ,135)
    );
    public static final Item NETHERITE_BACKPACK = registerItem("netherite_backpack", new
            Netherite(new FabricItemSettings()
            .maxCount(1)
            .fireproof()
            .rarity(Rarity.EPIC)
            .group(Backpack.BAG)
            ,162)
    );
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Backpack.ID, name), item);
    }

    public static void registerModItems() {
    }
}
