package net.shale.horde.backpack.api;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class BackpackBlock extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(7.0913, 10, 5.82174, 9.0913, 11, 6.521739999999999),
            Block.createCuboidShape(3.8913, 12, 6.42174, 12.0913, 13, 9.52174),
            Block.createCuboidShape(3.8913, 11, 6.021739999999999, 12.0913, 13, 6.521739999999999),
            Block.createCuboidShape(3.9913, 3, 6.521739999999999, 11.9913, 12, 9.52174),
            Block.createCuboidShape(4.9913, 4, 9.52174, 10.9913, 11, 10.02174),
            Block.createCuboidShape(1.9913, 7, 7.521739999999999, 2.4913, 8, 8.52174),
            Block.createCuboidShape(1.9913, 9, 6.521739999999999, 3.9913, 9.5, 9.52174),
            Block.createCuboidShape(1.9913, 8, 6.521739999999999, 2.4913, 9, 9.52174),
            Block.createCuboidShape(2.4913, 4, 6.521739999999999, 3.9913, 9, 9.52174),
            Block.createCuboidShape(13.2913, 7, 7.521739999999999, 13.9913, 8, 8.52174),
            Block.createCuboidShape(11.9913, 9, 6.521739999999999, 13.9913, 9.5, 9.52174),
            Block.createCuboidShape(13.4913, 8, 6.521739999999999, 13.9913, 9, 9.52174),
            Block.createCuboidShape(11.9913, 4, 6.521739999999999, 13.4913, 9, 9.52174),
            Block.createCuboidShape(4.9913, 3, 5.02174, 10.9913, 8, 6.521739999999999),
            Block.createCuboidShape(7.0913, 6, 4.32174, 9.0913, 7, 5.02174),
            Block.createCuboidShape(4.9913, 8, 4.52174, 10.9913, 8.5, 6.521739999999999),
            Block.createCuboidShape(4.9913, 7, 4.52174, 10.9913, 8, 5.02174),
            Block.createCuboidShape(1.9913, 0, 5.52174, 13.9913, 3, 9.52174),
            Block.createCuboidShape(3.9913, 0, 5.02174, 4.9913, 4, 6.521739999999999),
            Block.createCuboidShape(3.9913, -0.5, 5.52174, 4.9913, 0, 9.52174),
            Block.createCuboidShape(3.9913, 0, 9.52174, 4.9913, 4, 10.02174),
            Block.createCuboidShape(10.9913, 0, 5.02174, 11.9913, 4, 6.521739999999999),
            Block.createCuboidShape(10.9913, 0, 9.52174, 11.9913, 4, 10.02174),
            Block.createCuboidShape(10.9913, -0.5, 5.52174, 11.9913, 0, 9.52174)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(9.47826, 10, 7.0913, 10.17826, 11, 9.0913),
            Block.createCuboidShape(6.478260000000001, 12, 3.891300000000001, 9.57826, 13, 12.0913),
            Block.createCuboidShape(9.47826, 11, 3.891300000000001, 9.97826, 13, 12.0913),
            Block.createCuboidShape(6.478260000000001, 3, 3.991299999999999, 9.47826, 12, 11.9913),
            Block.createCuboidShape(5.978260000000001, 4, 4.991299999999999, 6.478260000000001, 11, 10.9913),
            Block.createCuboidShape(7.478260000000001, 7, 1.991299999999999, 8.47826, 8, 2.491299999999999),
            Block.createCuboidShape(6.478260000000001, 9, 1.991299999999999, 9.47826, 9.5, 3.991299999999999),
            Block.createCuboidShape(6.478260000000001, 8, 1.991299999999999, 9.47826, 9, 2.491299999999999),
            Block.createCuboidShape(6.478260000000001, 4, 2.491299999999999, 9.47826, 9, 3.991299999999999),
            Block.createCuboidShape(7.478260000000001, 7, 13.2913, 8.47826, 8, 13.9913),
            Block.createCuboidShape(6.478260000000001, 9, 11.9913, 9.47826, 9.5, 13.9913),
            Block.createCuboidShape(6.478260000000001, 8, 13.4913, 9.47826, 9, 13.9913),
            Block.createCuboidShape(6.478260000000001, 4, 11.9913, 9.47826, 9, 13.4913),
            Block.createCuboidShape(9.47826, 3, 4.991299999999999, 10.978259999999999, 8, 10.9913),
            Block.createCuboidShape(10.978259999999999, 6, 7.0913, 11.67826, 7, 9.0913),
            Block.createCuboidShape(9.47826, 8, 4.991299999999999, 11.478259999999999, 8.5, 10.9913),
            Block.createCuboidShape(10.978259999999999, 7, 4.991299999999999, 11.478259999999999, 8, 10.9913),
            Block.createCuboidShape(6.478260000000001, 0, 1.991299999999999, 10.478259999999999, 3, 13.9913),
            Block.createCuboidShape(9.47826, 0, 3.991299999999999, 10.978259999999999, 4, 4.991299999999999),
            Block.createCuboidShape(6.478260000000001, -0.5, 3.991299999999999, 10.478259999999999, 0, 4.991299999999999),
            Block.createCuboidShape(5.978260000000001, 0, 3.991299999999999, 6.478260000000001, 4, 4.991299999999999),
            Block.createCuboidShape(9.47826, 0, 10.9913, 10.978259999999999, 4, 11.9913),
            Block.createCuboidShape(5.978260000000001, 0, 10.9913, 6.478260000000001, 4, 11.9913),
            Block.createCuboidShape(6.478260000000001, -0.5, 10.9913, 10.478259999999999, 0, 11.9913)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(6.9087, 10, 9.47826, 8.9087, 11, 10.17826),
            Block.createCuboidShape(3.9086999999999996, 12, 6.478260000000001, 12.108699999999999, 13, 9.57826),
            Block.createCuboidShape(3.9086999999999996, 11, 9.47826, 12.108699999999999, 13, 9.97826),
            Block.createCuboidShape(4.008699999999999, 3, 6.478260000000001, 12.008700000000001, 12, 9.47826),
            Block.createCuboidShape(5.008699999999999, 4, 5.978260000000001, 11.008700000000001, 11, 6.478260000000001),
            Block.createCuboidShape(13.508700000000001, 7, 7.478260000000001, 14.008700000000001, 8, 8.47826),
            Block.createCuboidShape(12.008700000000001, 9, 6.478260000000001, 14.008700000000001, 9.5, 9.47826),
            Block.createCuboidShape(13.508700000000001, 8, 6.478260000000001, 14.008700000000001, 9, 9.47826),
            Block.createCuboidShape(12.008700000000001, 4, 6.478260000000001, 13.508700000000001, 9, 9.47826),
            Block.createCuboidShape(2.0086999999999993, 7, 7.478260000000001, 2.7087000000000003, 8, 8.47826),
            Block.createCuboidShape(2.0086999999999993, 9, 6.478260000000001, 4.008699999999999, 9.5, 9.47826),
            Block.createCuboidShape(2.0086999999999993, 8, 6.478260000000001, 2.5086999999999993, 9, 9.47826),
            Block.createCuboidShape(2.5086999999999993, 4, 6.478260000000001, 4.008699999999999, 9, 9.47826),
            Block.createCuboidShape(5.008699999999999, 3, 9.47826, 11.008700000000001, 8, 10.978259999999999),
            Block.createCuboidShape(6.9087, 6, 10.978259999999999, 8.9087, 7, 11.67826),
            Block.createCuboidShape(5.008699999999999, 8, 9.47826, 11.008700000000001, 8.5, 11.478259999999999),
            Block.createCuboidShape(5.008699999999999, 7, 10.978259999999999, 11.008700000000001, 8, 11.478259999999999),
            Block.createCuboidShape(2.0086999999999993, 0, 6.478260000000001, 14.008700000000001, 3, 10.478259999999999),
            Block.createCuboidShape(11.008700000000001, 0, 9.47826, 12.008700000000001, 4, 10.978259999999999),
            Block.createCuboidShape(11.008700000000001, -0.5, 6.478260000000001, 12.008700000000001, 0, 10.478259999999999),
            Block.createCuboidShape(11.008700000000001, 0, 5.978260000000001, 12.008700000000001, 4, 6.478260000000001),
            Block.createCuboidShape(4.008699999999999, 0, 9.47826, 5.008699999999999, 4, 10.978259999999999),
            Block.createCuboidShape(4.008699999999999, 0, 5.978260000000001, 5.008699999999999, 4, 6.478260000000001),
            Block.createCuboidShape(4.008699999999999, -0.5, 6.478260000000001, 5.008699999999999, 0, 10.478259999999999)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(5.82174, 10, 6.9087, 6.521739999999999, 11, 8.9087),
            Block.createCuboidShape(6.42174, 12, 3.9086999999999996, 9.52174, 13, 12.108699999999999),
            Block.createCuboidShape(6.021739999999999, 11, 3.9086999999999996, 6.521739999999999, 13, 12.108699999999999),
            Block.createCuboidShape(6.521739999999999, 3, 4.008699999999999, 9.52174, 12, 12.008700000000001),
            Block.createCuboidShape(9.52174, 4, 5.008699999999999, 10.02174, 11, 11.008700000000001),
            Block.createCuboidShape(7.521739999999999, 7, 13.508700000000001, 8.52174, 8, 14.008700000000001),
            Block.createCuboidShape(6.521739999999999, 9, 12.008700000000001, 9.52174, 9.5, 14.008700000000001),
            Block.createCuboidShape(6.521739999999999, 8, 13.508700000000001, 9.52174, 9, 14.008700000000001),
            Block.createCuboidShape(6.521739999999999, 4, 12.008700000000001, 9.52174, 9, 13.508700000000001),
            Block.createCuboidShape(7.521739999999999, 7, 2.0086999999999993, 8.52174, 8, 2.7087000000000003),
            Block.createCuboidShape(6.521739999999999, 9, 2.0086999999999993, 9.52174, 9.5, 4.008699999999999),
            Block.createCuboidShape(6.521739999999999, 8, 2.0086999999999993, 9.52174, 9, 2.5086999999999993),
            Block.createCuboidShape(6.521739999999999, 4, 2.5086999999999993, 9.52174, 9, 4.008699999999999),
            Block.createCuboidShape(5.021740000000001, 3, 5.008699999999999, 6.521739999999999, 8, 11.008700000000001),
            Block.createCuboidShape(4.32174, 6, 6.9087, 5.021740000000001, 7, 8.9087),
            Block.createCuboidShape(4.521740000000001, 8, 5.008699999999999, 6.521739999999999, 8.5, 11.008700000000001),
            Block.createCuboidShape(4.521740000000001, 7, 5.008699999999999, 5.021740000000001, 8, 11.008700000000001),
            Block.createCuboidShape(5.521740000000001, 0, 2.0086999999999993, 9.52174, 3, 14.008700000000001),
            Block.createCuboidShape(5.021740000000001, 0, 11.008700000000001, 6.521739999999999, 4, 12.008700000000001),
            Block.createCuboidShape(5.521740000000001, -0.5, 11.008700000000001, 9.52174, 0, 12.008700000000001),
            Block.createCuboidShape(9.52174, 0, 11.008700000000001, 10.02174, 4, 12.008700000000001),
            Block.createCuboidShape(5.021740000000001, 0, 4.008699999999999, 6.521739999999999, 4, 5.008699999999999),
            Block.createCuboidShape(9.52174, 0, 4.008699999999999, 10.02174, 4, 5.008699999999999),
            Block.createCuboidShape(5.521740000000001, -0.5, 4.008699999999999, 9.52174, 0, 5.008699999999999)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public BackpackBlock(Settings settings) {
        super(settings);
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
}