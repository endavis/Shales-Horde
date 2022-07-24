package net.shale.horde.resource.crops.entities;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.entities;

public class EntityRegister {
    public static BlockEntityType<recycler_entity> SEED_RECYCLER;

    public static void registerAllEntities() {
        SEED_RECYCLER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Main.ID, "recycler"),
                FabricBlockEntityTypeBuilder.create(recycler_entity::new,
                        entities.RECYCLER).build(null));
    }
}
