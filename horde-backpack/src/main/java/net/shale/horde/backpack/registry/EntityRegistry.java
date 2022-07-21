package net.shale.horde.backpack.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;
import net.shale.horde.backpack.block.Blocks;
import net.shale.horde.backpack.block.TestBlockEntity;

public class EntityRegistry {
    public static BlockEntityType<TestBlockEntity> TESTBLOCKENTITY;

    public static void registerAllEntities() {
        TESTBLOCKENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Main.ID, "testblock"),
                FabricBlockEntityTypeBuilder.create(TestBlockEntity::new,
                        Blocks.TEST).build(null));
    }
}
