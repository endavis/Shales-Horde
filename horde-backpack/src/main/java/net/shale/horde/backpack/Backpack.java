package net.shale.horde.backpack;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.api.KeybindEntrypoint;
import net.shale.horde.backpack.block.blocks_bag;
import net.shale.horde.backpack.item.BackpackItem;

public class Backpack implements ModInitializer {
    public static final String ID = "horde-backpack";
    public static final ItemGroup BAG = FabricItemGroupBuilder.build(new Identifier(ID, "bag"),
            () -> new ItemStack(Items.BUNDLE));

    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }

    @Override
    public void onInitialize() {
        Item.Settings ItemSettings = new Item.Settings().group(BAG).maxCount(1);
        blocks_bag.registerBlock();

        Registry.register(Registry.ITEM, id("leather_backpack"), new BackpackItem(ItemSettings, 27));
        Registry.register(Registry.ITEM, id("iron_backpack"), new BackpackItem(ItemSettings, 54));
        Registry.register(Registry.ITEM, id("gold_backpack"), new BackpackItem(ItemSettings, 81));
        Registry.register(Registry.ITEM, id("diamond_backpack"), new BackpackItem(ItemSettings, 108));
        Registry.register(Registry.ITEM, id("netherite_backpack"), new BackpackItem(ItemSettings, 162));

        KeybindEntrypoint.onInitialize();
    }
}
