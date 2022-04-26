package net.shale.horde.resource.crops.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.shale.horde.resource.crops.block.vanilla.T0__crops;
import net.shale.horde.resource.crops.block.vanilla.T1__crops;
import net.shale.horde.resource.crops.block.vanilla.T2__crops;

public class crop_renderer {
    public static void setRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(T0__crops.CROP_RHODONITE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T0__crops.CROP_AIR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T0__crops.CROP_EARTH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T0__crops.CROP_FIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T0__crops.CROP_WATER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T1__crops.CROP_DIRT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T1__crops.CROP_ICE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T1__crops.CROP_STONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T1__crops.CROP_WOOD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T1__crops.CROP_WOOD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_AMETHYST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_CHICKEN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_COAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_COPPER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_COW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_FISH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_IRON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_PIG, RenderLayer.getCutout());
    }
}
