package net.shale.horde.garden;

import net.minecraft.util.Identifier;

public class Main {
    public static final String ID = "horde-garden";

    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }
}