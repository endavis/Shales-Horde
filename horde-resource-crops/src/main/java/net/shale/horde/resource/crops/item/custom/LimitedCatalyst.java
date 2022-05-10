package net.shale.horde.resource.crops.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.shale.horde.resource.crops.item.RemainderItem;
import net.shale.horde.resource.crops.item.item_group;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LimitedCatalyst extends RemainderItem {
    public LimitedCatalyst() {
        super(new FabricItemSettings().group(item_group.MISC).maxDamage(1000), true);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int i = stack.getMaxDamage() - stack.getDamage();
        tooltip.add(new LiteralText(i + " uses left"));
    }
}
