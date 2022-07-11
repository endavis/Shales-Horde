package net.shale.horde.extras;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.shale.horde.extras.util.modified_loot_tables;

public class Main implements ModInitializer {
    public static final String ID = "horde-extras";

    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }

    @Override
    public void onInitialize() {
        modified_loot_tables.modifyLootTables();
    }
}