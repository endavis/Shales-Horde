package net.shale.horde.resource.crops.item.modded;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.modded.m_T2__crops;
import net.shale.horde.resource.crops.item.custom.tier.T2_block;
import net.shale.horde.resource.crops.item.item_group;

public class m_T2__seeds {
    public static final Item SEED_ALUMINUM = registerItem("modded/seed_aluminum", new
            T2_block(m_T2__crops.CROP_ALUMINUM,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_LIGNITE = registerItem("modded/seed_lignite", new
            T2_block(m_T2__crops.CROP_LIGNITE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_RUBBER = registerItem("modded/seed_rubber", new
            T2_block(m_T2__crops.CROP_RUBBER,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_SILICON = registerItem("modded/seed_silicon", new
            T2_block(m_T2__crops.CROP_SILICON,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_SULFUR = registerItem("modded/seed_sulfur", new
            T2_block(m_T2__crops.CROP_SULFUR,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_THALLASIUM = registerItem("modded/seed_thallasium", new
            T2_block(m_T2__crops.CROP_THALLASIUM,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
