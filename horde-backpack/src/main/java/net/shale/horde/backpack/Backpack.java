package net.shale.horde.backpack;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.Vec3f;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.api.KeybindEntrypoint;
import net.shale.horde.backpack.item.*;

import static dev.emi.trinkets.api.client.TrinketRenderer.MAGIC_ROTATION;

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
        Tokens.registerModItems();
        BackpackRegistery.registerModItems();
        BackpackItem.registerTrinketRenderer((BackpackItem) ShaleBackpackRegistery.SHALE_LEATHER_BACKPACK);
        BackpackItem.registerTrinketRenderer((BackpackItem) ShaleBackpackRegistery.SHALE_COPPER_BACKPACK);
        BackpackItem.registerTrinketRenderer((BackpackItem) ShaleBackpackRegistery.SHALE_IRON_BACKPACK);
        BackpackItem.registerTrinketRenderer((BackpackItem) ShaleBackpackRegistery.SHALE_GOLD_BACKPACK);
        BackpackItem.registerTrinketRenderer((BackpackItem) ShaleBackpackRegistery.SHALE_DIAMOND_BACKPACK);
        BackpackItem.registerTrinketRenderer((BackpackItem) ShaleBackpackRegistery.SHALE_NETHERITE_BACKPACK);
        BackpackItem.registerTrinketRenderer((BackpackItem) BackpackRegistery.LEATHER_BACKPACK);
        BackpackItem.registerTrinketRenderer((BackpackItem) BackpackRegistery.COPPER_BACKPACK);
        BackpackItem.registerTrinketRenderer((BackpackItem) BackpackRegistery.IRON_BACKPACK);
        BackpackItem.registerTrinketRenderer((BackpackItem) BackpackRegistery.GOLD_BACKPACK);
        BackpackItem.registerTrinketRenderer((BackpackItem) BackpackRegistery.DIAMOND_BACKPACK);
        BackpackItem.registerTrinketRenderer((BackpackItem) BackpackRegistery.NETHERITE_BACKPACK);

//        Registry.register(Registry.ITEM, id("leather_backpack"), new Leather(ItemSettings, 27));
//        Registry.register(Registry.ITEM, id("copper_backpack"), new Copper(ItemSettings, 54));
//        Registry.register(Registry.ITEM, id("iron_backpack"), new Iron(ItemSettings, 81));
//        Registry.register(Registry.ITEM, id("gold_backpack"), new Gold(ItemSettings.rarity(Rarity.UNCOMMON), 108));
//        Registry.register(Registry.ITEM, id("diamond_backpack"), new Diamond(ItemSettings.rarity(Rarity.RARE), 135));
//        Registry.register(Registry.ITEM, id("netherite_backpack"), new Netherite(ItemSettings.rarity(Rarity.EPIC).fireproof(), 162));

        KeybindEntrypoint.onInitialize();
    }
}
