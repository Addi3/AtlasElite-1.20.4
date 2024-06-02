package net.addie.atlaselite.datagen;

import net.addie.atlaselite.block.ModBlocks;
import net.addie.atlaselite.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static List<ItemConvertible> ADDIUM_SMELTABLES = List.of(ModItems.RAW_ADDIUM);
    private static List<ItemConvertible> ADDIUM_STONECUTTING = List.of(ModItems.ADDIUM_INGOT);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, ADDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ADDIUM_INGOT, 0.7f, 200, "addium");
        offerBlasting(exporter, ADDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ADDIUM_INGOT, 0.7f, 150, "addium");
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.SHATTERED_ADDIUM_INGOT, ModItems.ADDIUM_INGOT, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ADDIUM_BLOCK, ModBlocks.ADDIUM_WALL, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ADDIUM_BLOCK, ModBlocks.ADDIUM_SLAB, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ADDIUM_BLOCK, ModBlocks.ADDIUM_STAIRS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.WEAK_ADDIUM_BLOCK, ModBlocks.WEAK_ADDIUM_STAIRS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.WEAK_ADDIUM_BLOCK, ModBlocks.WEAK_ADDIUM_WALL, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.WEAK_ADDIUM_BLOCK, ModBlocks.WEAK_ADDIUM_SLAB, 1);



        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ADDIUM_WALL, ModBlocks.ADDIUM_BLOCK, 3);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ADDIUM_SLAB, ModBlocks.ADDIUM_BLOCK, 4);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ADDIUM_STAIRS, ModBlocks.ADDIUM_BLOCK, 6);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.WEAK_ADDIUM_STAIRS, ModBlocks.WEAK_ADDIUM_BLOCK, 6);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.WEAK_ADDIUM_WALL, ModBlocks.WEAK_ADDIUM_BLOCK, 3);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.WEAK_ADDIUM_SLAB, ModBlocks.WEAK_ADDIUM_BLOCK, 4);



            offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ADDIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ADDIUM_BLOCK);
            offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_ADDIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_ADDIUM_BLOCK);
            offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SHATTERED_ADDIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.WEAK_ADDIUM_BLOCK);

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

            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADDIUM_SILK, 1)
                    .input('A', ModItems.ADDIUM_INGOT)
                    .input('B', Items.STRING)
                    .pattern(" A ")
                    .pattern("ABA")
                    .pattern(" A ")
                    .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                    .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STRING))
                    .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADDIUM_SILK)));

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ADDIUM_SLAB, 1)
                    .input('A', ModItems.ADDIUM_INGOT)
                    .pattern("AAA")
                    .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                    .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADDIUM_SLAB)));

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ADDIUM_STAIRS, 1)
                    .input('A', ModItems.ADDIUM_INGOT)
                    .pattern("  A")
                    .pattern(" AA")
                    .pattern("AAA")
                    .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                    .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADDIUM_STAIRS)));

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ADDIUM_WALL, 1)
                    .input('A', ModItems.ADDIUM_INGOT)
                    .pattern("   ")
                    .pattern("AAA")
                    .pattern("AAA")
                    .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                    .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADDIUM_WALL)));


            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WEAK_ADDIUM_SLAB, 1)
                    .input('A', ModItems.SHATTERED_ADDIUM_INGOT)
                    .pattern("AAA")
                    .criterion(hasItem(ModItems.SHATTERED_ADDIUM_INGOT), conditionsFromItem(ModItems.SHATTERED_ADDIUM_INGOT))
                    .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WEAK_ADDIUM_SLAB)));

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WEAK_ADDIUM_STAIRS, 1)
                    .input('A', ModItems.SHATTERED_ADDIUM_INGOT)
                    .pattern("  A")
                    .pattern(" AA")
                    .pattern("AAA")
                    .criterion(hasItem(ModItems.SHATTERED_ADDIUM_INGOT), conditionsFromItem(ModItems.SHATTERED_ADDIUM_INGOT))
                    .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WEAK_ADDIUM_STAIRS)));

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WEAK_ADDIUM_WALL, 1)
                    .input('A', ModItems.SHATTERED_ADDIUM_INGOT)
                    .pattern("   ")
                    .pattern("AAA")
                    .pattern("AAA")
                    .criterion(hasItem(ModItems.SHATTERED_ADDIUM_INGOT), conditionsFromItem(ModItems.SHATTERED_ADDIUM_INGOT))
                    .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WEAK_ADDIUM_WALL)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ADDIUM_STAINED_GLASS, 1)
                .input('A', ModItems.ADDIUM_INGOT)
                .input('G', Items.GLASS)
                .pattern(" A ")
                .pattern("AGA")
                .pattern(" A ")
                .criterion(hasItem(ModItems.ADDIUM_INGOT), conditionsFromItem(ModItems.ADDIUM_INGOT))
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADDIUM_STAINED_GLASS)));


        }

    }
