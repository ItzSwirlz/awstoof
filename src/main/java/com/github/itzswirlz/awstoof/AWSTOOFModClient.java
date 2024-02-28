package com.github.itzswirlz.awstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

import net.minecraft.client.render.RenderLayer;

public class AWSTOOFModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(ModContainer mod) {
        BlockRenderLayerMap.put(RenderLayer.getCutout(), CopperFireBlocks.COPPER_FIRE);
    }
    
}
