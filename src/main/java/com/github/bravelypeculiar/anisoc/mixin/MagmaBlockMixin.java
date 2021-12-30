package com.github.bravelypeculiar.anisoc.mixin;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

import java.util.Random;

@Mixin(MagmaBlock.class)
public class MagmaBlockMixin extends Block {
    private MagmaBlockMixin(Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (world.getBlockState(pos.down()).getFluidState().isOf(Fluids.WATER)) {
            boolean isSignal = world.getBlockState(pos.down().down()).getFluidState().isOf(Fluids.WATER);
            CampfireBlock.spawnSmokeParticle(world, pos, isSignal, false);
        }
    }
}
