package net.shale.horde.backpack.item.gold;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.shale.horde.backpack.item.Putdown;
import net.shale.horde.backpack.registry.BB_GoldBlockRegistry;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GrayItemGold extends Putdown {
    public GrayItemGold(Settings settings) {
        super(settings);
    }
    @Override
    protected BlockState getBlock() {
        return BB_GoldBlockRegistry.GOLD_GRAY_BLOCK.getDefaultState();
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int i = stack.getMaxDamage() - stack.getDamage();
        tooltip.add(new TranslatableText("tooltip.backpack.gold").formatted(Formatting.YELLOW));
    }
}
