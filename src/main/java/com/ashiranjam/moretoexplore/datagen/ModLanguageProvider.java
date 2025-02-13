package com.ashiranjam.moretoexplore.datagen;

import com.ashiranjam.moretoexplore.block.ModBlocks;
import com.ashiranjam.moretoexplore.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        addItem(ModItems.MYTHRIL_INGOT, "Mythril Ingot");
        addItem(ModItems.RAW_MYTHRIL, "Raw Mythril");

        addItem(ModItems.MYTHRIL_PICKAXE, "Mythril Pickaxe");
        addItem(ModItems.MYTHRIL_AXE, "Mythril Axe");
        addItem(ModItems.MYTHRIL_SWORD, "Mythril Sword");
        addItem(ModItems.MYTHRIL_SHOVEL, "Mythril Shovel");
        addItem(ModItems.MYTHRIL_HOE, "Mythril Hoe");

        addItem(ModItems.MYTHRIL_HELMET, "Mythril Helmet");
        addItem(ModItems.MYTHRIL_CHESTPLATE, "Mythril Chestplate");
        addItem(ModItems.MYTHRIL_LEGGINGS, "Mythril Leggings");
        addItem(ModItems.MYTHRIL_BOOTS, "Mythril Boots");

        addItem(ModItems.BLACK_OPAL, "Black Opal");
        addItem(ModItems.RAW_BLACK_OPAL, "Raw Black Opal");

        addItem(ModItems.BLACK_OPAL_PICKAXE, "Black Opal Pickaxe");
        addItem(ModItems.BLACK_OPAL_AXE, "Black Opal Axe");
        addItem(ModItems.BLACK_OPAL_SWORD, "Black Opal Sword");
        addItem(ModItems.BLACK_OPAL_SHOVEL, "Black Opal Shovel");
        addItem(ModItems.BLACK_OPAL_HOE, "Black Opal Hoe");

        addBlock(ModBlocks.MYTHRIL_BLOCK, "Mythril Block");
        addBlock(ModBlocks.RAW_MYTHRIL_BLOCK, "Raw Mythril Block");
        addBlock(ModBlocks.MYTHRIL_ORE, "Mythril Ore");
        addBlock(ModBlocks.DEEPSLATE_MYTHRIL_ORE, "Deepslate Mythril Ore");

        addBlock(ModBlocks.MYTHRIL_STAIRS, "Mythril Stairs");
        addBlock(ModBlocks.MYTHRIL_SLAB, "Mythril Slab");
        addBlock(ModBlocks.MYTHRIL_PRESSURE_PLATE, "Mythril Pressure Plate");
        addBlock(ModBlocks.MYTHRIL_BUTTON, "Mythril Button");
        addBlock(ModBlocks.MYTHRIL_FENCE, "Mythril Fence");
        addBlock(ModBlocks.MYTHRIL_FENCE_GATE, "Mythril Fence Gate");
        addBlock(ModBlocks.MYTHRIL_WALL, "Mythril Wall");

        addBlock(ModBlocks.BLACK_OPAL_BLOCK, "Black Opal Block");
        addBlock(ModBlocks.RAW_BLACK_OPAL_BLOCK, "Raw Black Opal Block");
        addBlock(ModBlocks.BLACK_OPAL_ORE, "Black Opal Ore");
        addBlock(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE, "Deepslate Black Opal Ore");
    }
}
