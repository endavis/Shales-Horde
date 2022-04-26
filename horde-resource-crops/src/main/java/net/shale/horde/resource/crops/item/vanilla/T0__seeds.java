package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.vanilla.T0__crops;

public class T0__seeds {
    public static final Item SEED_RHODONITE = registerItem("vanilla/seed_rhodonite", new
            AliasedBlockItem(T0__crops.CROP_RHODONITE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_AIR = registerItem("vanilla/seed_air", new
            AliasedBlockItem(T0__crops.CROP_AIR,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_EARTH = registerItem("vanilla/seed_earth", new
            AliasedBlockItem(T0__crops.CROP_EARTH,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_FIRE = registerItem("vanilla/seed_fire", new
            AliasedBlockItem(T0__crops.CROP_FIRE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_WATER = registerItem("vanilla/seed_water", new
            AliasedBlockItem(T0__crops.CROP_WATER,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
