package net.shale.horde.resource.crops.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.shale.horde.resource.crops.Main;

public class ScreenHandlerRegister {
    public static ScreenHandlerType<recycler_screenhandler> RECYCLER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Main.ID, "recycler"),
                    recycler_screenhandler::new);
}
