package net.shale.horde.backpack;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.shale.horde.backpack.api.KeybindEntrypoint;
import net.shale.horde.backpack.block.blocks_bag;

@Environment(EnvType.CLIENT)
public class BackpackClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(blocks_bag.BACKPACK_BASE, RenderLayer.getCutout());
        KeybindEntrypoint.onInitializeClient();
    }
}
