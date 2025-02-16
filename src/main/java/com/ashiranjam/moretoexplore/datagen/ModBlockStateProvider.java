package com.ashiranjam.moretoexplore.datagen;

import com.ashiranjam.moretoexplore.MoreToExplore;
import com.ashiranjam.moretoexplore.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
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
        blockWithItem(ModBlocks.BLACK_OPAL_BLOCK);
        blockWithItem(ModBlocks.RAW_BLACK_OPAL_BLOCK);
        blockWithItem(ModBlocks.BLACK_OPAL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE);
        blockWithItem(ModBlocks.AZURITE_BLOCK);
        blockWithItem(ModBlocks.AZURITE_ORE);
        blockWithItem(ModBlocks.AZURITE_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.AZURITE_END_ORE);
        blockWithItem(ModBlocks.BISMUTH_BLOCK);


        stairsBlock(ModBlocks.MYTHRIL_STAIRS.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));
        slabBlock(ModBlocks.MYTHRIL_SLAB.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));

        buttonBlock(ModBlocks.MYTHRIL_BUTTON.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));
        pressurePlateBlock(ModBlocks.MYTHRIL_PRESSURE_PLATE.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));

        fenceBlock(ModBlocks.MYTHRIL_FENCE.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));
        fenceGateBlock(ModBlocks.MYTHRIL_FENCE_GATE.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));
        wallBlock(ModBlocks.MYTHRIL_WALL.get(), blockTexture(ModBlocks.MYTHRIL_BLOCK.get()));

        stairsBlock(ModBlocks.BLACK_OPAL_STAIRS.get(), blockTexture(ModBlocks.BLACK_OPAL_BLOCK.get()));
        slabBlock(ModBlocks.BLACK_OPAL_SLAB.get(), blockTexture(ModBlocks.BLACK_OPAL_BLOCK.get()), blockTexture(ModBlocks.BLACK_OPAL_BLOCK.get()));

        buttonBlock(ModBlocks.BLACK_OPAL_BUTTON.get(), blockTexture(ModBlocks.BLACK_OPAL_BLOCK.get()));
        pressurePlateBlock(ModBlocks.BLACK_OPAL_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BLACK_OPAL_BLOCK.get()));

        fenceBlock(ModBlocks.BLACK_OPAL_FENCE.get(), blockTexture(ModBlocks.BLACK_OPAL_BLOCK.get()));
        fenceGateBlock(ModBlocks.BLACK_OPAL_FENCE_GATE.get(), blockTexture(ModBlocks.BLACK_OPAL_BLOCK.get()));
        wallBlock(ModBlocks.BLACK_OPAL_WALL.get(), blockTexture(ModBlocks.BLACK_OPAL_BLOCK.get()));
        doorBlockWithRenderType(ModBlocks.BLACK_OPAL_DOOR.get(), modLoc("block/black_opal_door_bottom"), modLoc("block/black_opal_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.BLACK_OPAL_TRAPDOOR.get(), modLoc("block/black_opal_trapdoor"), true, "cutout");

        stairsBlock(((StairBlock) ModBlocks.AZURITE_STAIRS.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.AZURITE_SLAB.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.AZURITE_BUTTON.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.AZURITE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.AZURITE_FENCE.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.AZURITE_FENCE_GATE.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.AZURITE_WALL.get()), blockTexture(ModBlocks.AZURITE_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.AZURITE_DOOR.get()), modLoc("block/azurite_door_bottom"), modLoc("block/azurite_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.AZURITE_TRAPDOOR.get()), modLoc("block/azurite_trapdoor"), true, "cutout");


        blockItem(ModBlocks.MYTHRIL_STAIRS);
        blockItem(ModBlocks.MYTHRIL_SLAB);
        blockItem(ModBlocks.MYTHRIL_PRESSURE_PLATE);
        blockItem(ModBlocks.MYTHRIL_FENCE_GATE);

        blockItem(ModBlocks.BLACK_OPAL_STAIRS);
        blockItem(ModBlocks.BLACK_OPAL_SLAB);
        blockItem(ModBlocks.BLACK_OPAL_PRESSURE_PLATE);
        blockItem(ModBlocks.BLACK_OPAL_FENCE_GATE);
        blockItem(ModBlocks.BLACK_OPAL_TRAPDOOR, "_bottom");

        blockItem(ModBlocks.AZURITE_STAIRS);
        blockItem(ModBlocks.AZURITE_SLAB);
        blockItem(ModBlocks.AZURITE_PRESSURE_PLATE);
        blockItem(ModBlocks.AZURITE_FENCE_GATE);
        blockItem(ModBlocks.AZURITE_TRAPDOOR, "_bottom");
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
