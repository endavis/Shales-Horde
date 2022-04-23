package net.shale.horde.resourcecrops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resourcecrops.Main;

public class mixes {
    public static final Item MIX_CHICKEN = registerItem("vanilla/mix_chicken", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_COW = registerItem("vanilla/mix_cow", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_DYE = registerItem("vanilla/mix_dye", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_FISH = registerItem("vanilla/mix_fish", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_PIG = registerItem("vanilla/mix_pig", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_CORAL = registerItem("vanilla/mix_coral", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_CREEPER = registerItem("vanilla/mix_creeper", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_RABBIT = registerItem("vanilla/mix_rabbit", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_SHEEP = registerItem("vanilla/mix_sheep", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_SKELETON = registerItem("vanilla/mix_skeleton", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_SLIME = registerItem("vanilla/mix_slime", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_SPIDER = registerItem("vanilla/mix_spider", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_TURTLE = registerItem("vanilla/mix_turtle", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));
    public static final Item MIX_ZOMBIE = registerItem("vanilla/mix_zombie", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
