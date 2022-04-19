/**
 * This is a copy of the container libs NetworkWrapperImpl Adapted for use with Items (ie bags)
 * https://github.com/NinjaPhenix/container-library/blob/e12b099f621bb2b2859f84dfba8fcdf4a3e75d7b/fabric/src/main/java/ninjaphenix/container_library/wrappers/NetworkWrapperImpl.java
 */

package net.shale.horde.backpack.api.wrappers;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import ninjaphenix.container_library.inventory.ServerScreenHandlerFactory;
import org.jetbrains.annotations.Nullable;

public class NetworkWrapperImpl extends NetworkWrapper {
    @Override
    protected void openScreenHandler(ServerPlayerEntity player, Inventory inventory, ServerScreenHandlerFactory factory, Text title) {
        player.openHandledScreen(new ExtendedScreenHandlerFactory() {
            @Override
            public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buffer) {
                buffer.writeInt(inventory.size());
            }

            @Override
            public Text getDisplayName() {
                return title;
            }

            @Nullable
            @Override
            public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
                return factory.create(syncId, inventory, playerInventory);
            }
        });
    }

    @Override
    public boolean canOpenInventory(ServerPlayerEntity player, BlockPos pos) {
        return true;
    }
}
