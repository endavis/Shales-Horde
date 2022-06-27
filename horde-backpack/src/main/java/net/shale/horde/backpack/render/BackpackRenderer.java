package net.shale.horde.backpack.render;

import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;

public class BackpackRenderer extends TrinketItem {
    public BackpackRenderer(Settings settings) {
        super(settings);
    }

    //Trinket Render
    public static void registerTrinketRenderer(BackpackRenderer backpack) {
        TrinketRendererRegistry.registerRenderer(backpack, new Renderer());
    }

}