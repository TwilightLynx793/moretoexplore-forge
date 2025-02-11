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

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
