package com.jerrylu086.morecreatestuffs.registry;

import com.jerrylu086.morecreatestuffs.MoreCreateStuffs;
import com.jerrylu086.morecreatestuffs.items.ModDependentIngredientItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.item.TagDependentIngredientItem;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import net.minecraft.util.ResourceLocation;

public class ModItems {

    private static final CreateRegistrate REGISTRATE = (CreateRegistrate) MoreCreateStuffs.registrate().itemGroup(() -> {
        return MoreCreateStuffs.Group;
    });

    // Tag depending
    public static final ItemEntry<TagDependentIngredientItem>
        CRUSHED_ADAMANTIUM = compatTagItem("crushed_adamantium_ore", "ores/adamantium"),
        CRUSHED_COBALT = compatTagItem("crushed_cobalt_ore", "ores/cobalt"),
        CRUSHED_MYTHRIL = compatTagItem("crushed_mythril_ore", "ores/mythril"),
        CRUSHED_TUNGSTEN = compatTagItem("crushed_tungsten_ore", "ores/tungsten");

    // Mod depending
    public static final ItemEntry<ModDependentIngredientItem>
        CRUSHED_ORATCHALCUM = compatModItem("crushed_oratchalcum_ore", "rats"),
        CRUSHED_PLATINUM = compatModItem("crushed_platinum_ore", "wyrmroost"),
        CRUSHED_STARMETAL = compatModItem("crushed_starmetal_ore", "wip_this_recipe_is_not_out_yet"),
        PLATINUM_NUGGET = compatModItem("platinum_nugget", "wyrmroost");

    private static ItemEntry<TagDependentIngredientItem> compatTagItem(String name, String tag) {
        return REGISTRATE.item(name, (props) -> {
            return new TagDependentIngredientItem(props, new ResourceLocation("forge", tag));
        }).register();
    }

    private static ItemEntry<ModDependentIngredientItem> compatModItem(String name, String modid) {
        return REGISTRATE.item(name, (props) -> {
            return new ModDependentIngredientItem(props, modid);
        }).register();
    }

    public static void register() {
    }
}