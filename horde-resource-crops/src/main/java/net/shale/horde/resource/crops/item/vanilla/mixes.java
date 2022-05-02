package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.item.item_group;

public class mixes {
    public static final Item MIX_CHICKEN = registerItem("vanilla/mix_chicken", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_COW = registerItem("vanilla/mix_cow", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_ENDERMAN = registerItem("vanilla/mix_enderman", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_FISH = registerItem("vanilla/mix_fish", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_PIG = registerItem("vanilla/mix_pig", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_CREEPER = registerItem("vanilla/mix_creeper", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_RABBIT = registerItem("vanilla/mix_rabbit", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_SHEEP = registerItem("vanilla/mix_sheep", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_SKELETON = registerItem("vanilla/mix_skeleton", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_SLIME = registerItem("vanilla/mix_slime", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_SPIDER = registerItem("vanilla/mix_spider", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_TURTLE = registerItem("vanilla/mix_turtle", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_ZOMBIE = registerItem("vanilla/mix_zombie", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_NATURE = registerItem("vanilla/mix_nature", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_BLAZE = registerItem("vanilla/mix_blaze", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_GHAST = registerItem("vanilla/mix_ghast", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_WITHER_SKELETON = registerItem("vanilla/mix_wither_skeleton", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item MIX_SHULKER = registerItem("vanilla/mix_shulker", new Item(new FabricItemSettings()
            .group(item_group.ESSENCE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
