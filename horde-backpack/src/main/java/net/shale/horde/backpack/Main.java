package net.shale.horde.backpack;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.shale.horde.backpack.render.BackpackRenderer;
import net.shale.horde.backpack.registery.BackpackBlockRegistry;
import net.shale.horde.backpack.registery.BackpackItemRegistry;

public class Main implements ModInitializer {
    public static final String ID = "horde-backpack";
    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }
    public static final ItemGroup BAG = FabricItemGroupBuilder.build(new Identifier(ID, "bag"),
            () -> new ItemStack(Items.BUNDLE));
    @Override
    public void onInitialize() {
        BackpackItemRegistry.registerModItems();
        BackpackBlockRegistry.registerBlock();
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BackpackItemRegistry.LEATHER_BACKPACK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BackpackItemRegistry.COPPER_BACKPACK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BackpackItemRegistry.IRON_BACKPACK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BackpackItemRegistry.GOLD_BACKPACK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BackpackItemRegistry.DIAMOND_BACKPACK_ITEM);
        BackpackRenderer.registerTrinketRenderer((BackpackRenderer) BackpackItemRegistry.NETHERITE_BACKPACK_ITEM);
    }
}
