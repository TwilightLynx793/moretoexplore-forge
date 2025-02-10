package com.ashiranjam.moretoexplore.datagen;

import com.ashiranjam.moretoexplore.MoreToExplore;
import com.ashiranjam.moretoexplore.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreToExplore.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.MYTHRIL_INGOT.get());
    }
}
