package net.shale.horde.resource.crops.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.ores.blocks_ores;
import net.shale.horde.resource.crops.item.other.gemstones;
import net.shale.horde.resource.crops.item.vanilla.T2__essence;
import net.shale.horde.resource.crops.item.vanilla.T2__seeds;

public class item_group {
    public static final ItemGroup ORES = FabricItemGroupBuilder.build(new Identifier(Main.ID, "ore"),
            () -> new ItemStack(blocks_ores.DRAGONSTONE_DEEPSLATE_ORE));
    public static final ItemGroup ESSENCE = FabricItemGroupBuilder.build(new Identifier(Main.ID, "essence"),
            () -> new ItemStack(T2__essence.ESSENCE_AMETHYST));
}
