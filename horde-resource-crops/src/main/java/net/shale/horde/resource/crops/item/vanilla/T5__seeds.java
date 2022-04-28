package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.vanilla.T5__crops;

public class T5__seeds {
    public static final Item SEED_BLAZE = registerItem("vanilla/seed_blaze", new
            AliasedBlockItem(T5__crops.CROP_BlAZE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_DIAMOND = registerItem("vanilla/seed_diamond", new
            AliasedBlockItem(T5__crops.CROP_DIAMOND,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_END = registerItem("vanilla/seed_end", new
            AliasedBlockItem(T5__crops.CROP_END,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_GHAST = registerItem("vanilla/seed_ghast", new
            AliasedBlockItem(T5__crops.CROP_GHAST,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_GLOWSTONE = registerItem("vanilla/seed_glowstone", new
            AliasedBlockItem(T5__crops.CROP_GLOWSTONE,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_NETHER = registerItem("vanilla/seed_nether", new
            AliasedBlockItem(T5__crops.CROP_NETHER,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_NETHER_QUARTZ = registerItem("vanilla/seed_nether_quartz", new
            AliasedBlockItem(T5__crops.CROP_NETHER_QUARTZ,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));
    public static final Item SEED_WITHER_SKELETON = registerItem("vanilla/seed_wither_skeleton", new
            AliasedBlockItem(T5__crops.CROP_WITHER_SKELETON,
            new FabricItemSettings()
                    .group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
