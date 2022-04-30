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
        public static final TagKey<Item> T0_SEEDS =
                createTag("t0_seeds");
        public static final TagKey<Item> T1_SEEDS =
                createTag("t1_seeds");
        public static final TagKey<Item> T2_SEEDS =
                createTag("t2_seeds");
        public static final TagKey<Item> T3_SEEDS =
                createTag("t3_seeds");
        public static final TagKey<Item> T4_SEEDS =
                createTag("t4_seeds");
        public static final TagKey<Item> T5_SEEDS =
                createTag("t5_seeds");
        public static final TagKey<Item> T6_SEEDS =
                createTag("t6_seeds");
        public static final TagKey<Item> GEMSTONES =
                createTag("gemstones");
        public static final TagKey<Item> DRAGONSTONE =
                createTag("dragonstone");
        public static final TagKey<Item> DRAGONSTONE_RAW =
                createTag("dragonstone_raw");
        public static final TagKey<Item> DRAGONSTONE_GEM =
                createTag("dragonstone_gems");
        public static final TagKey<Item> DRAGONSTONE_ORE =
                createTag("dragonstone_ore");
        public static final TagKey<Item> CORAL =
                createCommonTag("coral");
        public static final TagKey<Item> HONEY =
                createCommonTag("honey");
        public static final TagKey<Item> PRISMARINE =
                createCommonTag("prismarine");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Main.ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
