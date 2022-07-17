package net.shale.horde.armoury.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.armoury.Main;

public class tags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Main.ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }

    }

    public static class Items {
        public static final TagKey<Item> STAINED_GLASS_PANES =
                createCommonTag("stained_glass_panes");
        public static final TagKey<Item> STAINED_GLASS_BLOCKS =
                createCommonTag("stained_glass_blocks");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Main.ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
