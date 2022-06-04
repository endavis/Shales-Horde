package net.shale.horde.backpack;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.shale.horde.backpack.api.KeybindEntrypoint;

@Environment(EnvType.CLIENT)
public class BackpackClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeybindEntrypoint.onInitializeClient();
    }
}
