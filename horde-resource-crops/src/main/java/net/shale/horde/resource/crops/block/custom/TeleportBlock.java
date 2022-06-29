package net.shale.horde.resource.crops.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.border.WorldBorder;

public class TeleportBlock extends Block {
    public TeleportBlock(Settings settings) {
        super(settings);
    }

    private void teleport(BlockState state, World world, BlockPos pos) {
        WorldBorder worldBorder = world.getWorldBorder();

        for (int i = 0; i < 1000; ++i) {
            BlockPos blockPos = pos.add(world.random.nextInt(16) - world.random.nextInt(16), world.random.nextInt(8) - world.random.nextInt(8), world.random.nextInt(16) - world.random.nextInt(16));
            if (world.getBlockState(blockPos).isAir() && worldBorder.contains(blockPos)) {
                if (world.isClient) {
                    for (int j = 0; j < 128; ++j) {
                        double d = world.random.nextDouble();
                        float f = (world.random.nextFloat() - 0.5F) * 0.2F;
                        float g = (world.random.nextFloat() - 0.5F) * 0.2F;
                        float h = (world.random.nextFloat() - 0.5F) * 0.2F;
                        double e = MathHelper.lerp(d, blockPos.getX(), pos.getX()) + (world.random.nextDouble() - 0.5) + 0.5;
                        double k = MathHelper.lerp(d, blockPos.getY(), pos.getY()) + world.random.nextDouble() - 0.5;
                        double l = MathHelper.lerp(d, blockPos.getZ(), pos.getZ()) + (world.random.nextDouble() - 0.5) + 0.5;
                        world.addParticle(ParticleTypes.PORTAL, e, k, l, f, g, h);
                    }
                } else {
                    world.setBlockState(blockPos, state, 2);
                    world.removeBlock(pos, false);
                }

                return;
            }
        }

    }
}
