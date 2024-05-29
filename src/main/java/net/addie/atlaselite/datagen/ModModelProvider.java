package net.addie.atlaselite.datagen;

import net.addie.atlaselite.block.ModBlocks;
import net.addie.atlaselite.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADDIUM_BLOCK);
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ADDIUM_BLOCK);
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADDIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
itemModelGenerator.register(ModItems.RAW_ADDIUM, Models.GENERATED);
itemModelGenerator.register(ModItems.ADDIUM_INGOT, Models.GENERATED);
    }
}
