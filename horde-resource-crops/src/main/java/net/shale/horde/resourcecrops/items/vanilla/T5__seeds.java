package net.shale.horde.resourcecrops.items.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resourcecrops.Main;

public class T5__seeds {
    public static final Item SEED_BLAZE = registerItem("vanilla/seed_blaze", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_DIAMOND = registerItem("vanilla/seed_diamond", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_END = registerItem("vanilla/seed_end", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_GHAST = registerItem("vanilla/seed_ghast", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_GLOWSTONE = registerItem("vanilla/seed_glowstone", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_NETHER = registerItem("vanilla/seed_nether", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_NETHER_QUARTZ = registerItem("vanilla/seed_nether_quartz", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_WITHER_SKELETON = registerItem("vanilla/seed_wither_skeleton", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
