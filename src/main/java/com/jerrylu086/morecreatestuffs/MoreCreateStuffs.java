package com.jerrylu086.morecreatestuffs;

import com.jerrylu086.morecreatestuffs.Registrations.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreCreateStuffs.MOD_ID)
@Mod.EventBusSubscriber(modid = MoreCreateStuffs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreCreateStuffs
{

    public static final String MOD_ID = "morecreatestuffs";

    public MoreCreateStuffs()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(modEventBus);
    }

}
