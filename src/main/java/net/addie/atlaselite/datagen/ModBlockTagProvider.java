package net.addie.atlaselite.datagen;

import net.addie.atlaselite.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_ADDIUM_BLOCK)
                .add(ModBlocks.ADDIUM_BLOCK)
                .add(ModBlocks.ADDIUM_STAINED_GLASS)
                .add(ModBlocks.WEAK_ADDIUM_BLOCK)
                .add(ModBlocks.WEAK_ADDIUM_SLAB)
                .add(ModBlocks.WEAK_ADDIUM_STAIRS)
                .add(ModBlocks.ADDIUM_SLAB)
                .add(ModBlocks.ADDIUM_STAIRS)
                .add(ModBlocks.ADDIUM_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_ADDIUM_BLOCK)
                .add(ModBlocks.ADDIUM_STAINED_GLASS)
                .add(ModBlocks.ADDIUM_ORE)
                .add(ModBlocks.ADDIUM_BLOCK)
                .add(ModBlocks.WEAK_ADDIUM_SLAB)
                .add(ModBlocks.WEAK_ADDIUM_STAIRS)
                .add(ModBlocks.ADDIUM_SLAB)
                .add(ModBlocks.ADDIUM_STAIRS)
                .add(ModBlocks.WEAK_ADDIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ADDIUM_WALL)
                .add(ModBlocks.WEAK_ADDIUM_WALL);
    }
}
