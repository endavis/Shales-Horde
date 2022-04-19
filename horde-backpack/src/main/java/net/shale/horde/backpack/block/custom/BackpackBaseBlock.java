package net.shale.horde.backpack.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class BackpackBaseBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(7, 10, 11, 9, 11, 11),
            Block.createCuboidShape(4, 12, 11, 12, 13, 14),
            Block.createCuboidShape(4, 11, 11, 12, 13, 11),
            Block.createCuboidShape(4, 3, 11, 12, 12, 14),
            Block.createCuboidShape(2, 7, 13, 2, 8, 13),
            Block.createCuboidShape(2, 9, 11, 4, 9, 14),
            Block.createCuboidShape(2, 8, 11, 2, 9, 14),
            Block.createCuboidShape(2, 4, 11, 4, 9, 14),
            Block.createCuboidShape(13, 7, 12, 14, 8, 13),
            Block.createCuboidShape(12, 9, 11, 14, 9.5, 14),
            Block.createCuboidShape(13, 8, 11, 14, 9, 14),
            Block.createCuboidShape(12, 4, 12, 13, 9, 14),
            Block.createCuboidShape(5, 3, 10, 11, 8, 11),
            Block.createCuboidShape(7, 6, 9., 9, 7, 10),
            Block.createCuboidShape(5, 8, 9, 11, 8, 11),
            Block.createCuboidShape(5, 7, 9, 11, 8, 10),
            Block.createCuboidShape(2, 0, 10, 14, 3, 14),
            Block.createCuboidShape(4, 0, 10, 5, 4, 11),
            Block.createCuboidShape(4, 0, 10, 5, 0, 14),
            Block.createCuboidShape(4, 0, 14, 5, 4, 15),
            Block.createCuboidShape(11, 0, 10, 12, 4, 11),
            Block.createCuboidShape(11, 0, 14, 12, 4, 15),
            Block.createCuboidShape(11, 0, 10, 12, 0, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(2.7347782608695645, 10, 6.356522608695652, 3.434778260869564, 11, 8.356522608695652),
            Block.createCuboidShape(-0.26522173913043634, 12, 3.156522608695653, 2.8347782608695624, 13, 11.356522608695652),
            Block.createCuboidShape(2.7347782608695645, 11, 3.156522608695653, 3.2347782608695645, 13, 11.356522608695652),
            Block.createCuboidShape(-0.26522173913043634, 3, 3.2565226086956507, 2.7347782608695645, 12, 11.25652260869565),
            Block.createCuboidShape(0.7347782608695637, 7, 1.2565226086956507, 1.7347782608695637, 8, 1.7565226086956507),
            Block.createCuboidShape(-0.26522173913043634, 9, 1.2565226086956507, 2.7347782608695645, 9.5, 3.2565226086956507),
            Block.createCuboidShape(-0.26522173913043634, 8, 1.2565226086956507, 2.7347782608695645, 9, 1.7565226086956507),
            Block.createCuboidShape(-0.26522173913043634, 4, 1.7565226086956507, 2.7347782608695645, 9, 3.2565226086956507),
            Block.createCuboidShape(0.7347782608695637, 7, 12.556522608695651, 1.7347782608695637, 8, 13.25652260869565),
            Block.createCuboidShape(-0.26522173913043634, 9, 11.25652260869565, 2.7347782608695645, 9.5, 13.25652260869565),
            Block.createCuboidShape(-0.26522173913043634, 8, 12.75652260869565, 2.7347782608695645, 9, 13.25652260869565),
            Block.createCuboidShape(-0.26522173913043634, 4, 11.25652260869565, 2.7347782608695645, 9, 12.75652260869565),
            Block.createCuboidShape(2.7347782608695645, 3, 4.256522608695651, 4.2347782608695645, 8, 10.25652260869565),
            Block.createCuboidShape(4.2347782608695645, 6, 6.356522608695652, 4.934778260869564, 7, 8.356522608695652),
            Block.createCuboidShape(2.7347782608695645, 8, 4.256522608695651, 4.7347782608695645, 8.5, 10.25652260869565),
            Block.createCuboidShape(4.2347782608695645, 7, 4.256522608695651, 4.7347782608695645, 8, 10.25652260869565),
            Block.createCuboidShape(-0.26522173913043634, 0, 1.2565226086956516, 3.7347782608695645, 3, 13.25652260869565),
            Block.createCuboidShape(2.7347782608695645, 0, 3.2565226086956507, 4.2347782608695645, 4, 4.256522608695651),
            Block.createCuboidShape(-0.26522173913043634, -0.5, 3.2565226086956507, 3.7347782608695645, 0, 4.256522608695651),
            Block.createCuboidShape(-0.7652217391304363, 0, 3.2565226086956507, -0.26522173913043634, 4, 4.256522608695651),
            Block.createCuboidShape(2.7347782608695645, 0, 10.25652260869565, 4.2347782608695645, 4, 11.25652260869565),
            Block.createCuboidShape(-0.7652217391304363, 0, 10.25652260869565, -0.26522173913043634, 4, 11.25652260869565),
            Block.createCuboidShape(-0.26522173913043634, -0.5, 10.25652260869565, 3.7347782608695645, 0, 11.25652260869565)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(6.900000000000001, 10, 4, 8.900000000000002, 11, 4.699999999999999),
            Block.createCuboidShape(3.9000000000000012, 12, 1, 12.100000000000001, 13, 4.100000000000001),
            Block.createCuboidShape(3.9000000000000012, 11, 4, 12.100000000000001, 13, 4.5),
            Block.createCuboidShape(4.000000000000003, 3, 1, 12, 12, 4),
            Block.createCuboidShape(13.5, 7, 2, 14, 8, 3),
            Block.createCuboidShape(12, 9, 1, 14, 9.5, 4),
            Block.createCuboidShape(13.5, 8, 1, 14, 9, 4),
            Block.createCuboidShape(12, 4, 1, 13.5, 9, 4),
            Block.createCuboidShape(2.0000000000000027, 7, 2, 2.700000000000002, 8, 3),
            Block.createCuboidShape(2.0000000000000027, 9, 1, 4.000000000000003, 9.5, 4),
            Block.createCuboidShape(2.0000000000000027, 8, 1, 2.5000000000000027, 9, 4),
            Block.createCuboidShape(2.5000000000000027, 4, 1, 4.000000000000003, 9, 4),
            Block.createCuboidShape(5.000000000000003, 3, 4, 11, 8, 5.5),
            Block.createCuboidShape(6.900000000000001, 6, 5.5, 8.900000000000002, 7, 6.199999999999999),
            Block.createCuboidShape(5.000000000000003, 8, 4, 11, 8.5, 6),
            Block.createCuboidShape(5.000000000000003, 7, 5.5, 11, 8, 6),
            Block.createCuboidShape(2.0000000000000027, 0, 1, 14, 3, 5),
            Block.createCuboidShape(11, 0, 4, 12, 4, 5.5),
            Block.createCuboidShape(11, -0.5, 1, 12, 0, 5),
            Block.createCuboidShape(11, 0, 0.5, 12, 4, 1),
            Block.createCuboidShape(4.000000000000003, 0, 4, 5.000000000000003, 4, 5.5),
            Block.createCuboidShape(4.000000000000003, 0, 0.5, 5.000000000000003, 4, 1),
            Block.createCuboidShape(4.000000000000003, -0.5, 1, 5.000000000000003, 0, 5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(12.556517391304347, 10, 7.165218260869562, 13.256517391304346, 11, 9.165218260869562),
            Block.createCuboidShape(13.156517391304348, 12, 4.165218260869562, 16.25651739130435, 13, 12.365218260869561),
            Block.createCuboidShape(12.756517391304346, 11, 4.165218260869562, 13.256517391304346, 13, 12.365218260869561),
            Block.createCuboidShape(13.256517391304346, 3, 4.265218260869563, 16.25651739130435, 12, 12.265218260869563),
            Block.createCuboidShape(14.25651739130435, 7, 13.765218260869563, 15.25651739130435, 8, 14.265218260869563),
            Block.createCuboidShape(13.256517391304346, 9, 12.265218260869563, 16.25651739130435, 9.5, 14.265218260869563),
            Block.createCuboidShape(13.256517391304346, 8, 13.765218260869563, 16.25651739130435, 9, 14.265218260869563),
            Block.createCuboidShape(13.256517391304346, 4, 12.265218260869563, 16.25651739130435, 9, 13.765218260869563),
            Block.createCuboidShape(14.25651739130435, 7, 2.2652182608695632, 15.25651739130435, 8, 2.9652182608695625),
            Block.createCuboidShape(13.256517391304346, 9, 2.2652182608695632, 16.25651739130435, 9.5, 4.265218260869563),
            Block.createCuboidShape(13.256517391304346, 8, 2.2652182608695632, 16.25651739130435, 9, 2.7652182608695632),
            Block.createCuboidShape(13.256517391304346, 4, 2.7652182608695632, 16.25651739130435, 9, 4.265218260869563),
            Block.createCuboidShape(11.756517391304346, 3, 5.265218260869563, 13.256517391304346, 8, 11.265218260869563),
            Block.createCuboidShape(11.056517391304347, 6, 7.165218260869562, 11.756517391304346, 7, 9.165218260869562),
            Block.createCuboidShape(11.256517391304346, 8, 5.265218260869563, 13.256517391304346, 8.5, 11.265218260869563),
            Block.createCuboidShape(11.256517391304346, 7, 5.265218260869563, 11.756517391304346, 8, 11.265218260869563),
            Block.createCuboidShape(12.256517391304346, 0, 2.2652182608695632, 16.25651739130435, 3, 14.265218260869563),
            Block.createCuboidShape(11.756517391304346, 0, 11.265218260869563, 13.256517391304346, 4, 12.265218260869563),
            Block.createCuboidShape(12.256517391304346, -0.5, 11.265218260869563, 16.25651739130435, 0, 12.265218260869563),
            Block.createCuboidShape(16.25651739130435, 0, 11.265218260869563, 16.75651739130435, 4, 12.265218260869563),
            Block.createCuboidShape(11.756517391304346, 0, 4.265218260869563, 13.256517391304346, 4, 5.265218260869563),
            Block.createCuboidShape(16.25651739130435, 0, 4.265218260869563, 16.75651739130435, 4, 5.265218260869563),
            Block.createCuboidShape(12.256517391304346, -0.5, 4.265218260869563, 16.25651739130435, 0, 5.265218260869563)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public BackpackBaseBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
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

