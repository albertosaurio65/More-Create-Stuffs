package com.jerrylu086.morecreatestuffs.registry;

import com.jerrylu086.morecreatestuffs.MoreCreateStuffs;
import com.simibubi.create.AllTags;
import com.simibubi.create.Create;
import com.simibubi.create.content.AllSections;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.item.TagDependentIngredientItem;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import net.minecraft.item.*;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreCreateStuffs.MOD_ID);

    // new ResourceLocation("forge", "ores/cobalt")

    // Tags
    // public static final RegistryObject<Item> CRUSHED_COBALT_ORE = ITEMS.register("crushed_cobalt_ore",
            // () -> new Item(new Item.Properties().group(ItemTags.getCollection().get(new ResourceLocation("forge", "ores/cobalt")).contains(null) == false ? ItemGroup.MATERIALS : null)));

    // TiC
    public static final RegistryObject<Item> CRUSHED_COBALT_ORE = ITEMS.register("crushed_cobalt_ore",
            () -> new Item(new Item.Properties().group(ModList.get().isLoaded("tconstruct") ? ItemGroup.MATERIALS : null)));

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