package com.the1poteto.potetospellbooks.Registries;

import smartin.miapi.item.modular.items.tools.ModularWeapon;
import static smartin.miapi.registries.RegistryInventory.MODULAR_ITEMS;
import static smartin.miapi.registries.RegistryInventory.register;

public class ItemRegistry {
    public static void itemSetup() {
        register(MODULAR_ITEMS, "modular_staff", ModularWeapon::new);
        register(MODULAR_ITEMS, "modular_wand", ModularWeapon::new);
    }
}