package com.jerrylu086.morecreatestuffs.data.client;

import com.jerrylu086.morecreatestuffs.morecreatestuffs;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, morecreatestuffs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        //Wyrmroost
        builder(itemGenerated, "crushed_platinum_ore");
        builder(itemGenerated, "platinum_nugget");
        //Rats
        builder(itemGenerated, "crushed_oratchalcum_ore");
        //SimpleOres
        builder(itemGenerated, "crushed_adamantium_ore");
        builder(itemGenerated, "crushed_mythril_ore");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
