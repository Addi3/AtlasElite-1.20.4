package net.addie.atlaselite.datagen;

import net.addie.atlaselite.block.ModBlocks;
import net.addie.atlaselite.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

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
     itemModelGenerator.register(ModItems.ADDIUM_INGOT, Models.GENERATED);
     itemModelGenerator.register(ModItems.RAW_ADDIUM, Models.GENERATED);
     itemModelGenerator.register(ModItems.ADDIUM_SWORD, Models.HANDHELD);
     itemModelGenerator.register(ModItems.ADDIUM_PICKAXE, Models.HANDHELD);
     itemModelGenerator.register(ModItems.ADDIUM_AXE, Models.HANDHELD);
     itemModelGenerator.register(ModItems.ADDIUM_SHOVEL, Models.HANDHELD);
     itemModelGenerator.register(ModItems.ADDIUM_HOE, Models.HANDHELD);
     itemModelGenerator.register(ModItems.ADDIUM_SILK, Models.HANDHELD);

     itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADDIUM_INGOT_HELMET));
     itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADDIUM_INGOT_CHESTPLATE));
     itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADDIUM_INGOT_LEGGINGS));
     itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADDIUM_INGOT_BOOTS));
    }
}
