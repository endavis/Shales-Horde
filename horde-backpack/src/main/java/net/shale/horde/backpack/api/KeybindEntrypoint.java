package net.shale.horde.backpack.api;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.shale.horde.backpack.Backpack;
import org.lwjgl.glfw.GLFW;

import java.util.List;
import java.util.Optional;

public class KeybindEntrypoint {
    public static Identifier OPEN_BACKPACK = Backpack.id("open-backpack");
    private static KeyBinding keyBinding;

    public static void onInitializeClient() {
        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.horde-backpack.open",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_B,
                "catergory.horde-backpack.cat"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (keyBinding.wasPressed()) {
                ClientPlayNetworking.send(OPEN_BACKPACK, new PacketByteBuf(Unpooled.buffer()));
                // System.out.println("key pressed");
            }
        });
    }

    public static void onInitialize() {
        ServerPlayNetworking.registerGlobalReceiver(OPEN_BACKPACK, KeybindEntrypoint::receiveOpenBackpackPacket);
    }

    private static void receiveOpenBackpackPacket(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        Optional<TrinketComponent> component = TrinketsApi.getTrinketComponent(player);
        if (component.isPresent()) {
            List<Pair<SlotReference, ItemStack>> allEquipped = component.get().getAllEquipped();
            for (Pair<SlotReference, ItemStack> entry : allEquipped) {
                if (entry.getRight().getItem() instanceof net.shale.horde.backpack.item.Backpack) {
                    ItemStack BagItem = entry.getRight();
                    ((net.shale.horde.backpack.item.Backpack) BagItem.getItem()).OpenCustomBackpack(player, BagItem);
                    return;
                }
            }
        }
    }
}
