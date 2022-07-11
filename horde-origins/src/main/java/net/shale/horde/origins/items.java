package net.shale.horde.origins;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class items {
    public static final Item GOGGLES =
            registerItem("goggles",
                    new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD,
                            new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item GOGGLES_TRINKET = 
            registerItem("goggles_trinket",
                    new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD,
                            new Item.Settings().group(ItemGroup.TOOLS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
