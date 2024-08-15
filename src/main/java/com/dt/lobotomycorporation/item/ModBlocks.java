package com.dt.lobotomycorporation.item;

import com.dt.lobotomycorporation.LobotomyCorporation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LobotomyCorporation.MODID);
    public static final DeferredBlock<Block> LAB_BLOCK = BLOCKS.registerBlock("lab_block", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
