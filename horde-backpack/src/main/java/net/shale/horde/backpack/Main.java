package net.shale.horde.backpack;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.shale.horde.backpack.registry.*;

public class Main implements ModInitializer {
    public static final String ID = "horde-backpack";
    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }
    public static final ItemGroup BAG = FabricItemGroupBuilder.build(new Identifier(ID, "bag"),
            () -> new ItemStack(Items.BUNDLE));
    @Override
    public void onInitialize() {
        BB_LeatherItemRegistry.registerModItems();
        BB_LeatherBlockRegistry.registerBlock();
        BB_CopperItemRegistry.registerModItems();
        BB_CopperBlockRegistry.registerBlock();
        BB_IronItemRegistry.registerModItems();
        BB_IronBlockRegistry.registerBlock();
        BB_GoldItemRegistry.registerModItems();
        BB_GoldBlockRegistry.registerBlock();
        BB_DiamondItemRegistry.registerModItems();
        BB_DiamondBlockRegistry.registerBlock();
        BB_NetheriteItemRegistry.registerModItems();
        BB_NetheriteBlockRegistry.registerBlock();


    }
}
