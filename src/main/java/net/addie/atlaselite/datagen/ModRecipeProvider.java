package net.addie.atlaselite.datagen;

import net.addie.atlaselite.block.ModBlocks;
import net.addie.atlaselite.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static List<ItemConvertible> ADDIUM_SMELTABLES = List.of(ModItems.RAW_ADDIUM);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
offerSmelting(exporter, ADDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ADDIUM_INGOT,0.7f,200,"addium");
offerBlasting(exporter, ADDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ADDIUM_INGOT,0.7f,150,"addium");

offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ADDIUM_INGOT, RecipeCategory.DECORATIONS,ModBlocks.ADDIUM_BLOCK);
offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ADDIUM, RecipeCategory.DECORATIONS,ModBlocks.RAW_ADDIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADDIUM_SWORD, 1)
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .input('A', ModItems.ADDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADDIUM_SWORD)));




    }

}
