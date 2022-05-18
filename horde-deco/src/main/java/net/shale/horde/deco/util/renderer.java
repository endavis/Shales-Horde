package net.shale.horde.deco.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.shale.horde.deco.block.blocks_pride;

public class renderer {
    public static void setRenderLayers() {
        //Flags
        BlockRenderLayerMap.INSTANCE.putBlock(blocks_pride.FLAG_PANSEXUAL, RenderLayer.getCutout());
        //Side-stairs
    }
}
