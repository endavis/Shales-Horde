package net.shale.horde.backpack.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Netherite extends BackpackItem{
    public Netherite(Settings settings, int inventorySize) {
        super(settings, inventorySize);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int i = stack.getMaxDamage() - stack.getDamage();
        tooltip.add(new LiteralText("162 Slots aaaand Fireproof").formatted(Formatting.GOLD));
    }
}
