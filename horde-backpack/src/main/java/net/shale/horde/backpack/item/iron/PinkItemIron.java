package net.shale.horde.backpack.item.iron;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.shale.horde.backpack.item.Putdown;
import net.shale.horde.backpack.registry.BB_IronBlockRegistry;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PinkItemIron extends Putdown {
    public PinkItemIron(Settings settings) {
        super(settings);
    }
    @Override
    protected BlockState getBlock() {
        return BB_IronBlockRegistry.IRON_PINK_BLOCK.getDefaultState();
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int i = stack.getMaxDamage() - stack.getDamage();
        tooltip.add(new TranslatableText("tooltip.backpack.iron").formatted(Formatting.GRAY));
    }
}
