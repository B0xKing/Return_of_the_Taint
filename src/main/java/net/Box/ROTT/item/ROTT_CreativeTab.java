package net.Box.ROTT.item;

import net.Box.ROTT.ROTT;
import net.Box.ROTT.block.ROTT_Blocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ROTT_CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ROTT.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ROTT_TAB = CREATIVE_MODE_TABS.register("rott_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ROTT_Items.TAINTED_SLIME.get()))
                    .title(Component.translatable("creative_tab.rott_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ROTT_Blocks.TAINTED_SOIL.get());
                        output.accept(ROTT_Blocks.TAINTED_STONE.get());
                        output.accept(ROTT_Blocks.SILVER_ORE.get());
                        output.accept(ROTT_Blocks.DEEPSLATE_SILVER_ORE.get());
                        output.accept(ROTT_Blocks.RAW_SILVER_BLOCK.get());
                        output.accept(ROTT_Blocks.SILVER_BLOCK.get());
                        //output.accept(ROTT_Blocks.TAINTED_LOG.get());
                        //output.accept(ROTT_Blocks.TAINTED_WOOD.get());

                        output.accept(ROTT_Items.TAINTED_SLIME.get());
                        output.accept(ROTT_Items.RAW_SILVER.get());
                        output.accept(ROTT_Items.SILVER_INGOT.get());
                        output.accept(ROTT_Items.SILVER_NUGGET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
