package net.shale.horde.resource.crops.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.ores.blocks_ores;

import java.util.Arrays;

public class dragonstone_end_ore {
    private static final ConfiguredFeature<?, ?> END_DRAGONSTONE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    blocks_ores.DRAGONSTONE_END_ORE.getDefaultState(),
                    9)); // vein size

    public static PlacedFeature END_DRAGONSTONE_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(END_DRAGONSTONE_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(20), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(319))
            )); // height

    public static void registerWorldGeneration() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, Main.id("dragonstone_end_ore"), END_DRAGONSTONE_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, Main.id("dragonstone_end_ore"), END_DRAGONSTONE_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY, Main.id("dragonstone_end_ore")));
    }
}

