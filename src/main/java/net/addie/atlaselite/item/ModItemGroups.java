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
                        entries.add(ModItems.RAW_ADDIUM);
                        entries.add(ModBlocks.ADDIUM_BLOCK);
                        entries.add(ModBlocks.ADDIUM_ORE);


                    }).build());






}
