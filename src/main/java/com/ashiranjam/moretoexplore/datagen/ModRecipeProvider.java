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

        List<ItemLike> MYTHRIL_ARMOR_ITEMS = List.of(ModItems.MYTHRIL_HELMET.get(), ModItems.MYTHRIL_CHESTPLATE.get(),
                ModItems.MYTHRIL_LEGGINGS.get(), ModItems.MYTHRIL_BOOTS.get());

        List<ItemLike> BLACK_OPAL_SMELATBLES = List.of(ModItems.RAW_BLACK_OPAL.get(), ModBlocks.BLACK_OPAL_ORE.get(),
                ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get());

        List<ItemLike> BLACK_OPAL_TOOLS = List.of(ModItems.BLACK_OPAL_PICKAXE.get(), ModItems.BLACK_OPAL_AXE.get(),
                ModItems.BLACK_OPAL_SWORD.get(), ModItems.BLACK_OPAL_SHOVEL.get(), ModItems.BLACK_OPAL_HOE.get());

        List<ItemLike> BLACK_OPAL_ARMOR_ITEMS = List.of(ModItems.BLACK_OPAL_HELMET.get(), ModItems.BLACK_OPAL_CHESTPLATE.get(),
                ModItems.BLACK_OPAL_LEGGINGS.get(), ModItems.BLACK_OPAL_BOOTS.get());

        List<ItemLike> AZURITE_SMELTABLES = List.of(ModItems.RAW_AZURITE.get(),
                ModBlocks.AZURITE_ORE.get(), ModBlocks.AZURITE_DEEPSLATE_ORE.get(), ModBlocks.AZURITE_END_ORE.get());

        List<ItemLike> AZURITE_TOOLS = List.of(ModItems.AZURITE_PICKAXE.get(), ModItems.AZURITE_AXE.get(),
                ModItems.AZURITE_SWORD.get(), ModItems.AZURITE_SHOVEL.get(), ModItems.AZURITE_HOE.get());

        List<ItemLike> AZURITE_ARMOR_ITEMS = List.of(ModItems.AZURITE_HELMET.get(), ModItems.AZURITE_CHESTPLATE.get(),
                ModItems.AZURITE_LEGGINGS.get(), ModItems.AZURITE_BOOTS.get());

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
        ArmorRecipeBuilder(MYTHRIL_ARMOR_ITEMS, ModItems.MYTHRIL_INGOT.get(), pRecipeOutput);

        oreSmelting(pRecipeOutput, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 0.25f, 200, "mythril");
        oreBlasting(pRecipeOutput, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 0.25f, 100, "mythril");

        stairBuilder(ModBlocks.MYTHRIL_STAIRS.get(), Ingredient.of(ModItems.MYTHRIL_INGOT.get())).group("mythril")
                .unlockedBy(getHasName(ModItems.MYTHRIL_INGOT.get()), has(ModItems.MYTHRIL_INGOT.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MYTHRIL_SLAB.get(), ModItems.MYTHRIL_INGOT.get());

        buttonBuilder(ModBlocks.MYTHRIL_BUTTON.get(), Ingredient.of(ModItems.MYTHRIL_INGOT.get())).group("mythril")
                .unlockedBy(getHasName(ModItems.MYTHRIL_INGOT.get()), has(ModItems.MYTHRIL_INGOT.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.MYTHRIL_PRESSURE_PLATE.get(), ModItems.MYTHRIL_INGOT.get());

        fenceBuilder(ModBlocks.MYTHRIL_FENCE.get(), Ingredient.of(ModItems.MYTHRIL_INGOT.get())).group("mythril")
                .unlockedBy(getHasName(ModItems.MYTHRIL_INGOT.get()), has(ModItems.MYTHRIL_INGOT.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.MYTHRIL_FENCE_GATE.get(), Ingredient.of(ModItems.MYTHRIL_INGOT.get())).group("mythril")
                .unlockedBy(getHasName(ModItems.MYTHRIL_INGOT.get()), has(ModItems.MYTHRIL_INGOT.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MYTHRIL_WALL.get(), ModItems.MYTHRIL_INGOT.get());



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_OPAL_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.BLACK_OPAL.get())
                .unlockedBy(getHasName(ModItems.BLACK_OPAL.get()), has(ModItems.BLACK_OPAL.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLACK_OPAL.get(), 9)
                .requires(ModBlocks.BLACK_OPAL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_OPAL_BLOCK.get()), has(ModBlocks.BLACK_OPAL_BLOCK.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_BLACK_OPAL_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.RAW_BLACK_OPAL.get())
                .unlockedBy(getHasName(ModItems.RAW_BLACK_OPAL.get()), has(ModItems.RAW_BLACK_OPAL.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_BLACK_OPAL.get(), 9)
                .requires(ModBlocks.RAW_BLACK_OPAL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_BLACK_OPAL_BLOCK.get()), has(ModBlocks.RAW_MYTHRIL_BLOCK.get())).save(pRecipeOutput);

        oreSmelting(pRecipeOutput, BLACK_OPAL_SMELATBLES, RecipeCategory.MISC, ModItems.BLACK_OPAL.get(), 0.25f, 200, "black_opal");
        oreBlasting(pRecipeOutput, BLACK_OPAL_SMELATBLES, RecipeCategory.MISC, ModItems.BLACK_OPAL.get(), 0.25f, 100, "black_opal");

        ToolRecipeBuilder(BLACK_OPAL_TOOLS, ModItems.BLACK_OPAL.get(), pRecipeOutput);
        ArmorRecipeBuilder(BLACK_OPAL_ARMOR_ITEMS, ModItems.BLACK_OPAL.get(), pRecipeOutput);

        stairBuilder(ModBlocks.BLACK_OPAL_STAIRS.get(), Ingredient.of(ModItems.BLACK_OPAL.get())).group("black_opal")
                .unlockedBy(getHasName(ModItems.BLACK_OPAL.get()), has(ModItems.BLACK_OPAL.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_OPAL_SLAB.get(), ModItems.BLACK_OPAL.get());

        buttonBuilder(ModBlocks.BLACK_OPAL_BUTTON.get(), Ingredient.of(ModItems.BLACK_OPAL.get())).group("black_opal")
                .unlockedBy(getHasName(ModItems.BLACK_OPAL.get()), has(ModItems.BLACK_OPAL.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.BLACK_OPAL_PRESSURE_PLATE.get(), ModItems.BLACK_OPAL.get());

        fenceBuilder(ModBlocks.BLACK_OPAL_FENCE.get(), Ingredient.of(ModItems.BLACK_OPAL.get())).group("black_opal")
                .unlockedBy(getHasName(ModItems.BLACK_OPAL.get()), has(ModItems.BLACK_OPAL.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.BLACK_OPAL_FENCE_GATE.get(), Ingredient.of(ModItems.BLACK_OPAL.get())).group("black_opal")
                .unlockedBy(getHasName(ModItems.BLACK_OPAL.get()), has(ModItems.BLACK_OPAL.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_OPAL_WALL.get(), ModItems.BLACK_OPAL.get());

        doorBuilder(ModBlocks.BLACK_OPAL_DOOR.get(), Ingredient.of(ModItems.BLACK_OPAL.get())).group("black_opal")
                .unlockedBy(getHasName(ModItems.BLACK_OPAL.get()), has(ModItems.BLACK_OPAL.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.BLACK_OPAL_TRAPDOOR.get(), Ingredient.of(ModItems.BLACK_OPAL.get())).group("black_opal")
                .unlockedBy(getHasName(ModItems.BLACK_OPAL.get()), has(ModItems.BLACK_OPAL.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AZURITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AZURITE.get())
                .unlockedBy(getHasName(ModItems.AZURITE.get()), has(ModItems.AZURITE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AZURITE.get(), 9)
                .requires(ModBlocks.AZURITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.AZURITE_BLOCK.get()), has(ModBlocks.AZURITE_BLOCK.get())).save(pRecipeOutput);

        oreSmelting(pRecipeOutput, AZURITE_SMELTABLES, RecipeCategory.MISC, ModItems.AZURITE.get(), 0.25f, 200, "azurite");
        oreBlasting(pRecipeOutput, AZURITE_SMELTABLES, RecipeCategory.MISC, ModItems.AZURITE.get(), 0.25f, 100, "azurite");

        ToolRecipeBuilder(AZURITE_TOOLS, ModItems.AZURITE.get(), pRecipeOutput);
        ArmorRecipeBuilder(AZURITE_ARMOR_ITEMS, ModItems.AZURITE.get(), pRecipeOutput);


        stairBuilder(ModBlocks.AZURITE_STAIRS.get(), Ingredient.of(ModItems.AZURITE.get())).group("azurite")
                .unlockedBy(getHasName(ModItems.AZURITE.get()), has(ModItems.AZURITE.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZURITE_SLAB.get(), ModItems.AZURITE.get());

        buttonBuilder(ModBlocks.AZURITE_BUTTON.get(), Ingredient.of(ModItems.AZURITE.get())).group("azurite")
                .unlockedBy(getHasName(ModItems.AZURITE.get()), has(ModItems.AZURITE.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.AZURITE_PRESSURE_PLATE.get(), ModItems.AZURITE.get());

        fenceBuilder(ModBlocks.AZURITE_FENCE.get(), Ingredient.of(ModItems.AZURITE.get())).group("azurite")
                .unlockedBy(getHasName(ModItems.AZURITE.get()), has(ModItems.AZURITE.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.AZURITE_FENCE_GATE.get(), Ingredient.of(ModItems.AZURITE.get())).group("azurite")
                .unlockedBy(getHasName(ModItems.AZURITE.get()), has(ModItems.AZURITE.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZURITE_WALL.get(), ModItems.AZURITE.get());

        doorBuilder(ModBlocks.AZURITE_DOOR.get(), Ingredient.of(ModItems.AZURITE.get())).group("azurite")
                .unlockedBy(getHasName(ModItems.AZURITE.get()), has(ModItems.AZURITE.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.AZURITE_TRAPDOOR.get(), Ingredient.of(ModItems.AZURITE.get())).group("azurite")
                .unlockedBy(getHasName(ModItems.AZURITE.get()), has(ModItems.AZURITE.get())).save(pRecipeOutput);

    }

    protected static void ArmorRecipeBuilder(List<ItemLike> result, ItemLike craftingItem, RecipeOutput output){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result.get(0), 1)
                .pattern("MMM")
                .pattern("M M")
                .define('M', craftingItem)
                .unlockedBy(getHasName(craftingItem), has(craftingItem)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result.get(1), 1)
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', craftingItem)
                .unlockedBy(getHasName(craftingItem), has(craftingItem)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result.get(2), 1)
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', craftingItem)
                .unlockedBy(getHasName(craftingItem), has(craftingItem)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result.get(3), 1)
                .pattern("M M")
                .pattern("M M")
                .define('M', craftingItem)
                .unlockedBy(getHasName(craftingItem), has(craftingItem)).save(output);

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
