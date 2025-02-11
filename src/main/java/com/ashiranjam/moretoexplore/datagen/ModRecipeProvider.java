package com.ashiranjam.moretoexplore.datagen;

import com.ashiranjam.moretoexplore.MoreToExplore;
import com.ashiranjam.moretoexplore.block.ModBlocks;
import com.ashiranjam.moretoexplore.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> MYTHRIL_SMELTABLES = List.of(ModItems.RAW_MYTHRIL.get(), ModBlocks.MYTHRIL_ORE.get(),
                ModBlocks.DEEPSLATE_MYTHRIL_ORE.get());

        List<ItemLike> MYTHRIL_TOOLS = List.of(ModItems.MYTHRIL_PICKAXE.get(), ModItems.MYTHRIL_AXE.get(),
                ModItems.MYTHRIL_SWORD.get(), ModItems.MYTHRIL_SHOVEL.get(),ModItems.MYTHRIL_HOE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MYTHRIL_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.MYTHRIL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MYTHRIL_INGOT.get()), has(ModItems.MYTHRIL_INGOT.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 9)
                .requires(ModBlocks.MYTHRIL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.MYTHRIL_BLOCK.get()), has(ModBlocks.MYTHRIL_BLOCK.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_MYTHRIL_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.RAW_MYTHRIL.get())
                .unlockedBy(getHasName(ModItems.RAW_MYTHRIL.get()), has(ModItems.RAW_MYTHRIL.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_MYTHRIL.get(), 9)
                .requires(ModBlocks.RAW_MYTHRIL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_MYTHRIL_BLOCK.get()), has(ModBlocks.RAW_MYTHRIL_BLOCK.get())).save(pRecipeOutput);

        ToolRecipeBuilder(MYTHRIL_TOOLS, ModItems.MYTHRIL_INGOT.get(), pRecipeOutput);

        oreSmelting(pRecipeOutput, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 0.25f, 200, "mythril");
        oreBlasting(pRecipeOutput, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 0.25f, 100, "mythril");

    }

    protected static void ToolRecipeBuilder(List<ItemLike> result, ItemLike craftingItem, RecipeOutput output){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result.get(0), 1)
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', craftingItem)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(craftingItem), has(craftingItem)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result.get(1), 1)
                .pattern("MM")
                .pattern("SM")
                .pattern("S ")
                .define('M', craftingItem)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(craftingItem), has(craftingItem)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result.get(2), 1)
                .pattern("M")
                .pattern("M")
                .pattern("S")
                .define('M', craftingItem)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(craftingItem), has(craftingItem)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result.get(3), 1)
                .pattern("M")
                .pattern("S")
                .pattern("S")
                .define('M', craftingItem)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(craftingItem), has(craftingItem)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result.get(4), 1)
                .pattern("MM")
                .pattern("S ")
                .pattern("S ")
                .define('M', craftingItem)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(craftingItem), has(craftingItem)).save(output);
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, MoreToExplore.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
