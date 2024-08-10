package com.dt.lobotomycorporation.item;

import com.dt.lobotomycorporation.LobotomyCorporation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LobotomyCorporation.MODID);

    public static final DeferredItem<Item> LCORP_LOGO = ITEMS.register("lcorp_logo", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
