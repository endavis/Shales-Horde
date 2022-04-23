package net.shale.horde.resource.crops.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.shale.horde.resource.crops.block.vanilla.*;

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

        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_AMETHYST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_CHICKEN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_COAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_COPPER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_COW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_FISH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_IRON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T2__crops.CROP_PIG, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_CREEPER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_HONEY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_LAPIS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_RABBIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_SHEEP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_SKELETON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_SLIME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_SPIDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_SQUID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_TURTLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T3__crops.CROP_ZOMBIE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(T4__crops.CROP_DYE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T4__crops.CROP_EMERALD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T4__crops.CROP_ENDERMAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T4__crops.CROP_EXPERIENCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T4__crops.CROP_GOLD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T4__crops.CROP_NATURE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T4__crops.CROP_OBSIDIAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T4__crops.CROP_PRISMARINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T4__crops.CROP_REDSTONE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(T5__crops.CROP_BLAZE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T5__crops.CROP_DIAMOND, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T5__crops.CROP_END, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T5__crops.CROP_GHAST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T5__crops.CROP_GLOWSTONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T5__crops.CROP_NETHER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T5__crops.CROP_NETHER_QUARTZ, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T5__crops.CROP_WITHER_SKELETON, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(T6__crops.CROP_DRAGON_EGG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T6__crops.CROP_NETHER_STAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T6__crops.CROP_NETHERITE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(T6__crops.CROP_SHULKER, RenderLayer.getCutout());
    }
}
