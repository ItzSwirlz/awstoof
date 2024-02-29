package com.github.itzswirlz.awstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.render.RenderLayer;

public class AWSTOOFModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(ModContainer mod) {
        ParticleFactoryRegistry.getInstance().register(AWSTOOFParticles.COPPER_FIRE_FLAME, FlameParticle.Factory::new);

        BlockRenderLayerMap.put(RenderLayer.getCutout(), AWSTOOFBlocks.COPPER_FIRE);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), AWSTOOFBlocks.COPPER_LANTERN);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), AWSTOOFBlocks.COPPER_TORCH);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), AWSTOOFBlocks.COPPER_WALL_TORCH);

        BlockRenderLayerMap.put(RenderLayer.getCutout(), AWSTOOFBlocks.REDSTONE_FIRE);
    }
    
}
