package net.shale.horde.resource.crops;

import net.fabricmc.api.ClientModInitializer;
import net.shale.horde.resource.crops.util.crop_renderer;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        crop_renderer.setRenderLayers();
    }
}
