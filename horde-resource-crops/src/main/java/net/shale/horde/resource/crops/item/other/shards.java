package net.shale.horde.resource.crops.item.other;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;

public class shards {
    public static final Item SHARD_DRAGON_EGG = registerItem("other/shard_dragon_egg", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static final Item SHARD_NETHER_STAR = registerItem("other/shard_nether_star", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
