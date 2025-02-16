package com.ashiranjam.moretoexplore.item;

import com.ashiranjam.moretoexplore.MoreToExplore;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreToExplore.MOD_ID);

    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MYTHRIL = ITEMS.register("raw_mythril",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_SWORD = ITEMS.register("mythril_sword",
            () -> new SwordItem(ModToolTiers.MYTHRIL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.MYTHRIL, 4, -2.4f))));

    public static final RegistryObject<Item> MYTHRIL_PICKAXE = ITEMS.register("mythril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MYTHRIL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.MYTHRIL, 1.5f, -2.8f))));

    public static final RegistryObject<Item> MYTHRIL_SHOVEL = ITEMS.register("mythril_shovel",
            () -> new ShovelItem(ModToolTiers.MYTHRIL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.MYTHRIL, 2f, -3.0f))));

    public static final RegistryObject<Item> MYTHRIL_AXE = ITEMS.register("mythril_axe",
            () -> new AxeItem(ModToolTiers.MYTHRIL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.MYTHRIL, 7, -3.1f))));

    public static final RegistryObject<Item> MYTHRIL_HOE = ITEMS.register("mythril_hoe",
            () -> new HoeItem(ModToolTiers.MYTHRIL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.MYTHRIL, -2, -1f))));

    public static final RegistryObject<Item> MYTHRIL_HELMET = ITEMS.register("mythril_helmet",
            () -> new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));

    public static final RegistryObject<Item> MYTHRIL_CHESTPLATE = ITEMS.register("mythril_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));

    public static final RegistryObject<Item> MYTHRIL_LEGGINGS = ITEMS.register("mythril_leggings",
            () -> new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));

    public static final RegistryObject<Item> MYTHRIL_BOOTS = ITEMS.register("mythril_boots",
            () -> new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));


    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BLACK_OPAL = ITEMS.register("raw_black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_OPAL_SWORD = ITEMS.register("black_opal_sword",
            () -> new SwordItem(ModToolTiers.BLACK_OPAL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.MYTHRIL, 5, -2.4f))));

    public static final RegistryObject<Item> BLACK_OPAL_PICKAXE = ITEMS.register("black_opal_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BLACK_OPAL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.MYTHRIL, 2f, -2.8f))));

    public static final RegistryObject<Item> BLACK_OPAL_SHOVEL = ITEMS.register("black_opal_shovel",
            () -> new ShovelItem(ModToolTiers.BLACK_OPAL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.MYTHRIL, 2.5f, -3.0f))));

    public static final RegistryObject<Item> BLACK_OPAL_AXE = ITEMS.register("black_opal_axe",
            () -> new AxeItem(ModToolTiers.BLACK_OPAL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.MYTHRIL, 8, -3.0f))));

    public static final RegistryObject<Item> BLACK_OPAL_HOE = ITEMS.register("black_opal_hoe",
            () -> new HoeItem(ModToolTiers.BLACK_OPAL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.MYTHRIL, -1, 0f))));

    public static final RegistryObject<Item> BLACK_OPAL_HELMET = ITEMS.register("black_opal_helmet",
            () -> new ArmorItem(ModArmorMaterials.BLACK_OPAL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(27))));

    public static final RegistryObject<Item> BLACK_OPAL_CHESTPLATE = ITEMS.register("black_opal_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BLACK_OPAL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(27))));

    public static final RegistryObject<Item> BLACK_OPAL_LEGGINGS = ITEMS.register("black_opal_leggings",
            () -> new ArmorItem(ModArmorMaterials.BLACK_OPAL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(27))));

    public static final RegistryObject<Item> BLACK_OPAL_BOOTS = ITEMS.register("black_opal_boots",
            () -> new ArmorItem(ModArmorMaterials.BLACK_OPAL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(27))));



    public static final RegistryObject<Item> AZURITE = ITEMS.register("azurite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_AZURITE = ITEMS.register("raw_azurite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AZURITE_SWORD = ITEMS.register("azurite_sword",
            () -> new SwordItem(ModToolTiers.AZURITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AZURITE, 5, -2.5f))));
    public static final RegistryObject<Item> AZURITE_PICKAXE = ITEMS.register("azurite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AZURITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AZURITE, 1.0F, -2.8F))));
    public static final RegistryObject<Item> AZURITE_SHOVEL = ITEMS.register("azurite_shovel",
            () -> new ShovelItem(ModToolTiers.AZURITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.AZURITE, 2.5F, -3.0F))));
    public static final RegistryObject<Item> AZURITE_AXE = ITEMS.register("azurite_axe",
            () -> new AxeItem(ModToolTiers.AZURITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AZURITE, 7.0F, -2.2F))));
    public static final RegistryObject<Item> AZURITE_HOE = ITEMS.register("azurite_hoe",
            () -> new HoeItem(ModToolTiers.AZURITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.AZURITE, 1.0F, -3.0F))));

    public static final RegistryObject<Item> AZURITE_HELMET = ITEMS.register("azurite_helmet",
            () -> new ArmorItem(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(34))));
    public static final RegistryObject<Item> AZURITE_CHESTPLATE = ITEMS.register("azurite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(34))));
    public static final RegistryObject<Item> AZURITE_LEGGINGS = ITEMS.register("azurite_leggings",
            () -> new ArmorItem(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(34))));
    public static final RegistryObject<Item> AZURITE_BOOTS = ITEMS.register("azurite_boots",
            () -> new ArmorItem(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(34))));

    public static final RegistryObject<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).fireResistant()));

    public static final RegistryObject<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
