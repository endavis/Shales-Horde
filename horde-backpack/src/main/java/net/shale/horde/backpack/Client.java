package net.shale.horde.backpack;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.shale.horde.backpack.registry.HordeScreenHandlerRegistry;
import net.shale.horde.backpack.screen.BackpackScreen;
import net.shale.horde.backpack.screen.TestBlockScreen;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(HordeScreenHandlerRegistry.TESTBLOCK_SCREEN_HANDLER, TestBlockScreen::new);
        ScreenRegistry.register(HordeScreenHandlerRegistry.BACKPACK_SCREEN_HANDLER, BackpackScreen::new);
    }
}
