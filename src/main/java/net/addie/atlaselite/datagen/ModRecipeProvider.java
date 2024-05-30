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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADDIUM_SHOVEL, 1)
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .input('A', ModItems.ADDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADDIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADDIUM_PICKAXE, 1)
                .input('A', ModItems.ADDIUM_INGOT)
                .input('S', Items.STICK)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADDIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADDIUM_AXE, 1)
                .input('A', ModItems.ADDIUM_INGOT)
                .input('S', Items.STICK)
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADDIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADDIUM_HOE, 1)
                .input('A', ModItems.ADDIUM_INGOT)
                .input('S', Items.STICK)
                .pattern("AA ")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADDIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADDIUM_INGOT_HELMET, 1)
                .input('A', ModItems.ADDIUM_INGOT)
                .pattern("AAA")
                .pattern("A A")
                .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADDIUM_INGOT_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADDIUM_INGOT_CHESTPLATE, 1)
                .input('A', ModItems.ADDIUM_INGOT)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADDIUM_INGOT_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADDIUM_INGOT_LEGGINGS, 1)
                .input('A', ModItems.ADDIUM_INGOT)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADDIUM_INGOT_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADDIUM_INGOT_BOOTS, 1)
                .input('A', ModItems.ADDIUM_INGOT)
                .pattern("A A")
                .pattern("A A")
                .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADDIUM_INGOT_BOOTS)));







    }

}
