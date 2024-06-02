package net.addie.atlaselite;

import net.addie.atlaselite.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class AtlasEliteClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ADDIUM_STAINED_GLASS, RenderLayer.getTranslucent());
    }
}
