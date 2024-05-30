package net.addie.atlaselite.world;

import net.addie.atlaselite.AtlasElite;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> ADDIUM_ORE_PLACED_KEY = registerKey("addium_ore_placed");
    public static final RegistryKey<PlacedFeature> RAW_ADDIUM_PLACED_KEY = registerKey("raw_addium_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, ADDIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ADDIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));

        register(context, RAW_ADDIUM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RAW_ADDIUM_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(AtlasElite.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }


}
