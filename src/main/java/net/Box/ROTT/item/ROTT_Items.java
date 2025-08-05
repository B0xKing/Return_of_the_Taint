package net.Box.ROTT.item;

import net.Box.ROTT.Return_of_the_Taint;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ROTT_Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Return_of_the_Taint.MOD_ID);

    public static final RegistryObject<Item> TAINTED_SLIME = ITEMS.register("tainted_slime",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
