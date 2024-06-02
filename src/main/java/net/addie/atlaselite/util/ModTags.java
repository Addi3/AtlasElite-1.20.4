package net.addie.atlaselite.util;

import net.addie.atlaselite.AtlasElite;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.injection.At;

public class ModTags {
    public static class Blocks{

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(AtlasElite.MOD_ID, name));
}

    }

    public static class Items{

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(AtlasElite.MOD_ID, name));

    }

}
}
