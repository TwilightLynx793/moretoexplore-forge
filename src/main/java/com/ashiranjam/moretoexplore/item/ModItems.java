package com.ashiranjam.moretoexplore.item;

import com.ashiranjam.moretoexplore.MoreToExplore;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreToExplore.MOD_ID);

    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
