package net.shale.horde.backpack.entity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ContainerLock;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Nameable;
import net.minecraft.util.collection.DefaultedList;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public abstract class EntityBase implements Nameable, Inventory, NamedScreenHandlerFactory {
    private ContainerLock lock;
    private Text customName;

    protected EntityBase() {
        this.lock = ContainerLock.EMPTY;
    }

    public void readNbt(NbtCompound nbt) {
        this.lock = ContainerLock.fromNbt(nbt);
        if (nbt.contains("CustomName", 8)) {
            this.customName = Text.Serializer.fromJson(nbt.getString("CustomName"));
        }

    }

    protected void writeNbt(NbtCompound nbt) {
        this.lock.writeNbt(nbt);
        if (this.customName != null) {
            nbt.putString("CustomName", Text.Serializer.toJson(this.customName));
        }

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public ItemStack getStack(int slot) {
        return this.getInvStackList().get(slot);
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        ItemStack itemStack = Inventories.splitStack(this.getInvStackList(), slot, amount);
        if (!itemStack.isEmpty()) {
            this.markDirty();
        }

        return itemStack;
    }

    @Override
    public ItemStack removeStack(int slot) {
        return Inventories.removeStack(this.getInvStackList(), slot);
    }

    @Override
    public void setStack(int slot, ItemStack stack) {
        this.getInvStackList().set(slot, stack);
        if (stack.getCount() > this.getMaxCountPerStack()) {
            stack.setCount(this.getMaxCountPerStack());
        }

        this.markDirty();
    }

    @Override
    public int getMaxCountPerStack() {
        return Inventory.super.getMaxCountPerStack();
    }

    @Override
    public void markDirty() {

    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return true;
    }

    @Override
    public void onOpen(PlayerEntity player) {
        Inventory.super.onOpen(player);
    }

    @Override
    public void onClose(PlayerEntity player) {
        Inventory.super.onClose(player);
    }

    @Override
    public boolean isValid(int slot, ItemStack stack) {
        return Inventory.super.isValid(slot, stack);
    }

    @Override
    public int count(Item item) {
        return Inventory.super.count(item);
    }

    @Override
    public boolean containsAny(Set<Item> items) {
        return Inventory.super.containsAny(items);
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return null;
    }

    @Override
    public void clear() {
        this.getInvStackList().clear();
    }

    protected abstract DefaultedList<ItemStack> getInvStackList();

    protected abstract void setInvStackList(DefaultedList<ItemStack> list);

    @Override
    public Text getName() {
        return null;
    }

    @Override
    public boolean hasCustomName() {
        return Nameable.super.hasCustomName();
    }

    @Override
    public Text getDisplayName() {
        return Nameable.super.getDisplayName();
    }

    @Nullable
    @Override
    public Text getCustomName() {
        return Nameable.super.getCustomName();
    }
}
