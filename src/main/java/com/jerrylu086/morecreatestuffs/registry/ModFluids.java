package com.jerrylu086.morecreatestuffs.registry;

import com.jerrylu086.morecreatestuffs.MoreCreateStuffs;
import com.jerrylu086.morecreatestuffs.fluids.VirtualFluid;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, MoreCreateStuffs.MOD_ID);

    public static final ResourceLocation LAVENDER_TEA_STILL_TEXTURE = new ResourceLocation(MoreCreateStuffs.MOD_ID, "fluid/lavender_tea/still");
    public static final ResourceLocation LAVENDER_TEA_FLOWING_TEXTURE = new ResourceLocation(MoreCreateStuffs.MOD_ID, "fluid/lavender_tea/flow");

    // Tea Types
    private static ForgeFlowingFluid.Properties makeProperties() {
        return new ForgeFlowingFluid.Properties(LAVENDER_TEA_STILL, LAVENDER_TEA_FLOWING,
                FluidAttributes.builder(LAVENDER_TEA_STILL_TEXTURE, LAVENDER_TEA_FLOWING_TEXTURE));
    }
    public static final RegistryObject<FlowingFluid> LAVENDER_TEA_STILL = FLUIDS.register("lavender_tea", () ->
            new VirtualFluid.Source(makeProperties())
    );
    public static final RegistryObject<FlowingFluid> LAVENDER_TEA_FLOWING = FLUIDS.register("lavender_tea_flowing", () ->
            new VirtualFluid.Flowing(makeProperties())
    );
}