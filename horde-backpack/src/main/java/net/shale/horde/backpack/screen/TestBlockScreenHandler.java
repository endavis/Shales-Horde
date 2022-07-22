package net.shale.horde.backpack.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.world.World;
import net.shale.horde.backpack.registry.HordeScreenHandlerRegistry;
import net.shale.horde.backpack.screen.slots.FuelSlot;
import net.shale.horde.backpack.screen.slots.ResultSlot;

public class TestBlockScreenHandler extends ScreenHandler{
    private final Inventory inventory;
    private final World world;

    public TestBlockScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(54));
    }

    public TestBlockScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(HordeScreenHandlerRegistry.TESTBLOCK_SCREEN_HANDLER, syncId);
        checkSize(inventory, 54);
        this.inventory = inventory;
        this.world = playerInventory.player.world;
        inventory.onOpen(playerInventory.player);
        int i;
        int j;
//        addPlayerHotbar(playerInventory);
//        addPlayerInventory(playerInventory);

        // Chest Inventory
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 9; j++) {
                this.addSlot(new Slot(inventory, i * 9 + j, 8 + j * 18, 0 + i * 18));
            }
        }
        int m;
        int l;
//        //Our inventory
//        for (m = 0; m < 6; ++m) {
//            for (l = 0; l < 9; ++l) {
//                this.addSlot(new Slot(inventory, l + m * 9, 62 + l * 18, -10 + m * 18));
//            }
//        }
        //The player inventory
        for (m = 0; m < 3; ++m) {
            for (l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + m * 9 + 9, 8 + l * 18, 122 + m * 18));
            }
        }
//        //The player Hotbar
//        for (m = 0; m < 9; ++m) {
//            this.addSlot(new Slot(playerInventory, m, 8 + m * 18, 180));
//        }
    }
//    private void addPlayerHotbar(PlayerInventory playerInventory) {
//        for (int i = 0; i < 9; ++i) {
//            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 170));
//        }
//    }
//
//    private void addPlayerInventory(PlayerInventory playerInventory) {
//        for (int i = 0; i < 3; ++i) {
//            for (int l = 0; l < 9; ++l) {
//                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 112 + i * 18));
//            }
//        }
//    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }
}
