package net.shale.horde.backpack.item.netherite;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.shale.horde.backpack.item.Putdown;
import net.shale.horde.backpack.registry.BB_NetheriteBlockRegistry;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WhiteItemNetherite extends Putdown {
    public WhiteItemNetherite(Settings settings) {
        super(settings);
    }
    @Override
    protected BlockState getBlock() {
        return BB_NetheriteBlockRegistry.NETHERITE_WHITE_BLOCK.getDefaultState();
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int i = stack.getMaxDamage() - stack.getDamage();
        tooltip.add(new TranslatableText("tooltip.backpack.netherite").formatted(Formatting.LIGHT_PURPLE));
    }
}
