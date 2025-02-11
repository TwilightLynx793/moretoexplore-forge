package com.ashiranjam.moretoexplore.datagen;

import com.ashiranjam.moretoexplore.MoreToExplore;
import com.ashiranjam.moretoexplore.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreToExplore.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.MYTHRIL_BLOCK);
        blockWithItem(ModBlocks.RAW_MYTHRIL_BLOCK);
        blockWithItem(ModBlocks.MYTHRIL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MYTHRIL_ORE);


        stairsBlock(ModBlocks.MYTHRIL_STAIRS.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));
        slabBlock(ModBlocks.MYTHRIL_SLAB.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));

        buttonBlock(ModBlocks.MYTHRIL_BUTTON.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));
        pressurePlateBlock(ModBlocks.MYTHRIL_PRESSURE_PLATE.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));

        fenceBlock(ModBlocks.MYTHRIL_FENCE.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));
        fenceGateBlock(ModBlocks.MYTHRIL_FENCE_GATE.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));
        wallBlock(ModBlocks.MYTHRIL_WALL.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));

        blockItem(ModBlocks.MYTHRIL_STAIRS);
        blockItem(ModBlocks.MYTHRIL_SLAB);
        blockItem(ModBlocks.MYTHRIL_PRESSURE_PLATE);
        blockItem(ModBlocks.MYTHRIL_FENCE_GATE);
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("moretoexplore:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("moretoexplore:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
