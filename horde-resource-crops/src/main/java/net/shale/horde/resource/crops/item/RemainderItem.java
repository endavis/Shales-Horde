package net.shale.horde.resource.crops.item;

import net.minecraft.item.Item;

public class RemainderItem extends Item {

    private final boolean canTakeDamage;

    public RemainderItem(Settings settings) {
        super(settings);
        this.canTakeDamage = false;
    }

    public RemainderItem(Settings settings, boolean canTakeDamage) {
        super(settings);
        this.canTakeDamage = canTakeDamage;
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }

    public boolean hasRecipeRemainderActual() {
        return true;
    }

    public Item getRecipeRemainderActual() {
        return this;
    }

    public boolean canTakeDamage() {
        return this.canTakeDamage;
    }
}
