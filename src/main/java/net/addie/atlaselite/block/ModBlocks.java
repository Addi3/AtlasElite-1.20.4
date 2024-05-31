package net.addie.atlaselite.block;

import net.addie.atlaselite.AtlasElite;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block ADDIUM_BLOCK = registerBlock("addium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    public static final Block ADDIUM_ORE = registerBlock("addium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block RAW_ADDIUM_BLOCK = registerBlock("raw_addium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK)));

    public static final Block ADDIUM_STAIRS = registerBlock("addium_stairs",
            new StairsBlock(ModBlocks.ADDIUM_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    public static final Block ADDIUM_SLAB = registerBlock("addium_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    public static final Block ADDIUM_WALL = registerBlock("addium_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AtlasElite.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AtlasElite.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        AtlasElite.LOGGER.info("Registering ModBlocks for " + AtlasElite.MOD_ID);

    }

}
