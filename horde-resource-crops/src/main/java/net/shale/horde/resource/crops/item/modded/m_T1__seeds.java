package net.shale.horde.resource.crops.item.modded;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.modded.m_T1__crops;
import net.shale.horde.resource.crops.item.custom.tier.T1_block;
import net.shale.horde.resource.crops.item.item_group;

public class m_T1__seeds {
    public static final Item SEED_SKY_STONE = registerItem("modded/seed_sky_stone", new
            T1_block(m_T1__crops.CROP_SKY_STONE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
