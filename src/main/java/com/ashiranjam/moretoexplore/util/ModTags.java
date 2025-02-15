package com.ashiranjam.moretoexplore.util;

import com.ashiranjam.moretoexplore.MoreToExplore;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MYTHRIL_TOOL = createTag("needs_mythril_tool");
        public static final TagKey<Block> INCORRECT_FOR_MYTHRIL_TOOL = createTag("incorrect_for_mythril_tool");

        public static final TagKey<Block> NEEDS_BLACK_OPAL_TOOL = createTag("needs_black_opal_tool");
        public static final TagKey<Block> INCORRECT_FOR_BLACK_OPAL_TOOL = createTag("incorrect_for_black_opal_tool");

        public static final TagKey<Block> NEEDS_AZURITE_TOOL = createTag("needs_azurite_tool");
        public static final TagKey<Block> INCORRECT_FOR_AZURITE_TOOL = createTag("incorrect_for_azurite_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MoreToExplore.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MoreToExplore.MOD_ID, name));
        }
    }
}
