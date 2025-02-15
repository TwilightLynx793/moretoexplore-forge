package com.ashiranjam.moretoexplore.datagen;

import com.ashiranjam.moretoexplore.MoreToExplore;
import com.ashiranjam.moretoexplore.block.ModBlocks;
import com.ashiranjam.moretoexplore.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreToExplore.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MYTHRIL_BLOCK.get())
                .add(ModBlocks.RAW_MYTHRIL_BLOCK.get())
                .add(ModBlocks.MYTHRIL_ORE.get())
                .add(ModBlocks.DEEPSLATE_MYTHRIL_ORE.get())
                .add(ModBlocks.MYTHRIL_STAIRS.get())
                .add(ModBlocks.MYTHRIL_SLAB.get())
                .add(ModBlocks.MYTHRIL_PRESSURE_PLATE.get())
                .add(ModBlocks.MYTHRIL_BUTTON.get())
                .add(ModBlocks.MYTHRIL_FENCE.get())
                .add(ModBlocks.MYTHRIL_FENCE_GATE.get())
                .add(ModBlocks.MYTHRIL_WALL.get())
                .add(ModBlocks.BLACK_OPAL_BLOCK.get())
                .add(ModBlocks.RAW_BLACK_OPAL_BLOCK.get())
                .add(ModBlocks.BLACK_OPAL_ORE.get())
                .add(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get())
                .add(ModBlocks.BLACK_OPAL_STAIRS.get())
                .add(ModBlocks.BLACK_OPAL_SLAB.get())
                .add(ModBlocks.BLACK_OPAL_PRESSURE_PLATE.get())
                .add(ModBlocks.BLACK_OPAL_BUTTON.get())
                .add(ModBlocks.BLACK_OPAL_FENCE.get())
                .add(ModBlocks.BLACK_OPAL_FENCE_GATE.get())
                .add(ModBlocks.BLACK_OPAL_WALL.get())
                .add(ModBlocks.BLACK_OPAL_DOOR.get())
                .add(ModBlocks.BLACK_OPAL_TRAPDOOR.get())
                .add(ModBlocks.AZURITE_BLOCK.get())
                .add(ModBlocks.AZURITE_ORE.get())
                .add(ModBlocks.AZURITE_DEEPSLATE_ORE.get())
                .add(ModBlocks.AZURITE_END_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.MYTHRIL_ORE.get())
                .add(ModBlocks.DEEPSLATE_MYTHRIL_ORE.get())
                .add(ModBlocks.BLACK_OPAL_ORE.get())
                .add(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get())
                .add(ModBlocks.MYTHRIL_BLOCK.get())
                .add(ModBlocks.RAW_MYTHRIL_BLOCK.get())
                .add(ModBlocks.MYTHRIL_STAIRS.get())
                .add(ModBlocks.MYTHRIL_SLAB.get())
                .add(ModBlocks.MYTHRIL_PRESSURE_PLATE.get())
                .add(ModBlocks.MYTHRIL_BUTTON.get())
                .add(ModBlocks.MYTHRIL_FENCE.get())
                .add(ModBlocks.MYTHRIL_FENCE_GATE.get())
                .add(ModBlocks.MYTHRIL_WALL.get())
                .add(ModBlocks.BLACK_OPAL_BLOCK.get())
                .add(ModBlocks.RAW_BLACK_OPAL_BLOCK.get())
                .add(ModBlocks.BLACK_OPAL_STAIRS.get())
                .add(ModBlocks.BLACK_OPAL_SLAB.get())
                .add(ModBlocks.BLACK_OPAL_PRESSURE_PLATE.get())
                .add(ModBlocks.BLACK_OPAL_BUTTON.get())
                .add(ModBlocks.BLACK_OPAL_FENCE.get())
                .add(ModBlocks.BLACK_OPAL_FENCE_GATE.get())
                .add(ModBlocks.BLACK_OPAL_WALL.get())
                .add(ModBlocks.BLACK_OPAL_TRAPDOOR.get())
                .add(ModBlocks.BLACK_OPAL_DOOR.get())
                .add(ModBlocks.AZURITE_BLOCK.get())
                .add(ModBlocks.AZURITE_ORE.get())
                .add(ModBlocks.AZURITE_DEEPSLATE_ORE.get())
                .add(ModBlocks.AZURITE_END_ORE.get());

        tag(BlockTags.FENCES)
                .add(ModBlocks.MYTHRIL_FENCE.get())
                .add(ModBlocks.BLACK_OPAL_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.MYTHRIL_FENCE_GATE.get())
                .add(ModBlocks.BLACK_OPAL_FENCE_GATE.get());

        tag(BlockTags.WALLS)
                .add(ModBlocks.MYTHRIL_WALL.get())
                .add(ModBlocks.BLACK_OPAL_WALL.get());

    }
}
