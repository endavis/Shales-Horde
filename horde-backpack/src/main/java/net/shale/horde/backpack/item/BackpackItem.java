package net.shale.horde.backpack.item;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.client.TrinketRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.shale.horde.backpack.Backpack;
import net.shale.horde.backpack.api.OpenableBlockEntityProviderCustom;
import net.shale.horde.backpack.entity.BackpackEntity;
import net.minecraft.client.util.math.MatrixStack;

//public class Backpack extends Item implements OpenableBlockEntityProviderCustom {
public class BackpackItem extends TrinketItem implements OpenableBlockEntityProviderCustom {
    private final int inventorySize;

    public BackpackItem(Settings settings, int inventorySize) {
        super(settings);
        this.inventorySize = inventorySize;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        this.OpenCustomBackpack(world, user, hand);
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        this.OpenCustomBackpack(player.world, player, context.getHand());
        return ActionResult.SUCCESS;
    }


    public ActionResult OpenCustomBackpack(World world, PlayerEntity player, Hand hand) {
        return this.ncl_onBlockUse(world, player.getBlockStateAtPos(), player.getBlockPos(), player, hand, null, new BackpackEntity(this.inventorySize, player.getStackInHand(hand)));
    }

    public ActionResult OpenCustomBackpack(PlayerEntity player, ItemStack stack) {
        return this.ncl_onBlockUse(player.getWorld(), player.getBlockStateAtPos(), player.getBlockPos(), player, player.getActiveHand(), null, new BackpackEntity(this.inventorySize, stack));
    }

//    @Override
//    public void render(ItemStack stack, SlotReference slotReference, EntityModel<? extends LivingEntity> contextModel, MatrixStack matrixStack, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
//        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
//        TrinketRenderer.translateToChest(matrixStack,"horde-backpack:leather_backpack", );
//        matrixStack.scale(-1f,-1f,1f);
//        matrixStack.translate(0,0.7,0.3f);
//        itemRenderer.renderItem(stack, ModelTransformation.Mode.FIXED,light, OverlayTexture.DEFAULT_UV,matrixStack,vertexConsumers,0);
//    }
}
