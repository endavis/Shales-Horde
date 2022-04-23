package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;

public class T6__seeds {
    public static final Item SEED_DRAGON_EGG = registerItem("vanilla/seed_dragon_egg", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_NETHER_STAR = registerItem("vanilla/seed_nether_star", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_NETHERITE = registerItem("vanilla/seed_netherite", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_SHULKER = registerItem("vanilla/seed_shulker", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
