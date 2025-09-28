package net.Box.ROTT.block;

import net.Box.ROTT.ROTT;
import net.Box.ROTT.block.custom.ROTT_FlammableRotatedPillarBlock;
import net.Box.ROTT.item.ROTT_Items;
import net.Box.ROTT.sound.ROTT_Sounds;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ROTT_Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ROTT.MOD_ID);

    public static final RegistryObject<Block> TAINTED_SOIL = registerBlock("tainted_soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(ROTT_Sounds.TAINT_SOIL_SOUNDS)));

    public static final RegistryObject<Block> TAINTED_STONE = registerBlock("tainted_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(ROTT_Sounds.TAINT_STONE_SOUNDS)));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)));

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));

    //public static final RegistryObject<Block> TAINTED_LOG = registerBlock("tainted_log",
            //() -> new ROTT_FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(ROTT_Sounds.TAINT_LOG_SOUNDS)));
    //public static final RegistryObject<Block> TAINTED_WOOD = registerBlock("tainted_wood",
            //() -> new ROTT_FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(ROTT_Sounds.TAINT_LOG_SOUNDS)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ROTT_Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}