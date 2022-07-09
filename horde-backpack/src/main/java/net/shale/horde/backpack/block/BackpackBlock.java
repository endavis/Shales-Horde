package net.shale.horde.backpack.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public abstract class BackpackBlock extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(7.0913, 10, 11.82174, 9.0913, 11, 12.521740000000001),
            Block.createCuboidShape(3.8913, 12, 12.42174, 12.0913, 12.7, 15.52174),
            Block.createCuboidShape(3.8913, 11, 12.021740000000001, 12.0913, 12.7, 12.521740000000001),
            Block.createCuboidShape(3.9913, 3, 12.521740000000001, 11.9913, 12, 15.52174),
            Block.createCuboidShape(4.9913, 4, 15.52174, 10.9913, 11, 16.02174),
            Block.createCuboidShape(1.8, 7, 13.521740000000001, 2.6, 8, 14.52174),
            Block.createCuboidShape(13.5, 7, 13.521740000000001, 14.2, 8, 14.52174),
            Block.createCuboidShape(1.9913, 9, 12.521740000000001, 3.9913, 9.5, 15.52174),
            Block.createCuboidShape(1.9913, 8, 12.521740000000001, 2.4913, 9, 15.52174),
            Block.createCuboidShape(2.4913, 4, 12.521740000000001, 3.9913, 9, 15.52174),
            Block.createCuboidShape(11.9913, 9, 12.521740000000001, 13.9913, 9.5, 15.52174),
            Block.createCuboidShape(13.4913, 8, 12.521740000000001, 13.9913, 9, 15.52174),
            Block.createCuboidShape(11.9913, 4, 12.521740000000001, 13.4913, 9, 15.52174),
            Block.createCuboidShape(4.9913, 3, 11.021740000000001, 10.9913, 8, 12.521740000000001),
            Block.createCuboidShape(7.0913, 6, 10.32174, 9.0913, 7, 11.021740000000001),
            Block.createCuboidShape(4.9913, 8, 10.521740000000001, 10.9913, 8.5, 12.521740000000001),
            Block.createCuboidShape(4.9913, 7, 10.521740000000001, 10.9913, 8, 11.021740000000001),
            Block.createCuboidShape(1.9913, 0, 11.521740000000001, 13.9913, 3, 15.52174),
            Block.createCuboidShape(3.9913, 0, 11.2, 4.9913, 3.3, 12.5),
            Block.createCuboidShape(3.9913, -0.5, 11.521740000000001, 4.9913, 0, 15.52174),
            Block.createCuboidShape(3.9913, 0, 15.52174, 4.9913, 3.4, 16.02174),
            Block.createCuboidShape(10.9913, 0, 11.2, 11.9913, 3.3, 12.5),
            Block.createCuboidShape(10.9913, 0, 15.52174, 11.9913, 3.4, 16.02174),
            Block.createCuboidShape(10.9913, -0.5, 11.521740000000001, 11.9913, 0, 15.52174),
            Block.createCuboidShape(11, 3, 12.51, 12, 11, 12.52),
            Block.createCuboidShape(4, 3, 12.51, 5, 11, 12.52),
            Block.createCuboidShape(4, 3, 15.52, 12, 12, 15.53),
            Block.createCuboidShape(12, 3, 12.5, 12.01, 4, 15.5),
            Block.createCuboidShape(12, 10, 12.5, 12.01, 12, 15.5),
            Block.createCuboidShape(3.99, 3, 12.5, 4, 4, 15.5),
            Block.createCuboidShape(3.99, 10, 12.5, 4, 12, 15.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(3.478259999999999, 10, 7.0913, 4.17826, 11, 9.0913),
            Block.createCuboidShape(0.4782600000000006, 12, 3.891300000000001, 3.57826, 12.7, 12.0913),
            Block.createCuboidShape(3.478259999999999, 11, 3.891300000000001, 3.978259999999999, 12.7, 12.0913),
            Block.createCuboidShape(0.4782600000000006, 3, 3.991299999999999, 3.478259999999999, 12, 11.9913),
            Block.createCuboidShape(-0.021740000000001203, 4, 4.991299999999999, 0.4782600000000006, 11, 10.9913),
            Block.createCuboidShape(1.4782600000000006, 7, 1.8000000000000007, 2.478259999999999, 8, 2.5999999999999996),
            Block.createCuboidShape(1.4782600000000006, 7, 13.5, 2.478259999999999, 8, 14.2),
            Block.createCuboidShape(0.4782600000000006, 9, 1.991299999999999, 3.478259999999999, 9.5, 3.991299999999999),
            Block.createCuboidShape(0.4782600000000006, 8, 1.991299999999999, 3.478259999999999, 9, 2.491299999999999),
            Block.createCuboidShape(0.4782600000000006, 4, 2.491299999999999, 3.478259999999999, 9, 3.991299999999999),
            Block.createCuboidShape(0.4782600000000006, 9, 11.9913, 3.478259999999999, 9.5, 13.9913),
            Block.createCuboidShape(0.4782600000000006, 8, 13.4913, 3.478259999999999, 9, 13.9913),
            Block.createCuboidShape(0.4782600000000006, 4, 11.9913, 3.478259999999999, 9, 13.4913),
            Block.createCuboidShape(3.478259999999999, 3, 4.991299999999999, 4.978259999999999, 8, 10.9913),
            Block.createCuboidShape(4.978259999999999, 6, 7.0913, 5.67826, 7, 9.0913),
            Block.createCuboidShape(3.478259999999999, 8, 4.991299999999999, 5.478259999999999, 8.5, 10.9913),
            Block.createCuboidShape(4.978259999999999, 7, 4.991299999999999, 5.478259999999999, 8, 10.9913),
            Block.createCuboidShape(0.4782600000000006, 0, 1.991299999999999, 4.478259999999999, 3, 13.9913),
            Block.createCuboidShape(3.5, 0, 3.991299999999999, 4.800000000000001, 3.3, 4.991299999999999),
            Block.createCuboidShape(0.4782600000000006, -0.5, 3.991299999999999, 4.478259999999999, 0, 4.991299999999999),
            Block.createCuboidShape(-0.021740000000001203, 0, 3.991299999999999, 0.4782600000000006, 3.4, 4.991299999999999),
            Block.createCuboidShape(3.5, 0, 10.9913, 4.800000000000001, 3.3, 11.9913),
            Block.createCuboidShape(-0.021740000000001203, 0, 10.9913, 0.4782600000000006, 3.4, 11.9913),
            Block.createCuboidShape(0.4782600000000006, -0.5, 10.9913, 4.478259999999999, 0, 11.9913),
            Block.createCuboidShape(3.4800000000000004, 3, 11, 3.49, 11, 12),
            Block.createCuboidShape(3.4800000000000004, 3, 4, 3.49, 11, 5),
            Block.createCuboidShape(0.47000000000000064, 3, 4, 0.4800000000000004, 12, 12),
            Block.createCuboidShape(0.5, 3, 12, 3.5, 4, 12.01),
            Block.createCuboidShape(0.5, 10, 12, 3.5, 12, 12.01),
            Block.createCuboidShape(0.5, 3, 3.99, 3.5, 4, 4),
            Block.createCuboidShape(0.5, 10, 3.99, 3.5, 12, 4)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(6.9087, 10, 3.478259999999999, 8.9087, 11, 4.17826),
            Block.createCuboidShape(3.9086999999999996, 12, 0.4782600000000006, 12.108699999999999, 12.7, 3.57826),
            Block.createCuboidShape(3.9086999999999996, 11, 3.478259999999999, 12.108699999999999, 12.7, 3.978259999999999),
            Block.createCuboidShape(4.008699999999999, 3, 0.4782600000000006, 12.008700000000001, 12, 3.478259999999999),
            Block.createCuboidShape(5.008699999999999, 4, -0.021740000000001203, 11.008700000000001, 11, 0.4782600000000006),
            Block.createCuboidShape(13.4, 7, 1.4782600000000006, 14.2, 8, 2.478259999999999),
            Block.createCuboidShape(1.8000000000000007, 7, 1.4782600000000006, 2.5, 8, 2.478259999999999),
            Block.createCuboidShape(12.008700000000001, 9, 0.4782600000000006, 14.008700000000001, 9.5, 3.478259999999999),
            Block.createCuboidShape(13.508700000000001, 8, 0.4782600000000006, 14.008700000000001, 9, 3.478259999999999),
            Block.createCuboidShape(12.008700000000001, 4, 0.4782600000000006, 13.508700000000001, 9, 3.478259999999999),
            Block.createCuboidShape(2.0086999999999993, 9, 0.4782600000000006, 4.008699999999999, 9.5, 3.478259999999999),
            Block.createCuboidShape(2.0086999999999993, 8, 0.4782600000000006, 2.5086999999999993, 9, 3.478259999999999),
            Block.createCuboidShape(2.5086999999999993, 4, 0.4782600000000006, 4.008699999999999, 9, 3.478259999999999),
            Block.createCuboidShape(5.008699999999999, 3, 3.478259999999999, 11.008700000000001, 8, 4.978259999999999),
            Block.createCuboidShape(6.9087, 6, 4.978259999999999, 8.9087, 7, 5.67826),
            Block.createCuboidShape(5.008699999999999, 8, 3.478259999999999, 11.008700000000001, 8.5, 5.478259999999999),
            Block.createCuboidShape(5.008699999999999, 7, 4.978259999999999, 11.008700000000001, 8, 5.478259999999999),
            Block.createCuboidShape(2.0086999999999993, 0, 0.4782600000000006, 14.008700000000001, 3, 4.478259999999999),
            Block.createCuboidShape(11.008700000000001, 0, 3.5, 12.008700000000001, 3.3, 4.800000000000001),
            Block.createCuboidShape(11.008700000000001, -0.5, 0.4782600000000006, 12.008700000000001, 0, 4.478259999999999),
            Block.createCuboidShape(11.008700000000001, 0, -0.021740000000001203, 12.008700000000001, 3.4, 0.4782600000000006),
            Block.createCuboidShape(4.008699999999999, 0, 3.5, 5.008699999999999, 3.3, 4.800000000000001),
            Block.createCuboidShape(4.008699999999999, 0, -0.021740000000001203, 5.008699999999999, 3.4, 0.4782600000000006),
            Block.createCuboidShape(4.008699999999999, -0.5, 0.4782600000000006, 5.008699999999999, 0, 4.478259999999999),
            Block.createCuboidShape(4, 3, 3.4800000000000004, 5, 11, 3.49),
            Block.createCuboidShape(11, 3, 3.4800000000000004, 12, 11, 3.49),
            Block.createCuboidShape(4, 3, 0.47000000000000064, 12, 12, 0.4800000000000004),
            Block.createCuboidShape(3.99, 3, 0.5, 4, 4, 3.5),
            Block.createCuboidShape(3.99, 10, 0.5, 4, 12, 3.5),
            Block.createCuboidShape(12, 3, 0.5, 12.01, 4, 3.5),
            Block.createCuboidShape(12, 10, 0.5, 12.01, 12, 3.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(11.82174, 10, 6.9087, 12.521740000000001, 11, 8.9087),
            Block.createCuboidShape(12.42174, 12, 3.9086999999999996, 15.52174, 12.7, 12.108699999999999),
            Block.createCuboidShape(12.021740000000001, 11, 3.9086999999999996, 12.521740000000001, 12.7, 12.108699999999999),
            Block.createCuboidShape(12.521740000000001, 3, 4.008699999999999, 15.52174, 12, 12.008700000000001),
            Block.createCuboidShape(15.52174, 4, 5.008699999999999, 16.02174, 11, 11.008700000000001),
            Block.createCuboidShape(13.521740000000001, 7, 13.4, 14.52174, 8, 14.2),
            Block.createCuboidShape(13.521740000000001, 7, 1.8000000000000007, 14.52174, 8, 2.5),
            Block.createCuboidShape(12.521740000000001, 9, 12.008700000000001, 15.52174, 9.5, 14.008700000000001),
            Block.createCuboidShape(12.521740000000001, 8, 13.508700000000001, 15.52174, 9, 14.008700000000001),
            Block.createCuboidShape(12.521740000000001, 4, 12.008700000000001, 15.52174, 9, 13.508700000000001),
            Block.createCuboidShape(12.521740000000001, 9, 2.0086999999999993, 15.52174, 9.5, 4.008699999999999),
            Block.createCuboidShape(12.521740000000001, 8, 2.0086999999999993, 15.52174, 9, 2.5086999999999993),
            Block.createCuboidShape(12.521740000000001, 4, 2.5086999999999993, 15.52174, 9, 4.008699999999999),
            Block.createCuboidShape(11.021740000000001, 3, 5.008699999999999, 12.521740000000001, 8, 11.008700000000001),
            Block.createCuboidShape(10.32174, 6, 6.9087, 11.021740000000001, 7, 8.9087),
            Block.createCuboidShape(10.521740000000001, 8, 5.008699999999999, 12.521740000000001, 8.5, 11.008700000000001),
            Block.createCuboidShape(10.521740000000001, 7, 5.008699999999999, 11.021740000000001, 8, 11.008700000000001),
            Block.createCuboidShape(11.521740000000001, 0, 2.0086999999999993, 15.52174, 3, 14.008700000000001),
            Block.createCuboidShape(11.2, 0, 11.008700000000001, 12.5, 3.3, 12.008700000000001),
            Block.createCuboidShape(11.521740000000001, -0.5, 11.008700000000001, 15.52174, 0, 12.008700000000001),
            Block.createCuboidShape(15.52174, 0, 11.008700000000001, 16.02174, 3.4, 12.008700000000001),
            Block.createCuboidShape(11.2, 0, 4.008699999999999, 12.5, 3.3, 5.008699999999999),
            Block.createCuboidShape(15.52174, 0, 4.008699999999999, 16.02174, 3.4, 5.008699999999999),
            Block.createCuboidShape(11.521740000000001, -0.5, 4.008699999999999, 15.52174, 0, 5.008699999999999),
            Block.createCuboidShape(12.51, 3, 4, 12.52, 11, 5),
            Block.createCuboidShape(12.51, 3, 11, 12.52, 11, 12),
            Block.createCuboidShape(15.52, 3, 4, 15.53, 12, 12),
            Block.createCuboidShape(12.5, 3, 3.99, 15.5, 4, 4),
            Block.createCuboidShape(12.5, 10, 3.99, 15.5, 12, 4),
            Block.createCuboidShape(12.5, 3, 12, 15.5, 4, 12.01),
            Block.createCuboidShape(12.5, 10, 12, 15.5, 12, 12.01)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public BackpackBlock(Settings settings) {
        super(settings.hardness(9999f));
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public abstract ActionResult useOnBlock(ItemUsageContext context);

    // ↓ ENTITY BULLSHIT ↓ //
    // ↑ ENTITY BULLSHIT ↑ //
}