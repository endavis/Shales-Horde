package net.shale.horde.resource.crops.item.modded;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.modded.m_T3__crops;
import net.shale.horde.resource.crops.item.custom.tier.T3_block;
import net.shale.horde.resource.crops.item.item_group;

public class m_T3__seeds {
    public static final Item SEED_BRASS = registerItem("modded/seed_brass", new
            T3_block(m_T3__crops.CROP_BRASS,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_BRONZE = registerItem("modded/seed_bronze", new
            T3_block(m_T3__crops.CROP_BRONZE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_CERTUS = registerItem("modded/seed_certus", new
            T3_block(m_T3__crops.CROP_CERTUS,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_CINCINNASITE = registerItem("modded/seed_cincinnasite", new
            T3_block(m_T3__crops.CROP_CINCINNASITE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_LEAD = registerItem("modded/seed_lead", new
            T3_block(m_T3__crops.CROP_LEAD,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_NIKOLITE = registerItem("modded/seed_nikolite", new
            T3_block(m_T3__crops.CROP_NIKOLITE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_REFINED_IRON = registerItem("modded/seed_refined_iron", new
            T3_block(m_T3__crops.CROP_REFINED_IRON,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_SILVER = registerItem("modded/seed_silver", new
            T3_block(m_T3__crops.CROP_SILVER,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_TIN = registerItem("modded/seed_tin", new
            T3_block(m_T3__crops.CROP_TIN,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_ZINC = registerItem("modded/seed_zinc", new
            T3_block(m_T3__crops.CROP_ZINC,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
