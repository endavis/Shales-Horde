package net.shale.horde.resource.crops.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;

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
        public static final TagKey<Item> CT0 =
                createTag("ct0");
        public static final TagKey<Item> DRAGONSTONE =
                createTag("dragonstone");
        public static final TagKey<Item> DRAGONSTONE_RAW =
                createTag("dragonstone_raw");
        public static final TagKey<Item> DRAGONSTONE_GEM =
                createTag("dragonstone_gems");
        public static final TagKey<Item> DRAGONSTONE_ORE =
                createTag("dragonstone_ore");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Main.ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
