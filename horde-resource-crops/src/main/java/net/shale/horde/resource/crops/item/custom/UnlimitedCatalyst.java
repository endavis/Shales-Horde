package net.shale.horde.resource.crops.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;

import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.shale.horde.resource.crops.item.RemainderItem;
import net.shale.horde.resource.crops.item.item_group;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UnlimitedCatalyst extends RemainderItem {
    public UnlimitedCatalyst() {
        super(new FabricItemSettings().group(item_group.ORES).maxDamage(1000), false);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int i = stack.getMaxDamage() - stack.getDamage();
        tooltip.add(Text.literal("Unlimited uses").formatted(Formatting.AQUA));
    }
}