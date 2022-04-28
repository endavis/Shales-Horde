package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.vanilla.T6__crops;

public class T6__seeds {
    public static final Item SEED_DRAGON_EGG = registerItem("vanilla/seed_dragon_egg", new
            AliasedBlockItem(T6__crops.CROP_DRAGON_EGG,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_NETHER_STAR = registerItem("vanilla/seed_nether_star", new
            AliasedBlockItem(T6__crops.CROP_NETHER_STAR,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_NETHERITE = registerItem("vanilla/seed_netherite", new
            AliasedBlockItem(T6__crops.CROP_NETHERITE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_SHULKER = registerItem("vanilla/seed_shulker", new
            AliasedBlockItem(T6__crops.CROP_SHULKER,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
