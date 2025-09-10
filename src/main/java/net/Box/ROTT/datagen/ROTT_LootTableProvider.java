package net.Box.ROTT.datagen;

import net.Box.ROTT.datagen.loot.ROTT_BlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class ROTT_LootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(ROTT_BlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }
}
