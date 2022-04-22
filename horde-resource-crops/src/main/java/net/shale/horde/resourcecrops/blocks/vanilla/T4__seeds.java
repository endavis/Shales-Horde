package net.shale.horde.resourcecrops.blocks.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resourcecrops.Main;

public class T4__seeds {
    public static final Item SEED_DYE = registerItem("vanilla/seed_dye", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_EMERALD = registerItem("vanilla/seed_emerald", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_ENDERMAN = registerItem("vanilla/seed_emerald", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_EXPERIENCE = registerItem("vanilla/seed_experience", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_GOLD = registerItem("vanilla/seed_gold", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_NATURE = registerItem("vanilla/seed_nature", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_OBSIDIAN = registerItem("vanilla/seed_obsidian", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_PRISMARINE = registerItem("vanilla/seed_prismarine", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));
    public static final Item SEED_REDSTONE = registerItem("vanilla/seed_redstone", new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD
            )));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
