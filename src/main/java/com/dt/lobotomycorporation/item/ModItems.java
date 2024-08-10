package com.dt.lobotomycorporation.item;

import com.dt.lobotomycorporation.LobotomyCorporation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LobotomyCorporation.MODID);

    public static final DeferredItem<Item> LCORP_LOGO = ITEMS.register("lcorp_logo", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ADORATION = ITEMS.register("adoration", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEAVEN = ITEMS.register("heaven", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIFE_FOR_A_DAREDEVIL = ITEMS.register("life_for_a_daredevil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PENITENCE = ITEMS.register("penitence", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOLEMN_LAMENT = ITEMS.register("solemn_lament", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZAYIN = ITEMS.register("zayin_logo", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TETH = ITEMS.register("teth_logo", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HE = ITEMS.register("he_logo", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WAW = ITEMS.register("waw_logo", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALEPH = ITEMS.register("aleph_logo", () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
