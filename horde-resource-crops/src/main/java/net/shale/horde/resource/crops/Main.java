package net.shale.horde.resource.crops;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.shale.horde.resource.crops.Recipe.RecipeManager;
import net.shale.horde.resource.crops.block.entities;
import net.shale.horde.resource.crops.block.modded.*;
import net.shale.horde.resource.crops.block.ores.blocks_ores;
import net.shale.horde.resource.crops.block.ores.compressed_blocks;
import net.shale.horde.resource.crops.block.vanilla.*;
import net.shale.horde.resource.crops.item.items_ores;
import net.shale.horde.resource.crops.item.modded.*;
import net.shale.horde.resource.crops.item.other.gemstones;
import net.shale.horde.resource.crops.item.other.items;
import net.shale.horde.resource.crops.item.other.shards;
import net.shale.horde.resource.crops.item.vanilla.*;
import net.shale.horde.resource.crops.util.modified_loot_tables;
import net.shale.horde.resource.crops.worldgen.*;

public class Main implements ModInitializer {
    public static final String ID = "horde-resource-crops";


    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }

    @Override
    public void onInitialize() {


        ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register((world, entity, killedEntity) -> {
            if (killedEntity instanceof PathAwareEntity && Math.random() < 0.5) {
                world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(gemstones.TIER0)));
            }

            if (entity instanceof ServerPlayerEntity) {
                ServerPlayerEntity player = (ServerPlayerEntity) entity;
                Item item = player.getMainHandStack().getItem();
            }
        });
        modified_loot_tables.modifyLootTables();
        RecipeManager.registerRecipeSerializers();
        items.registerModItems();
        mixes.registerModItems();
        gemstones.registerModItems();
        shards.registerModItems();
        items_ores.registerModItems();
        blocks_ores.registerBlock();
        //blocks_misc.registerBlock();
        compressed_blocks.registerBlock();
        entities.registerBlock();
        T0__crops.registerBlock();
        T0__seeds.registerModItems();
        T0__essence.registerModItems();
        T1__crops.registerBlock();
        T1__seeds.registerModItems();
        T1__essence.registerModItems();
        T2__crops.registerBlock();
        T2__seeds.registerModItems();
        T2__essence.registerModItems();
        T3__crops.registerBlock();
        T3__seeds.registerModItems();
        T3__essence.registerModItems();
        T4__crops.registerBlock();
        T4__seeds.registerModItems();
        T4__essence.registerModItems();
        T5__crops.registerBlock();
        T5__seeds.registerModItems();
        T5__essence.registerModItems();
        T6__crops.registerBlock();
        T6__seeds.registerModItems();
        T6__essence.registerModItems();
        m_T1__crops.registerBlock();
        m_T1__seeds.registerModItems();
        m_T1__essence.registerModItems();
        m_T2__crops.registerBlock();
        m_T2__seeds.registerModItems();
        m_T2__essence.registerModItems();
        m_T3__crops.registerBlock();
        m_T3__seeds.registerModItems();
        m_T3__essence.registerModItems();
        m_T4__crops.registerBlock();
        m_T4__seeds.registerModItems();
        m_T4__essence.registerModItems();
        m_T5__crops.registerBlock();
        m_T5__seeds.registerModItems();
        m_T5__essence.registerModItems();
        m_T6__crops.registerBlock();
        m_T6__seeds.registerModItems();
        m_T6__essence.registerModItems();

        // Register world gen items
        rhodonite_overworld_ore.registerWorldGeneration();
        rhodonite_deepslate_ore.registerWorldGeneration();
        rhodonite_nether_ore.registerWorldGeneration();
        rhodonite_end_ore.registerWorldGeneration();

        dragonstone_overworld_ore.registerWorldGeneration();
        dragonstone_deepslate_ore.registerWorldGeneration();
        dragonstone_nether_ore.registerWorldGeneration();
        dragonstone_end_ore.registerWorldGeneration();

        busmith_blackstone_ore.registerWorldGeneration();
        bismuth_basalt_ore.registerWorldGeneration();
    }
}