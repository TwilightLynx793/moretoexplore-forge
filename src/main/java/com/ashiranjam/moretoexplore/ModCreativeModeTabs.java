package com.ashiranjam.moretoexplore;

import com.ashiranjam.moretoexplore.block.ModBlocks;
import com.ashiranjam.moretoexplore.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreToExplore.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MORE_TO_EXPLORE_TAB = CREATIVE_MODE_TABS.register("more_to_explore_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MYTHRIL_INGOT.get()))
                    .title(Component.literal("More To Explore"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MYTHRIL_INGOT.get());
                        output.accept(ModItems.RAW_MYTHRIL.get());
                        output.accept(ModBlocks.MYTHRIL_BLOCK.get());
                        output.accept(ModBlocks.RAW_MYTHRIL_BLOCK.get());
                        output.accept(ModBlocks.MYTHRIL_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_MYTHRIL_ORE.get());

                        output.accept(ModItems.MYTHRIL_SWORD.get());
                        output.accept(ModItems.MYTHRIL_PICKAXE.get());
                        output.accept(ModItems.MYTHRIL_SHOVEL.get());
                        output.accept(ModItems.MYTHRIL_AXE.get());
                        output.accept(ModItems.MYTHRIL_HOE.get());

                        output.accept(ModItems.MYTHRIL_HELMET.get());
                        output.accept(ModItems.MYTHRIL_CHESTPLATE.get());
                        output.accept(ModItems.MYTHRIL_LEGGINGS.get());
                        output.accept(ModItems.MYTHRIL_BOOTS.get());

                        output.accept(ModBlocks.MYTHRIL_STAIRS.get());
                        output.accept(ModBlocks.MYTHRIL_SLAB.get());

                        output.accept(ModBlocks.MYTHRIL_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.MYTHRIL_BUTTON.get());

                        output.accept(ModBlocks.MYTHRIL_FENCE.get());
                        output.accept(ModBlocks.MYTHRIL_FENCE_GATE.get());
                        output.accept(ModBlocks.MYTHRIL_WALL.get());

                        output.accept(ModItems.BLACK_OPAL.get());
                        output.accept(ModItems.RAW_BLACK_OPAL.get());
                        output.accept(ModBlocks.BLACK_OPAL_BLOCK.get());
                        output.accept(ModBlocks.RAW_BLACK_OPAL_BLOCK.get());
                        output.accept(ModBlocks.BLACK_OPAL_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get());

                        output.accept(ModItems.BLACK_OPAL_PICKAXE.get());
                        output.accept(ModItems.BLACK_OPAL_AXE.get());
                        output.accept(ModItems.BLACK_OPAL_SWORD.get());
                        output.accept(ModItems.BLACK_OPAL_SHOVEL.get());
                        output.accept(ModItems.BLACK_OPAL_HOE.get());

                        output.accept(ModItems.BLACK_OPAL_HELMET.get());
                        output.accept(ModItems.BLACK_OPAL_CHESTPLATE.get());
                        output.accept(ModItems.BLACK_OPAL_LEGGINGS.get());
                        output.accept(ModItems.BLACK_OPAL_BOOTS.get());

                        output.accept(ModBlocks.BLACK_OPAL_STAIRS.get());
                        output.accept(ModBlocks.BLACK_OPAL_SLAB.get());

                        output.accept(ModBlocks.BLACK_OPAL_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.BLACK_OPAL_BUTTON.get());

                        output.accept(ModBlocks.BLACK_OPAL_FENCE.get());
                        output.accept(ModBlocks.BLACK_OPAL_FENCE_GATE.get());
                        output.accept(ModBlocks.BLACK_OPAL_WALL.get());

                        output.accept(ModBlocks.BLACK_OPAL_DOOR.get());
                        output.accept(ModBlocks.BLACK_OPAL_TRAPDOOR.get());

                        output.accept(ModItems.AZURITE.get());
                        output.accept(ModItems.RAW_AZURITE.get());
                        output.accept(ModBlocks.AZURITE_BLOCK.get());
                        output.accept(ModBlocks.AZURITE_ORE.get());
                        output.accept(ModBlocks.AZURITE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.AZURITE_END_ORE.get());

                        output.accept(ModItems.AZURITE_PICKAXE.get());
                        output.accept(ModItems.AZURITE_AXE.get());
                        output.accept(ModItems.AZURITE_SWORD.get());
                        output.accept(ModItems.AZURITE_SHOVEL.get());
                        output.accept(ModItems.AZURITE_HOE.get());

                        output.accept(ModItems.AZURITE_HELMET.get());
                        output.accept(ModItems.AZURITE_CHESTPLATE.get());
                        output.accept(ModItems.AZURITE_LEGGINGS.get());
                        output.accept(ModItems.AZURITE_BOOTS.get());

                        output.accept(ModBlocks.AZURITE_STAIRS.get());
                        output.accept(ModBlocks.AZURITE_SLAB.get());

                        output.accept(ModBlocks.AZURITE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.AZURITE_BUTTON.get());

                        output.accept(ModBlocks.AZURITE_FENCE.get());
                        output.accept(ModBlocks.AZURITE_FENCE_GATE.get());
                        output.accept(ModBlocks.AZURITE_WALL.get());

                        output.accept(ModBlocks.AZURITE_DOOR.get());
                        output.accept(ModBlocks.AZURITE_TRAPDOOR.get());

                        output.accept(ModItems.BISMUTH.get());
                        output.accept(ModItems.RAW_BISMUTH.get());
                        output.accept(ModBlocks.BISMUTH_BLOCK.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
