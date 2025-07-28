package net.Box.ROTT.item;

import net.Box.ROTT.Return_of_the_Taint;
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
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Return_of_the_Taint.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ROTT_TAB = CREATIVE_MODE_TABS.register("rott_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ROTT_Items.TAINT_CLUMP.get()))
                    .title(Component.translatable("creative_tab.rott_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ROTT_Blocks.TAINTED_SOIL.get());

                        output.accept(ROTT_Items.TAINT_CLUMP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
