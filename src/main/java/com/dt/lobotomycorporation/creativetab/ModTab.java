package com.dt.lobotomycorporation.creativetab;


import com.dt.lobotomycorporation.LobotomyCorporation;
import com.dt.lobotomycorporation.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

//TODO: Add the risk level tabs and also weapons/armor
public class ModTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LobotomyCorporation.MODID);

    public static final  Supplier<CreativeModeTab> ALL_ITEMS = CREATIVE_MODE_TABS.register("all_items",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.lobotomycorporation.all_items"))
                    .icon(() -> new ItemStack(ModItems.LCORP_LOGO.get()))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.ADORATION.get());
                        output.accept(ModItems.LIFE_FOR_A_DAREDEVIL.get());
                        output.accept(ModItems.SOLEMN_LAMENT.get());
                        output.accept(ModItems.PENITENCE.get());
                        output.accept(ModItems.HEAVEN.get());
                        output.accept(ModItems.LAB_BLOCK.get());
                    })
                    .build());

    // Risk levels
    public static final  Supplier<CreativeModeTab> ZAYIN = CREATIVE_MODE_TABS.register("zayin",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item.lobotomycorporation.zayin_logo"))
                    .icon(() -> new ItemStack(ModItems.ZAYIN.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(LobotomyCorporation.MODID, "all_items"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.ZAYIN.get());
                    })
                    .build());

    public static final  Supplier<CreativeModeTab> TETH = CREATIVE_MODE_TABS.register("teth",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item.lobotomycorporation.teth_logo"))
                    .icon(() -> new ItemStack(ModItems.TETH.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(LobotomyCorporation.MODID, "zayin"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.TETH.get());
                    })
                    .build());

    public static final  Supplier<CreativeModeTab> HE = CREATIVE_MODE_TABS.register("he",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item.lobotomycorporation.he_logo"))
                    .icon(() -> new ItemStack(ModItems.HE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(LobotomyCorporation.MODID, "teth"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.HE.get());
                    })
                    .build());

    public static final  Supplier<CreativeModeTab> WAW = CREATIVE_MODE_TABS.register("waw",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item.lobotomycorporation.waw_logo"))
                    .icon(() -> new ItemStack(ModItems.WAW.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(LobotomyCorporation.MODID, "he"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.WAW.get());
                    })
                    .build());

    public static final  Supplier<CreativeModeTab> ALEPH = CREATIVE_MODE_TABS.register("aleph",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item.lobotomycorporation.aleph_logo"))
                    .icon(() -> new ItemStack(ModItems.ALEPH.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(LobotomyCorporation.MODID, "waw"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.ALEPH.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
