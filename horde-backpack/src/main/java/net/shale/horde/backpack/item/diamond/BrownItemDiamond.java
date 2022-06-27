package net.shale.horde.backpack.item.diamond;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.shale.horde.backpack.item.Putdown;
import net.shale.horde.backpack.registry.BB_DiamondBlockRegistry;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BrownItemDiamond extends Putdown {
    public BrownItemDiamond(Settings settings) {
        super(settings);
    }
    @Override
    protected BlockState getBlock() {
        return BB_DiamondBlockRegistry.DIAMOND_BROWN_BLOCK.getDefaultState();
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int i = stack.getMaxDamage() - stack.getDamage();
        tooltip.add(new TranslatableText("tooltip.backpack.diamond").formatted(Formatting.AQUA));
    }
}
