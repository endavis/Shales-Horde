/**
 * This is a copy of the container libs OpenableBlockEntityProviderV2 Adapted for use with Items (ie bags)
 * https://github.com/NinjaPhenix/container-library/blob/1.18/common/fabricSrc/main/java/ninjaphenix/container_library/api/v2/OpenableBlockEntityProviderV2.java
 */
package net.shale.horde.backpack.api;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shale.horde.backpack.api.wrappers.NetworkWrapper;
import ninjaphenix.container_library.api.v2.OpenableBlockEntityProviderV2;
import ninjaphenix.container_library.api.v2.OpenableBlockEntityV2;
import ninjaphenix.container_library.api.v2.client.NCL_ClientApiV2;
import ninjaphenix.container_library.api.v2.helpers.OpenableBlockEntitiesV2;


public interface OpenableBlockEntityProviderCustom extends OpenableBlockEntityProviderV2 {
    /**
     * Return the openable block entity, {@link OpenableBlockEntitiesV2} can be used to supply more than one inventory.
     */
    default OpenableBlockEntityV2 getOpenableBlockEntity(World world, BlockState state, BlockPos pos) {
        if (world.getBlockEntity(pos) instanceof OpenableBlockEntityV2 entity) {
            return entity;
        }
        return null;
    }

    /**
     * Call back for running code when an inventory is initially opened, can be used to award opening stats.
     * Note: more context can be provided if needed, namely ServerWorld, BlockState and BlockPos.
     */
    default void onInitialOpen(ServerPlayerEntity player) {

    }

    /**
     * Note: when this returns {@link ActionResult#FAIL} a packet will not be sent to the server and the player's hand will swing.
     * <p/>
     * Intended to be protected.
     */
    default ActionResult ncl_onBlockUse(World world, BlockState state, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit, OpenableBlockEntityV2 entity) {
        if (world.isClient()) {
            return this.ncl_cOpenInventory(pos, hand, hit) ? ActionResult.SUCCESS : ActionResult.FAIL;
        } else {
            if (player instanceof ServerPlayerEntity serverPlayer) {
                this.ncl_sOpenInventory(world, state, pos, serverPlayer, entity);
            }
            return ActionResult.CONSUME;
        }
    }

    /**
     * When this method returns {@code false} {@link Block#onUse} should return {@link ActionResult#FAIL}
     * <p/>
     * Intended to be protected.
     */
    default boolean ncl_cOpenInventory(BlockPos pos, Hand hand, BlockHitResult hit) {
        return NCL_ClientApiV2.openInventoryAt(pos, hand, hit);
    }

    /**
     * Intended to be protected.
     */
    default void ncl_sOpenInventory(World world, BlockState state, BlockPos pos, ServerPlayerEntity player, OpenableBlockEntityV2 entity) {
        NetworkWrapper.getInstance().s_openInventory(player, entity, this::onInitialOpen, pos);
    }
}
