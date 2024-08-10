package com.dt.lobotomycorporation.creativetab;


import com.dt.lobotomycorporation.LobotomyCorporation;
import com.dt.lobotomycorporation.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ModTab {
    public static final String defaultTabName = "itemGroup.lobotomycorporation.";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LobotomyCorporation.MODID);

    public static final  Supplier<CreativeModeTab> ALL_ITEMS = CREATIVE_MODE_TABS.register("all_items",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable(defaultTabName + "all_items"))
                    .icon(() -> new ItemStack(ModItems.LCORP_LOGO.get()))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.ADORATION);
                        output.accept(ModItems.LIFE_FOR_A_DAREDEVIL);
                        output.accept(ModItems.SOLEMN_LAMENT);
                        output.accept(ModItems.PENITENCE);
                        output.accept(ModItems.HEAVEN);
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
