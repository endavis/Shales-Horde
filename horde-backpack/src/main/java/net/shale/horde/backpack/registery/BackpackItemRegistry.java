package net.shale.horde.backpack.registery;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.item.*;

public class BackpackItemRegistry {
    public static final Item LEATHER_BACKPACK_ITEM = registerItem("leather_backpack_item", new
            BackpackItemLeather(new FabricItemSettings()
            .maxCount(1)
            .group(Main.BAG)
    ));
    public static final Item COPPER_BACKPACK_ITEM = registerItem("copper_backpack_item", new
            BackpackItemCopper(new FabricItemSettings()
            .maxCount(1)
            .group(Main.BAG)
    ));
    public static final Item IRON_BACKPACK_ITEM = registerItem("iron_backpack_item", new
            BackpackItemIron(new FabricItemSettings()
            .maxCount(1)
            .group(Main.BAG)
    ));
    public static final Item GOLD_BACKPACK_ITEM = registerItem("gold_backpack_item", new
            BackpackItemGold(new FabricItemSettings()
            .maxCount(1)
            .group(Main.BAG)
    ));
    public static final Item DIAMOND_BACKPACK_ITEM = registerItem("diamond_backpack_item", new
            BackpackItemDiamond(new FabricItemSettings()
            .maxCount(1)
            .group(Main.BAG)
    ));
    public static final Item NETHERITE_BACKPACK_ITEM = registerItem("netherite_backpack_item", new
            BackpackItemNetherite(new FabricItemSettings()
            .maxCount(1)
            .group(Main.BAG)
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}