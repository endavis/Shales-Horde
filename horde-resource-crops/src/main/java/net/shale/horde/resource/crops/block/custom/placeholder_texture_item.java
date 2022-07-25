package net.shale.horde.resource.crops.block.custom;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
//import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
//import net.minecraft.text.TranslatableText;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class placeholder_texture_item extends Item {
    public placeholder_texture_item(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int i = stack.getMaxDamage() - stack.getDamage();
        //tooltip.add(new TranslatableText("tooltip.texture").formatted(Formatting.RED));
        tooltip.add(Text.translatable("tooltip.texture").formatted(Formatting.RED));
    }
}
