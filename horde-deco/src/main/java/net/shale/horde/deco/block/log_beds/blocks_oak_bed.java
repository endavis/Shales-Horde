package net.shale.horde.deco.block.log_beds;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.deco.Main;
import net.shale.horde.deco.block.custom.BedPart;

public class blocks_oak_bed {
//    public static final Block BLACK_OAK = registerBlock("log_bed/oak/black",
//            new BedPart()
    public static final Block BLUE_OAK = registerBlock("log_bed/oak/blue",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block BROWN_OAK = registerBlock("log_bed/oak/brown",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block CYAN_OAK = registerBlock("log_bed/oak/cyan",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block GRAY_OAK = registerBlock("log_bed/oak/gray",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block GREEN_OAK = registerBlock("log_bed/oak/green",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block LIGHT_BLUE_OAK = registerBlock("log_bed/oak/light_blue",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block LIGHT_GRAY_OAK = registerBlock("log_bed/oak/light_gray",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block LIME_OAK = registerBlock("log_bed/oak/lime",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block MAGENTA_OAK = registerBlock("log_bed/oak/magenta",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block ORANGE_OAK = registerBlock("log_bed/oak/orange",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block PINK_OAK = registerBlock("log_bed/oak/pink",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block PURPLE_OAK = registerBlock("log_bed/oak/purple",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block RED_OAK = registerBlock("log_bed/oak/red",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block WHITE_OAK = registerBlock("log_bed/oak/white",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));
    public static final Block YELLOW_OAK = registerBlock("log_bed/oak/yellow",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)
                    .requiresTool()
            ));


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), new BlockItem(block,
                new FabricItemSettings().group(ItemGroup.MISC)));

    }

    public static void registerBlock() {

    }
}
