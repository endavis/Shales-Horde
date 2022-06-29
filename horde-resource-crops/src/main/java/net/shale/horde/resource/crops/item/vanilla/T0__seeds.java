package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.vanilla.T0__crops;
import net.shale.horde.resource.crops.item.custom.tier.T0_block;
import net.shale.horde.resource.crops.item.item_group;

public class T0__seeds {
    public static final Item SEED_RHODONITE = registerItem("vanilla/seed_rhodonite", new
            T0_block(T0__crops.CROP_RHODONITE,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_AIR = registerItem("vanilla/seed_air", new
            T0_block(T0__crops.CROP_AIR,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_EARTH = registerItem("vanilla/seed_earth", new
            T0_block(T0__crops.CROP_EARTH,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_FIRE = registerItem("vanilla/seed_fire", new
            T0_block(T0__crops.CROP_FIRE,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_WATER = registerItem("vanilla/seed_water", new
            T0_block(T0__crops.CROP_WATER,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
