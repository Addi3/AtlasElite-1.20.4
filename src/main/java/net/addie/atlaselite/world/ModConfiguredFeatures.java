package net.addie.atlaselite.world;

import net.addie.atlaselite.AtlasElite;
import net.addie.atlaselite.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import javax.crypto.Cipher;
import java.util.List;

public class ModConfiguredFeatures {
public static final RegistryKey<ConfiguredFeature<?,  ?>>ADDIUM_ORE_KEY = registerKey("addium_ore");
public static final RegistryKey<ConfiguredFeature<?,  ?>>RAW_ADDIUM_KEY = registerKey("raw_addium");

public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
    RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
    RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

    List<OreFeatureConfig.Target> overworldAddiumOres =
            List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ADDIUM_ORE.getDefaultState()),
                    OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.RAW_ADDIUM_BLOCK.getDefaultState()));



register(context, ADDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAddiumOres, 5));
register(context, RAW_ADDIUM_KEY, Feature.ORE, new OreFeatureConfig(overworldAddiumOres, 8));

}

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(AtlasElite.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
