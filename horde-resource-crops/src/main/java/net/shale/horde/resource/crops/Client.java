package net.shale.horde.resource.crops;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.shale.horde.resource.crops.screen.ScreenHandlerRegister;
import net.shale.horde.resource.crops.screen.recycler_screen;
import net.shale.horde.resource.crops.util.crop_renderer;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        crop_renderer.setRenderLayers();
        ScreenRegistry.register(ScreenHandlerRegister.RECYCLER_SCREEN_HANDLER, recycler_screen::new);
    }
}
