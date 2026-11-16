package com.the1poteto.potetospellbooks.registries;

import net.minecraft.resources.ResourceLocation;
import smartin.miapi.item.modular.items.armor.ModularBoots;
import smartin.miapi.item.modular.items.armor.ModularChestPlate;
import smartin.miapi.item.modular.items.armor.ModularHelmet;
import smartin.miapi.item.modular.items.armor.ModularLeggings;
import smartin.miapi.item.modular.items.tools.ModularWeapon;
import static smartin.miapi.registries.RegistryInventory.MODULAR_ITEMS;

public class ItemRegistry {
    public static void itemSetup(){
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_staff"), ModularWeapon::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_wand"), ModularWeapon::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_spellcaster_gauntlet"), ModularWeapon::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_spellbook"), ModularWeapon::new);

        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_wizard_helmet"), ModularHelmet::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_wizard_chestplate"), ModularChestPlate::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_wizard_leggings"), ModularLeggings::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_wizard_boots"), ModularBoots::new);

        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_archmage_helmet"), ModularHelmet::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_archmage_chestplate"), ModularChestPlate::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_archmage_leggings"), ModularLeggings::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_archmage_boots"), ModularBoots::new);
    }
}
