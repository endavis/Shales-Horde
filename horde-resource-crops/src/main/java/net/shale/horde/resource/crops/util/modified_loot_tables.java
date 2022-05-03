package net.shale.horde.resource.crops.util;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.shale.horde.resource.crops.item.other.items;

public class modified_loot_tables {
    // 25% //
    private static final Identifier WITHER_SKELETON = new Identifier("minecraft", "entities/wither_skeleton");

    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if (WITHER_SKELETON.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.33f))
                        .with(ItemEntry.builder(items.WITHERED_BONE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));
    }
}

