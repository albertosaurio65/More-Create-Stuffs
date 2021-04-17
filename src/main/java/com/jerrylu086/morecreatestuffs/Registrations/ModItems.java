package com.jerrylu086.morecreatestuffs.Registrations;

import com.jerrylu086.morecreatestuffs.MoreCreateStuffs;
import net.minecraft.item.*;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreCreateStuffs.MOD_ID);

    // Wyrmroost
    public static final RegistryObject<Item> CRUSHED_PLATINUM_ORE = ITEMS.register("crushed_platinum_ore",
            () -> new Item(new Item.Properties().group(ModList.get().isLoaded("wyrmroost") ? ItemGroup.MATERIALS : null)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties().group(ModList.get().isLoaded("wyrmroost") ? ItemGroup.MATERIALS : null)));

    // Rats
    public static final RegistryObject<Item> CRUSHED_ORATCHALCUM_ORE = ITEMS.register("crushed_oratchalcum_ore",
            () -> new Item(new Item.Properties().group(ModList.get().isLoaded("rats") ? ItemGroup.MATERIALS : null)));

    // SimpleOres
    public static final RegistryObject<Item> CRUSHED_ADAMANTIUM_ORE = ITEMS.register("crushed_adamantium_ore",
            () -> new Item(new Item.Properties().group(ModList.get().isLoaded("simpleores") ? ItemGroup.MATERIALS : null)));
    public static final RegistryObject<Item> CRUSHED_MYTHRIL_ORE = ITEMS.register("crushed_mythril_ore",
            () -> new Item(new Item.Properties().group(ModList.get().isLoaded("simpleores") ? ItemGroup.MATERIALS : null)));

}