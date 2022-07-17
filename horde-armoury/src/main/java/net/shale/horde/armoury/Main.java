package net.shale.horde.armoury;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.shale.horde.armoury.items.shields;

public class Main implements ModInitializer {
    public static final String ID = "horde-armoury";

    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }

    @Override
    public void onInitialize() {
        shields.registerModItems();

    }
}