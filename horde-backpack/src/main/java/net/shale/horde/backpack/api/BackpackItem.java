package net.shale.horde.backpack.api;

import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.shale.horde.backpack.registery.BackpackBlockRegistry;

public class BackpackItem extends TrinketItem {
    public BackpackItem(Settings settings) {
        super(settings);
    }

    //Trinket Render
    public static void registerTrinketRenderer(BackpackItem backpack) {
        TrinketRendererRegistry.registerRenderer(backpack, new Renderer());
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        if (player.isInSneakingPose()) {
            ItemPlacementContext convertedPlacementContext = new ItemPlacementContext(context);
            World world = convertedPlacementContext.getWorld();
            BlockPos blockPos = convertedPlacementContext.getBlockPos();
            world.setBlockState((blockPos),
                    BackpackBlockRegistry.LEATHER_BACKPACK_BLOCK.getDefaultState().with(Properties.HORIZONTAL_FACING, context.getPlayerFacing().getOpposite()));
        } else {

        }

        return ActionResult.FAIL;
    }

}