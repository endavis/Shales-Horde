package net.shale.horde.backpack.item.gold;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shale.horde.backpack.registry.BB_GoldBlockRegistry;
import net.shale.horde.backpack.render.BackpackRenderer;

public class WhiteItemGold extends BackpackRenderer {
    public WhiteItemGold(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        if (player.isInSneakingPose()) {
            ItemPlacementContext convertedPlacementContext = new ItemPlacementContext(context);
            World world = convertedPlacementContext.getWorld();
            BlockPos blockPos = convertedPlacementContext.getBlockPos();
            if (world.getBlockState(blockPos).equals(Blocks.AIR.getDefaultState())) {
                world.setBlockState((blockPos),
                        BB_GoldBlockRegistry.GOLD_WHITE_BLOCK.getDefaultState()
                                .with(Properties.HORIZONTAL_FACING, context.getPlayerFacing().getOpposite()));
                ItemStack stack = player.getStackInHand(context.getHand());
                int count = stack.getCount();
                stack.decrement(count);
            }
        } else {

        }

        return ActionResult.FAIL;
    }
}
