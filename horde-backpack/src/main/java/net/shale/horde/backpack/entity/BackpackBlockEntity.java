package net.shale.horde.backpack.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.shale.horde.backpack.Backpack;
import net.shale.horde.backpack.api.ImplementedInventory;
import net.shale.horde.backpack.block.BackpackBlock;
import ninjaphenix.container_library.api.v2.OpenableBlockEntityV2;

import static net.shale.horde.backpack.entity.BackpackEntity.NBT_TAG;

public class BackpackBlockEntity extends LootableContainerBlockEntity implements OpenableBlockEntityV2, ImplementedInventory {
    private final int inventorySize;
    private final Text customName;
    private DefaultedList<ItemStack> inventory;

    public BackpackBlockEntity(BlockPos pos, BlockState state) {
        super(Backpack.BACKPACK_BLOCK_ENTITY, pos, state);
        BackpackBlock backpack = (BackpackBlock) state.getBlock();
        this.inventorySize = backpack.getInventorySize();
        this.inventory = DefaultedList.ofSize(inventorySize, ItemStack.EMPTY);
        this.customName = backpack.getName();
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    public void setItems(ItemStack stack) {
        NbtCompound tag = stack.getSubNbt(NBT_TAG);
        this.setItems(tag);
    }

    public void setItems(NbtCompound tag) {
        if (tag != null) {
            Inventories.readNbt(tag, inventory);
        }
    }

    @Override
    public DefaultedList<ItemStack> getInvStackList() {
        return inventory;
    }

    @Override
    protected void setInvStackList(DefaultedList<ItemStack> stacks) {
        inventory = stacks;
    }

    @Override
    public int size() {
        return inventorySize;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, this.inventory);
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.inventory);
    }

    public Text getContainerName() {
        return this.customName;
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return null;
    }
}