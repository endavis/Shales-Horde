package net.shale.horde.backpack.item.gold;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shale.horde.backpack.registery.BB_DiamondBlockRegistry;
import net.shale.horde.backpack.registery.BB_GoldBlockRegistry;
import net.shale.horde.backpack.render.BackpackRenderer;

public class OrangeItemGold extends BackpackRenderer {
    public OrangeItemGold(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        if (player.isInSneakingPose()) {
            ItemPlacementContext convertedPlacementContext = new ItemPlacementContext(context);
            World world = convertedPlacementContext.getWorld();
            BlockPos blockPos = convertedPlacementContext.getBlockPos();
            world.setBlockState((blockPos),
                    BB_GoldBlockRegistry.GOLD_ORANGE_BLOCK.getDefaultState()
                            .with(Properties.HORIZONTAL_FACING, context.getPlayerFacing().getOpposite()));
            ItemStack stack = player.getStackInHand(context.getHand());
            int count = stack.getCount();
            stack.decrement(count);
        } else {

        }

        return ActionResult.FAIL;
    }
}
