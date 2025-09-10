package net.Box.ROTT.datagen;

import net.Box.ROTT.ROTT;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ROTT.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ROTT_RecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), ROTT_LootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new ROTT_BlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ROTT_ItemModelProvider(packOutput, existingFileHelper));

        ROTT_BlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new ROTT_BlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ROTT_ItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
    }
}
