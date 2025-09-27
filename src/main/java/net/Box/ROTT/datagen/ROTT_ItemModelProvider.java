package net.Box.ROTT.datagen;

import net.Box.ROTT.ROTT;
import net.Box.ROTT.item.ROTT_Items;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ROTT_ItemModelProvider extends ItemModelProvider {
    public ROTT_ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ROTT.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ROTT_Items.TAINTED_SLIME);
        simpleItem(ROTT_Items.RAW_SILVER);
        simpleItem(ROTT_Items.SILVER_INGOT);
        simpleItem(ROTT_Items.SILVER_NUGGET);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
            new ResourceLocation(ROTT.MOD_ID, "item/" + item.getId().getPath()));
    }
}
