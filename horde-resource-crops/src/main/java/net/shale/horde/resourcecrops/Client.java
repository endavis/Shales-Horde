package net.shale.horde.resourcecrops;

import net.fabricmc.api.ClientModInitializer;
import net.shale.horde.resourcecrops.util.crop_renderer;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        crop_renderer.setRenderLayers();
    }
}
