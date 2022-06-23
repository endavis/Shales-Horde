package net.shale.horde.backpack.registery;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.backpack.Main;

public class TagRegistry {
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
            public static final TagKey<Item> BACKPACK_LEATHER =
                    createTag("backpack_leather");
            public static final TagKey<Item> BACKPACK_COPPER =
                    createTag("backpack_copper");
            public static final TagKey<Item> BACKPACK_IRON =
                    createTag("backpack_iron");
            public static final TagKey<Item> BACKPACK_GOLD =
                    createTag("backpack_gold");
            public static final TagKey<Item> BACKPACK_DIAMOND =
                    createTag("backpack_diamond");
            public static final TagKey<Item> BACKPACK_NETHERITE =
                    createTag("backpack_netherite");
            private static TagKey<Item> createTag(String name) {
                return TagKey.of(Registry.ITEM_KEY, new Identifier(Main.ID, name));
            }

            private static TagKey<Item> createCommonTag(String name) {
                return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
            }
        }
    }
}
