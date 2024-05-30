package net.addie.atlaselite.datagen;

import net.addie.atlaselite.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
    getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
        .add(ModItems.ADDIUM_INGOT_HELMET, ModItems.ADDIUM_INGOT_CHESTPLATE, ModItems.ADDIUM_INGOT_LEGGINGS,ModItems.ADDIUM_INGOT_BOOTS);;
    }
}
