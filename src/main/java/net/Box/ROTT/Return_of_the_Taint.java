package net.Box.ROTT;

import net.Box.ROTT.block.ROTT_Blocks;
import net.Box.ROTT.item.ROTT_Items;
import net.Box.ROTT.item.ROTT_CreativeTab;
import com.mojang.logging.LogUtils;
import net.Box.ROTT.sound.ROTT_Sounds;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Return_of_the_Taint.MOD_ID)
public class Return_of_the_Taint {

    public static final String MOD_ID = "return_of_the_taint";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Return_of_the_Taint(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ROTT_CreativeTab.register(modEventBus);

        ROTT_Blocks.register(modEventBus);
        ROTT_Items.register(modEventBus);

        ROTT_Sounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
