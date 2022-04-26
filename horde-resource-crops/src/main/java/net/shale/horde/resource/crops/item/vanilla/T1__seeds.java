package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.vanilla.T1__crops;

public class T1__seeds {
    public static final Item SEED_DIRT = registerItem("vanilla/seed_dirt", new
            AliasedBlockItem(T1__crops.CROP_DIRT,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_ICE = registerItem("vanilla/seed_ice", new
            AliasedBlockItem(T1__crops.CROP_ICE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_STONE = registerItem("vanilla/seed_stone", new
            AliasedBlockItem(T1__crops.CROP_STONE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_WOOD = registerItem("vanilla/seed_wood", new
            AliasedBlockItem(T1__crops.CROP_WOOD,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
