package com.the1poteto.potetospellbooks;

import com.the1poteto.potetospellbooks.Registries.ItemRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(PotetoSpellbooks.MODID)
public class PotetoSpellbooks {
    public static final String MODID = "potetospellbooks";

    public PotetoSpellbooks(IEventBus modEventBus) {
        ItemRegistry.itemSetup();
    }
}
