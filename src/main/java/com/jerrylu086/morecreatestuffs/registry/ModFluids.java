package com.jerrylu086.morecreatestuffs.registry;

import com.jerrylu086.morecreatestuffs.MoreCreateStuffs;
import com.simibubi.create.content.contraptions.fluids.VirtualFluid;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.RegistryEntry;

public class ModFluids {
    private static final CreateRegistrate REGISTRATE = MoreCreateStuffs.registrate();

    public static RegistryEntry<VirtualFluid>
            LAVENDER_TEA =  REGISTRATE.virtualFluid("lavender_tea")
            .lang(f -> "fluid.morecreatestuffs.lavender_tea", "Lavender Tea")
            .register();

    public static void register() {}

}