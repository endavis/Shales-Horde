package net.shale.horde.backpack.block.copper;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shale.horde.backpack.block.BackpackBlock;
import net.shale.horde.backpack.block.Pickup;
import net.shale.horde.backpack.registry.BB_CopperItemRegistry;
import net.shale.horde.backpack.registry.BB_LeatherItemRegistry;

public class BlackBlockCopper extends Pickup {
    public BlackBlockCopper(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return null;
    }

    @Override
    protected ItemStack getBlock() {
        return BB_CopperItemRegistry.COPPER_BLACK_ITEM.getDefaultStack();
    }
}
