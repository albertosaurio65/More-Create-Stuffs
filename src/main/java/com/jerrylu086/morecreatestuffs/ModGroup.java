package com.jerrylu086.morecreatestuffs;

import com.jerrylu086.morecreatestuffs.registry.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModGroup extends ItemGroup {

    public ModGroup(String name) {
        super(name);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.CRUSHED_ORATCHALCUM.get());
    }

}
