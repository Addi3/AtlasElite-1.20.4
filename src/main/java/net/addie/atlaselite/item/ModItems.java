package net.addie.atlaselite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.addie.atlaselite.AtlasElite;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ADDIUM_INGOT = registerItem("addium_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ADDIUM = registerItem("raw_addium", new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AtlasElite.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AtlasElite.LOGGER.info("Registering Items Groups for " + AtlasElite.MOD_ID);
    }
}