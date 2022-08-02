package net.linkle.cavers.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.linkle.cavers.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
class RenderLayers {

    public static void initialize() {
        // Only use cullout if the block's texture contains empty pixels.
        var cullout = RenderLayer.getCutout();

        // Only use translucent if the block's texture contains translucent pixels.
        var translucent = RenderLayer.getTranslucent();
        
        put(ModBlocks.CAVE_ROOTS, cullout);
        put(ModBlocks.GLOWSQUID_LANTERN, cullout);
    }
    
    private static void put(Block block, RenderLayer layer) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, layer);
    }
}
