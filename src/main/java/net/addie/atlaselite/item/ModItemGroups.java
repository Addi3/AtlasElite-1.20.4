package net.addie.atlaselite.item;

import com.ibm.icu.text.DisplayContext;
import net.addie.atlaselite.AtlasElite;
import net.addie.atlaselite.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static void registerItemGroups() {
        AtlasElite.LOGGER.info("Registering Item Groups for " + AtlasElite.MOD_ID);
    }
    public static final ItemGroup ADDIUM_INGOT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AtlasElite.MOD_ID, "addium_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.addium_ingot"))
                    .icon(() -> new ItemStack(ModItems.ADDIUM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ADDIUM_INGOT);
                        entries.add(ModItems.SHATTERED_ADDIUM_INGOT);
                        entries.add(ModItems.RAW_ADDIUM);
                        entries.add(ModBlocks.ADDIUM_BLOCK);
                        entries.add(ModBlocks.WEAK_ADDIUM_BLOCK);
                        entries.add(ModBlocks.PLATED_ADDIUM);
                        entries.add(ModBlocks.ADDIUM_ORE);
                        entries.add(ModBlocks.RAW_ADDIUM_BLOCK);
                        entries.add(ModBlocks.ADDIUM_STAINED_GLASS);
                        entries.add(ModBlocks.ADDIUM_WALL);
                        entries.add(ModBlocks.ADDIUM_STAIRS);
                        entries.add(ModBlocks.ADDIUM_SLAB);
                        entries.add(ModBlocks.WEAK_ADDIUM_WALL);
                        entries.add(ModBlocks.WEAK_ADDIUM_STAIRS);
                        entries.add(ModBlocks.WEAK_ADDIUM_SLAB);
                        entries.add(ModItems.ADDIUM_AXE);
                        entries.add(ModItems.ADDIUM_HOE);
                        entries.add(ModItems.ADDIUM_SWORD);
                        entries.add(ModItems.ADDIUM_SHOVEL);
                        entries.add(ModItems.ADDIUM_PICKAXE);
                        entries.add(ModItems.ADDIUM_INGOT_HELMET);
                        entries.add(ModItems.ADDIUM_INGOT_CHESTPLATE);
                        entries.add(ModItems.ADDIUM_INGOT_LEGGINGS);
                        entries.add(ModItems.ADDIUM_INGOT_BOOTS);
                        entries.add(ModItems.ADDIUM_SILK);


                    }).build());






}
