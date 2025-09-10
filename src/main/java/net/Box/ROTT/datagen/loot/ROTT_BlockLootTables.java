package net.Box.ROTT.datagen.loot;

import net.Box.ROTT.block.ROTT_Blocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ROTT_BlockLootTables extends BlockLootSubProvider {
    public ROTT_BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ROTT_Blocks.TAINTED_SOIL.get());
        this.dropSelf(ROTT_Blocks.TAINTED_STONE.get());
        //this.dropSelf(ROTT_Blocks.TAINTED_LOG.get());
        //this.dropSelf(ROTT_Blocks.TAINTED_WOOD.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ROTT_Blocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
