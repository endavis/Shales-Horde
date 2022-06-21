package net.shale.horde.backpack.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shale.horde.backpack.registery.BackpackItemRegistry;

public class BackpackBlockCopper extends BackpackBlock{
    public BackpackBlockCopper(Settings settings) {
        super(settings);
    }
    @Override
    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.isInSneakingPose()) {
            if (player.getStackInHand(hand).isEmpty()) {
                world.setBlockState((pos), Blocks.AIR.getDefaultState());
                player.giveItemStack(BackpackItemRegistry.COPPER_BACKPACK_ITEM.getDefaultStack());
            }
        } else {

        }
        return ActionResult.FAIL;
    }
}
