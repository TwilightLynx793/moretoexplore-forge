package com.ashiranjam.moretoexplore.datagen;

import com.ashiranjam.moretoexplore.block.ModBlocks;
import com.ashiranjam.moretoexplore.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.MYTHRIL_BLOCK.get());
        dropSelf(ModBlocks.RAW_MYTHRIL_BLOCK.get());
        dropSelf(ModBlocks.BLACK_OPAL_BLOCK.get());
        dropSelf(ModBlocks.RAW_BLACK_OPAL_BLOCK.get());

        dropSelf(ModBlocks.MYTHRIL_STAIRS.get());
        dropSelf(ModBlocks.MYTHRIL_SLAB.get());
        dropSelf(ModBlocks.MYTHRIL_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.MYTHRIL_BUTTON.get());
        dropSelf(ModBlocks.MYTHRIL_FENCE.get());
        dropSelf(ModBlocks.MYTHRIL_FENCE_GATE.get());
        dropSelf(ModBlocks.MYTHRIL_WALL.get());

        dropSelf(ModBlocks.BLACK_OPAL_STAIRS.get());
        dropSelf(ModBlocks.BLACK_OPAL_SLAB.get());
        dropSelf(ModBlocks.BLACK_OPAL_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BLACK_OPAL_BUTTON.get());
        dropSelf(ModBlocks.BLACK_OPAL_FENCE.get());
        dropSelf(ModBlocks.BLACK_OPAL_FENCE_GATE.get());
        dropSelf(ModBlocks.BLACK_OPAL_WALL.get());
        dropSelf(ModBlocks.BLACK_OPAL_TRAPDOOR.get());

        dropSelf(ModBlocks.AZURITE_STAIRS.get());
        dropSelf(ModBlocks.AZURITE_SLAB.get());
        dropSelf(ModBlocks.AZURITE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.AZURITE_BUTTON.get());
        dropSelf(ModBlocks.AZURITE_FENCE.get());
        dropSelf(ModBlocks.AZURITE_FENCE_GATE.get());
        dropSelf(ModBlocks.AZURITE_WALL.get());
        dropSelf(ModBlocks.AZURITE_TRAPDOOR.get());

        dropSelf(ModBlocks.AZURITE_BLOCK.get());

        dropSelf(ModBlocks.BISMUTH_BLOCK.get());

        this.add(ModBlocks.BLACK_OPAL_DOOR.get(),
                block -> createDoorTable(ModBlocks.BLACK_OPAL_DOOR.get()));

        this.add(ModBlocks.AZURITE_DOOR.get(),
                block -> createDoorTable(ModBlocks.AZURITE_DOOR.get()));

        this.add(ModBlocks.MYTHRIL_ORE.get(),
                block -> createOreDrop(ModBlocks.MYTHRIL_ORE.get(), ModItems.RAW_MYTHRIL.get()));

        this.add(ModBlocks.DEEPSLATE_MYTHRIL_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_MYTHRIL_ORE.get(), ModItems.RAW_MYTHRIL.get()));

        this.add(ModBlocks.BLACK_OPAL_ORE.get(),
                block -> createOreDrop(ModBlocks.BLACK_OPAL_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));

        this.add(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));

        this.add(ModBlocks.AZURITE_ORE.get(),
                block -> createOreDrop(ModBlocks.AZURITE_ORE.get(), ModItems.RAW_AZURITE.get()));
        this.add(ModBlocks.AZURITE_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.AZURITE_DEEPSLATE_ORE.get(), ModItems.RAW_AZURITE.get()));
        this.add(ModBlocks.AZURITE_END_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.AZURITE_END_ORE.get(), ModItems.RAW_AZURITE.get(), 2, 4));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
