package com.the1poteto.potetospellbooks.Registries;

import net.minecraft.resources.ResourceLocation;
import static smartin.miapi.registries.RegistryInventory.MODULAR_ITEMS;
import smartin.miapi.item.modular.items.tools.ModularWeapon;

public class ItemRegistry {
    public static void itemSetup(){
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_staff"), ModularWeapon::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_wand"), ModularWeapon::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_spellcaster_gauntlet"), ModularWeapon::new);
        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_spellbook"), ModularWeapon::new);

        MODULAR_ITEMS.register(ResourceLocation.fromNamespaceAndPath("potetospellbooks", "modular_bitch"), ModularWeapon::new);
    }
}
