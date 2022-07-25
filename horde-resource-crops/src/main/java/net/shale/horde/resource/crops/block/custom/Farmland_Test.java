package net.shale.horde.resource.crops.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Formatting;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import java.util.List;

public class Farmland_Test extends FarmlandBlock {
    public static final IntProperty MOISTURE = Properties.MOISTURE;
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    public static final int MAX_MOISTURE = 7;
    public Farmland_Test(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(MOISTURE, 0));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        //tooltip.add(new TranslatableText("tooltip.wip").formatted(Formatting.RED));
        tooltip.add(Text.translatable("tooltip.wip").formatted(Formatting.RED));
    }
}
