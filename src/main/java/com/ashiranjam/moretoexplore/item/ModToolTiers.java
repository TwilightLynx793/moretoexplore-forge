package com.ashiranjam.moretoexplore.item;

import com.ashiranjam.moretoexplore.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier MYTHRIL = new ForgeTier(600, 6.5f, 2.5f, 16,
            ModTags.Blocks.NEEDS_MYTHRIL_TOOL, () -> Ingredient.of(ModItems.MYTHRIL_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_MYTHRIL_TOOL);
}
