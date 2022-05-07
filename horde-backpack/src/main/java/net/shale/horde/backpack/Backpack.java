package net.shale.horde.backpack;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.api.KeybindEntrypoint;
import net.shale.horde.backpack.block.BackpackBlock;
import net.shale.horde.backpack.entity.BackpackBlockEntity;
import net.shale.horde.backpack.item.BackpackItem;

public class Backpack implements ModInitializer {
    public static final String ID = "horde-backpack";
    public static final ItemGroup BAG = FabricItemGroupBuilder.build(new Identifier(ID, "bag"),
            () -> new ItemStack(Items.BUNDLE));
    public static final Item.Settings ITEM_SETTINGS = new Item.Settings().group(BAG).maxCount(1);
    public static BlockEntityType<BackpackBlockEntity> BACKPACK_BLOCK_ENTITY;

    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }

    @Override
    public void onInitialize() {
        // Blocks
        BackpackBlock leatherBackpackBlock = new BackpackBlock(27);
        BackpackBlock ironBackpackBlock = new BackpackBlock(54);
        BackpackBlock goldBackpackBlock = new BackpackBlock(81);
        BackpackBlock diamondBackpackBlock = new BackpackBlock(108);
        BackpackBlock netheriteBackpackBlock = new BackpackBlock(162);

        Registry.register(Registry.BLOCK, id("leather_backpack"), leatherBackpackBlock);
        Registry.register(Registry.BLOCK, id("iron_backpack"), ironBackpackBlock);
        Registry.register(Registry.BLOCK, id("gold_backpack"), goldBackpackBlock);
        Registry.register(Registry.BLOCK, id("diamond_backpack"), diamondBackpackBlock);
        Registry.register(Registry.BLOCK, id("netherite_backpack"), netheriteBackpackBlock);

        // Bags
        Registry.register(Registry.ITEM, id("leather_backpack"), new BackpackItem(leatherBackpackBlock, ITEM_SETTINGS, 27));
        Registry.register(Registry.ITEM, id("iron_backpack"), new BackpackItem(ironBackpackBlock, ITEM_SETTINGS, 54));
        Registry.register(Registry.ITEM, id("gold_backpack"), new BackpackItem(goldBackpackBlock, ITEM_SETTINGS, 81));
        Registry.register(Registry.ITEM, id("diamond_backpack"), new BackpackItem(diamondBackpackBlock, ITEM_SETTINGS, 108));
        Registry.register(Registry.ITEM, id("netherite_backpack"), new BackpackItem(netheriteBackpackBlock, ITEM_SETTINGS, 162));

// Entity
        BACKPACK_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, id("backpack_block_entity"), FabricBlockEntityTypeBuilder.create(BackpackBlockEntity::new, leatherBackpackBlock).build(null));

        // Keys
        KeybindEntrypoint.onInitialize();
    }
}
