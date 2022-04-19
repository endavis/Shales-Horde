package net.shale.horde.backpack.entity;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.shale.horde.backpack.api.ImplementedInventory;
import ninjaphenix.container_library.api.v2.OpenableBlockEntityV2;

public class BackpackEntity extends EntityBase implements OpenableBlockEntityV2, ImplementedInventory {
    private final ItemStack stack;
    private final int inventorySize;
    private DefaultedList<ItemStack> inventory;
    private Text customName;

    public BackpackEntity(int inventorySize, ItemStack stack) {
        this.stack = stack;
        this.inventorySize = inventorySize;
        this.inventory = DefaultedList.ofSize(inventorySize, ItemStack.EMPTY);
        NbtCompound tag = stack.getSubNbt("Items");
        if (tag != null) {
            Inventories.readNbt(tag, inventory);
        }

        this.customName = stack.getName();
    }

    @Override
    public boolean canBeUsedBy(ServerPlayerEntity player) {
        return true;
    }

    public int size() {
        return inventorySize;
    }

    public DefaultedList<ItemStack> getInvStackList() {
        return inventory;
    }

    public void setInvStackList(DefaultedList<ItemStack> stacks) {
        inventory = stacks;
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    public Text getContainerName() {
        return this.customName;
    }

    public void setContainerName(String newName) {
        this.customName = new LiteralText(newName);
    }

    public Text getName() {
        return this.customName != null ? this.customName : this.getContainerName();
    }

    public Text getDisplayName() {
        return this.getName();
    }

    public Text getCustomName() {
        return this.customName;
    }

    public void setCustomName(Text customName) {
        this.customName = customName;
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return null;
    }

    @Override
    public void markDirty() {
        NbtCompound tag = stack.getOrCreateSubNbt("Items");
        Inventories.writeNbt(tag, inventory);
    }
}
