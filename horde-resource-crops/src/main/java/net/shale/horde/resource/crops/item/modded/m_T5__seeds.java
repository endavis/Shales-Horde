package net.shale.horde.resource.crops.item.modded;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.modded.m_T5__crops;
import net.shale.horde.resource.crops.item.custom.tier.T5_block;
import net.shale.horde.resource.crops.item.item_group;

public class m_T5__seeds {
    public static final Item SEED_ANTIMONY = registerItem("modded/seed_antimony", new
            T5_block(m_T5__crops.CROP_ANTIMONY,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_IRIDIUM = registerItem("modded/seed_iridium", new
            T5_block(m_T5__crops.CROP_IRIDIUM,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_PLATINUM = registerItem("modded/seed_platinum", new
            T5_block(m_T5__crops.CROP_PLATINUM,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_TERMINITE = registerItem("modded/seed_terminite", new
            T5_block(m_T5__crops.CROP_TERMINITE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_URANIUM = registerItem("modded/seed_uranium", new
            T5_block(m_T5__crops.CROP_URANIUM,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
