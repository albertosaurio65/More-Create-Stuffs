package com.jerrylu086.morecreatestuffs;

import com.jerrylu086.morecreatestuffs.registry.ModFluids;
import com.jerrylu086.morecreatestuffs.registry.ModItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.NonNullLazyValue;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(MoreCreateStuffs.MOD_ID)
@Mod.EventBusSubscriber(modid = MoreCreateStuffs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreCreateStuffs {

    public static final String MOD_ID = "morecreatestuffs";
    private static final NonNullLazyValue<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy(MOD_ID);
    public static final ModGroup Group = new ModGroup(MOD_ID);

    public MoreCreateStuffs()
    {
        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register();
        ModFluids.register();
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE.getValue();
    }

}
