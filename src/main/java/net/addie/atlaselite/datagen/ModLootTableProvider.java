package net.addie.atlaselite.datagen;

import net.addie.atlaselite.block.ModBlocks;
import net.addie.atlaselite.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ADDIUM_BLOCK);
        addDrop(ModBlocks.WEAK_ADDIUM_BLOCK);
        addDrop(ModBlocks.PLATED_ADDIUM);
        addDrop(ModBlocks.ADDIUM_STAINED_GLASS);
        addDrop(ModBlocks.RAW_ADDIUM_BLOCK);
        addDrop(ModBlocks.ADDIUM_WALL);
        addDrop(ModBlocks.WEAK_ADDIUM_WALL);
        addDrop(ModBlocks.ADDIUM_SLAB, slabDrops(ModBlocks.ADDIUM_SLAB));
        addDrop(ModBlocks.WEAK_ADDIUM_SLAB, slabDrops(ModBlocks.WEAK_ADDIUM_SLAB));
        addDrop(ModBlocks.ADDIUM_STAIRS);
        addDrop(ModBlocks.WEAK_ADDIUM_STAIRS);
        addDrop(ModBlocks.ADDIUM_ORE, copperLikeOreDrops(ModBlocks.ADDIUM_ORE, ModItems.RAW_ADDIUM));
    }


    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));

    }
}
