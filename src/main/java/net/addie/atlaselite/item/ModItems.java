package net.addie.atlaselite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.addie.atlaselite.AtlasElite;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ADDIUM_INGOT = registerItem("addium_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ADDIUM = registerItem("raw_addium", new Item(new FabricItemSettings()));
    public static final Item ADDIUM_PICKAXE = registerItem("addium_pickaxe", new PickaxeItem(ModToolMaterial.ADDIUM_INGOT,
            2, 2f, new FabricItemSettings()));
    public static final Item ADDIUM_AXE = registerItem("addium_axe", new AxeItem(ModToolMaterial.ADDIUM_INGOT,
            2, 2f, new FabricItemSettings()));
    public static final Item ADDIUM_SWORD = registerItem("addium_sword", new SwordItem(ModToolMaterial.ADDIUM_INGOT,
            5, 1.5f, new FabricItemSettings()));
    public static final Item ADDIUM_SHOVEL = registerItem("addium_shovel", new ShovelItem(ModToolMaterial.ADDIUM_INGOT,
            2, 2f, new FabricItemSettings()));
    public static final Item ADDIUM_HOE = registerItem("addium_hoe", new HoeItem(ModToolMaterial.ADDIUM_INGOT,
            2, 2f, new FabricItemSettings()));

    public static final Item ADDIUM_INGOT_HELMET = registerItem("addium_ingot_helmet", new ArmorItem(ModArmorMaterials.ADDIUM_INGOT,
              ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ADDIUM_INGOT_CHESTPLATE = registerItem("addium_ingot_chestplate", new ArmorItem(ModArmorMaterials.ADDIUM_INGOT,
              ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ADDIUM_INGOT_LEGGINGS = registerItem("addium_ingot_leggings", new ArmorItem(ModArmorMaterials.ADDIUM_INGOT,
              ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ADDIUM_INGOT_BOOTS = registerItem("addium_ingot_boots", new ArmorItem(ModArmorMaterials.ADDIUM_INGOT,
              ArmorItem.Type.BOOTS, new FabricItemSettings()));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AtlasElite.MOD_ID, name), item);

    }
    public static void registerModItems() {
        AtlasElite.LOGGER.info("Registering Items Groups for " + AtlasElite.MOD_ID);
    }
}