package net.shale.horde.resource.crops.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.ores.blocks_ores;

import java.util.Arrays;

public class rhodonite_nether_ore {
    private static final ConfiguredFeature<?, ?> NETHER_RHODONITE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    blocks_ores.RHODONITE_NETHER_ORE.getDefaultState(),
                    9)); // vein size

    public static PlacedFeature NETHER_RHODONITE_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(NETHER_RHODONITE_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(20), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(319))
            )); // height

    public static void registerWorldGeneration() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, Main.id("rhodonite_nether_ore"), NETHER_RHODONITE_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, Main.id("rhodonite_nether_ore"), NETHER_RHODONITE_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY, Main.id("rhodonite_nether_ore")));
    }
}

