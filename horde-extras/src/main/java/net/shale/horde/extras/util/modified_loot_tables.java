package net.shale.horde.extras.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class modified_loot_tables {
    private static final Identifier CAVE_SPIDER = new Identifier("minecraft", "entities/cave_spider");
    private static final Identifier HUSK = new Identifier("minecraft", "entities/husk");
    private static final Identifier STRAY = new Identifier("minecraft", "entities/stray");
    private static final Identifier WITCH = new Identifier("minecraft", "entities/witch");
    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (CAVE_SPIDER.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.33f))
                        .with(ItemEntry.builder(Items.COBWEB));
                tableBuilder.pool(poolBuilder);
            }
            if (HUSK.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(Items.SAND));
                tableBuilder.pool(poolBuilder);
            }
            if (STRAY.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(Items.ICE));
                tableBuilder.pool(poolBuilder);
            }
        });
    }
}
