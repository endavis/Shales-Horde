package net.shale.horde.resource.crops.item.modded;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.modded.m_T4__crops;
import net.shale.horde.resource.crops.item.custom.tier.T4_block;
import net.shale.horde.resource.crops.item.item_group;

public class m_T4__seeds {
    public static final Item SEED_CHROME = registerItem("modded/seed_chrome", new
            T4_block(m_T4__crops.CROP_CHROME,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_ELECTRUM = registerItem("modded/seed_electrum", new
            T4_block(m_T4__crops.CROP_ELECTRUM,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_FLUIX = registerItem("modded/seed_fluix", new
            T4_block(m_T4__crops.CROP_FLUIX,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_INVAR = registerItem("modded/seed_invar", new
            T4_block(m_T4__crops.CROP_INVAR,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_NICKEL = registerItem("modded/seed_nickel", new
            T4_block(m_T4__crops.CROP_NICKEL,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_PERIDOT = registerItem("modded/seed_peridot", new
            T4_block(m_T4__crops.CROP_PERIDOT,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_RUBY = registerItem("modded/seed_ruby", new
            T4_block(m_T4__crops.CROP_RUBY,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_SAPPHIRE = registerItem("modded/seed_sapphire", new
            T4_block(m_T4__crops.CROP_SAPPHIRE,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_STEEL = registerItem("modded/seed_steel", new
            T4_block(m_T4__crops.CROP_STEEL,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_TITANIUM = registerItem("modded/seed_titanium", new
            T4_block(m_T4__crops.CROP_TITANIUM,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_TUNGSTEN = registerItem("modded/seed_tungsten", new
            T4_block(m_T4__crops.CROP_TUNGSTEN,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
