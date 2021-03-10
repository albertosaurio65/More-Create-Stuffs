package com.jerrylu086.morecreatestuffs.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    //Wyrmroost
    public static final RegistryObject<Item> CRUSHED_PLATINUM_ORE = Registration.ITEMS.register("crushed_platinum_ore", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = Registration.ITEMS.register("platinum_nugget", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    //Rats
    public static final RegistryObject<Item> CRUSHED_ORATCHALCUM_ORE = Registration.ITEMS.register("crushed_oratchalcum_ore", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    //SimpleOres
    public static final RegistryObject<Item> CRUSHED_ADAMANTIUM_ORE = Registration.ITEMS.register("crushed_adamantium_ore", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
        public static final RegistryObject<Item>  CRUSHED_MYTHRIL_ORE = Registration.ITEMS.register("crushed_mythril_ore", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static void register() {}
}