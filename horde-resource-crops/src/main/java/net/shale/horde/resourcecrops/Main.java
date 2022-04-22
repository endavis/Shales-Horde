package net.shale.horde.resourcecrops;

import net.minecraft.util.Identifier;

public class Main {
    public static final String ID = "horde-resource-crops";

    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }
}