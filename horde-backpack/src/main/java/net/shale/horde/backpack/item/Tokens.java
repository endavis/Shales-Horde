package net.shale.horde.backpack.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Backpack;

public class Tokens {
    public static final Item TOKEN_COPPER = registerItem("token_copper", new
            Item(new FabricItemSettings().group(ItemGroup.MISC)
    ));
    public static final Item TOKEN_IRON = registerItem("token_iron", new
            Item(new FabricItemSettings().group(ItemGroup.MISC)
    ));
    public static final Item TOKEN_GOLD = registerItem("token_gold", new
            Item(new FabricItemSettings().group(ItemGroup.MISC)
    ));
    public static final Item TOKEN_DIAMOND = registerItem("token_diamond", new
            Item(new FabricItemSettings().group(ItemGroup.MISC)
    ));
    public static final Item TOKEN_NETHERITE = registerItem("token_netherite", new
            Item(new FabricItemSettings().group(ItemGroup.MISC)
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Backpack.ID, name), item);
    }

    public static void registerModItems() {
    }
}
