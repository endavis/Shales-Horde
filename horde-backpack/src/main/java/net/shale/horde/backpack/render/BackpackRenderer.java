package net.shale.horde.backpack.render;

import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;

public class BackpackRenderer extends TrinketItem {
    public BackpackRenderer(Settings settings) {
        super(settings.maxCount(1));
    }

    //Trinket Render
    public static void registerTrinketRenderer(BackpackRenderer backpack) {
        TrinketRendererRegistry.registerRenderer(backpack, new Renderer());
    }

}