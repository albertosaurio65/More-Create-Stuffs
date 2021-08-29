package com.jerrylu086.morecreatestuffs.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.ModList;

public class ModDependentIngredientItem extends Item {
    private String modid;

    public ModDependentIngredientItem(Properties prop, String modid) {
        super(prop);
        this.modid = modid;
    }

    public void fillItemGroup(ItemGroup p_150895_1_, NonNullList<ItemStack> p_150895_2_) {
        if (this.shouldShow()) {
            super.fillItemGroup(p_150895_1_, p_150895_2_);
        }

    }

    public boolean shouldShow() {
        boolean loaded = ModList.get().isLoaded(modid);
        return loaded;
    }
}