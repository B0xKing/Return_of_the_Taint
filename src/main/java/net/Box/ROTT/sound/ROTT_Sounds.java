package net.Box.ROTT.sound;

import net.Box.ROTT.ROTT;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ROTT_Sounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ROTT.MOD_ID);

    public static final RegistryObject<SoundEvent> TAINT_SOIL_BREAK = registerSoundEvents("taint_soil_break");
    public static final RegistryObject<SoundEvent> TAINT_SOIL_STEP = registerSoundEvents("taint_soil_step");
    public static final RegistryObject<SoundEvent> TAINT_SOIL_FALL = registerSoundEvents("taint_soil_fall");
    public static final RegistryObject<SoundEvent> TAINT_SOIL_PLACE = registerSoundEvents("taint_soil_place");
    public static final RegistryObject<SoundEvent> TAINT_SOIL_HIT = registerSoundEvents("taint_soil_hit");
    public static final RegistryObject<SoundEvent> TAINT_STONE_BREAK = registerSoundEvents("taint_stone_break");
    public static final RegistryObject<SoundEvent> TAINT_STONE_STEP = registerSoundEvents("taint_stone_step");
    public static final RegistryObject<SoundEvent> TAINT_STONE_FALL = registerSoundEvents("taint_stone_fall");
    public static final RegistryObject<SoundEvent> TAINT_STONE_PLACE = registerSoundEvents("taint_stone_place");
    public static final RegistryObject<SoundEvent> TAINT_STONE_HIT = registerSoundEvents("taint_stone_hit");
    public static final RegistryObject<SoundEvent> TAINT_LOG_BREAK = registerSoundEvents("taint_wood_break");
    public static final RegistryObject<SoundEvent> TAINT_LOG_STEP = registerSoundEvents("taint_wood_step");
    public static final RegistryObject<SoundEvent> TAINT_LOG_FALL = registerSoundEvents("taint_wood_fall");
    public static final RegistryObject<SoundEvent> TAINT_LOG_PLACE = registerSoundEvents("taint_wood_place");
    public static final RegistryObject<SoundEvent> TAINT_LOG_HIT = registerSoundEvents("taint_wood_hit");

    public static final ForgeSoundType TAINT_SOIL_SOUNDS = new ForgeSoundType(1f, 1f,
            ROTT_Sounds.TAINT_SOIL_BREAK, ROTT_Sounds.TAINT_SOIL_STEP, ROTT_Sounds.TAINT_SOIL_PLACE,
            ROTT_Sounds.TAINT_SOIL_HIT, ROTT_Sounds.TAINT_SOIL_FALL);

    public static final ForgeSoundType TAINT_STONE_SOUNDS = new ForgeSoundType(1f, 1f,
            ROTT_Sounds.TAINT_STONE_BREAK, ROTT_Sounds.TAINT_STONE_STEP, ROTT_Sounds.TAINT_STONE_PLACE,
            ROTT_Sounds.TAINT_STONE_HIT, ROTT_Sounds.TAINT_STONE_FALL);

    public static final ForgeSoundType TAINT_LOG_SOUNDS = new ForgeSoundType(1f, 1f,
            ROTT_Sounds.TAINT_LOG_BREAK, ROTT_Sounds.TAINT_LOG_STEP, ROTT_Sounds.TAINT_LOG_PLACE,
            ROTT_Sounds.TAINT_LOG_HIT, ROTT_Sounds.TAINT_LOG_FALL);


    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(ROTT.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
