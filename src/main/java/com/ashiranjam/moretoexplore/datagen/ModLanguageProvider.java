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

        addBlock(ModBlocks.MYTHRIL_BLOCK, "Mythril Block");
        addBlock(ModBlocks.RAW_MYTHRIL_BLOCK, "Raw Mythril Block");
        addBlock(ModBlocks.MYTHRIL_ORE, "Mythril Ore");
        addBlock(ModBlocks.DEEPSLATE_MYTHRIL_ORE, "Deepslate Mythril Ore");
    }
}
