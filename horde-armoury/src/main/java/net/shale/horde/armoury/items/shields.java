package net.shale.horde.armoury.items;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.armoury.Main;

public class shields {
    public static final Item IRON_SHIELD = registerItem("iron_shield", new FabricShieldItem(new FabricItemSettings()
            .maxDamage(800).group(ItemGroup.COMBAT),100, 3, Items.IRON_INGOT ));
    public static final Item GOLD_SHIELD = registerItem("gold_shield", new FabricShieldItem(new FabricItemSettings()
            .maxDamage(500).group(ItemGroup.COMBAT),100, 10, Items.GOLD_INGOT ));
    public static final Item DIAMOND_SHIELD = registerItem("diamond_shield", new FabricShieldItem(new FabricItemSettings()
            .maxDamage(1500).group(ItemGroup.COMBAT),100, 5, Items.DIAMOND ));
    public static final Item NETHERITE_SHIELD = registerItem("netherite_shield", new FabricShieldItem(new FabricItemSettings()
            .maxDamage(2500).group(ItemGroup.COMBAT),100, 8, Items.NETHERITE_INGOT ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
