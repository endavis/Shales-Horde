package net.shale.horde.resource.crops.item.modded;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.modded.m_T6__crops;
import net.shale.horde.resource.crops.item.custom.tier.T6_block;
import net.shale.horde.resource.crops.item.item_group;

public class m_T6__seeds {
    public static final Item SEED_AETERNIUM = registerItem("modded/seed_aeternium", new
            T6_block(m_T6__crops.CROP_AETERNIUM,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_REFINED_RADIANCE = registerItem("modded/seed_refined_radiance", new
            T6_block(m_T6__crops.CROP_REFINED_RADIANCE,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_SHADOW_STEEL = registerItem("modded/seed_shadow_steel", new
            T6_block(m_T6__crops.CROP_SHADOW_STEEL,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
