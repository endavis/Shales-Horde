/**
 * This is a copy of the container libs NetworkWrapper Adapted for use with Items (ie bags)
 * https://github.com/NinjaPhenix/container-library/blob/1.18/common/fabricSrc/main/java/ninjaphenix/container_library/wrappers/NetworkWrapper.java
 */

package net.shale.horde.backpack.api.wrappers;

import net.minecraft.inventory.Inventory;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.shale.horde.backpack.api.inventory.AbstractHandler;
import ninjaphenix.container_library.api.v2.OpenableBlockEntityV2;
import ninjaphenix.container_library.inventory.ServerScreenHandlerFactory;

import java.util.function.Consumer;

public abstract class NetworkWrapper {
    private static NetworkWrapper INSTANCE;

    public static NetworkWrapper getInstance() {
        if (NetworkWrapper.INSTANCE == null) {
            NetworkWrapper.INSTANCE = new NetworkWrapperImpl();
        }
        return NetworkWrapper.INSTANCE;
    }

    protected abstract void openScreenHandler(ServerPlayerEntity player, Inventory inventory, ServerScreenHandlerFactory factory, Text title);

    public final void s_openInventory(ServerPlayerEntity player, OpenableBlockEntityV2 inventory, Consumer<ServerPlayerEntity> onInitialOpen, BlockPos pos) {
        if (this.canOpenInventory(player, pos)) {
            Text title = inventory.getInventoryTitle();
            if (!inventory.canBeUsedBy(player)) {
                player.sendMessage(new TranslatableText("container.isLocked", title), true);
                player.playSound(SoundEvents.BLOCK_CHEST_LOCKED, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return;
            }
            onInitialOpen.accept(player);
            this.openScreenHandler(player, inventory.getInventory(), AbstractHandler::new, title);
        }
    }

    // todo: expose in api or way to force a specific screen
    public abstract boolean canOpenInventory(ServerPlayerEntity player, BlockPos pos);
}
