package net.Box.ROTT.datagen;

import net.Box.ROTT.ROTT;
import net.Box.ROTT.block.ROTT_Blocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ROTT_BlockStateProvider extends BlockStateProvider {
    public ROTT_BlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ROTT.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ROTT_Blocks.TAINTED_SOIL);
        blockWithItem(ROTT_Blocks.TAINTED_STONE);
        blockWithItem(ROTT_Blocks.SILVER_ORE);
        blockWithItem(ROTT_Blocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ROTT_Blocks.SILVER_BLOCK);
        //blockWithItem(ROTT_Blocks.TAINTED_LOG);
        //blockWithItem(ROTT_Blocks.TAINTED_WOOD);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
