package net.shale.horde.backpack.registry;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.screen.BackpackScreenHandler;
import net.shale.horde.backpack.screen.TestBlockScreenHandler;


public class HordeScreenHandlerRegistry {
    public static ScreenHandlerType<TestBlockScreenHandler> TESTBLOCK_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Main.ID, "testblock"),
                    TestBlockScreenHandler::new);
    public static ScreenHandlerType<BackpackScreenHandler> BACKPACK_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Main.ID, "backpack"),
                    BackpackScreenHandler::new);
}
