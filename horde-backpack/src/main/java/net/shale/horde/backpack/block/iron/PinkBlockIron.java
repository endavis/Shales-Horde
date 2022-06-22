package net.shale.horde.backpack.block.iron;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shale.horde.backpack.block.BackpackBlock;
import net.shale.horde.backpack.registery.BB_GoldItemRegistry;
import net.shale.horde.backpack.registery.BB_IronItemRegistry;

public class PinkBlockIron extends BackpackBlock {
    public PinkBlockIron(Settings settings) {
        super(settings);
    }
    @Override
    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.isInSneakingPose()) {
            if (player.getStackInHand(hand).isEmpty()) {
                world.setBlockState((pos), Blocks.AIR.getDefaultState());
                player.giveItemStack(BB_IronItemRegistry.IRON_PINK_ITEM.getDefaultStack());
            }
        } else {

        }
        return ActionResult.FAIL;
    }
}
