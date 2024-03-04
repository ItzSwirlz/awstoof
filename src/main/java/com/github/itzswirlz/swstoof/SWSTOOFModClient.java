package com.github.itzswirlz.swstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.render.RenderLayer;

public class SWSTOOFModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(ModContainer mod) {
        ParticleFactoryRegistry.getInstance().register(SWSTOOFParticles.COPPER_FIRE_FLAME, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SWSTOOFParticles.IRON_FIRE_FLAME, FlameParticle.Factory::new);

        BlockRenderLayerMap.put(RenderLayer.getCutout(), SWSTOOFBlocks.COPPER_CAMPFIRE);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), SWSTOOFBlocks.COPPER_FIRE);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), SWSTOOFBlocks.COPPER_LANTERN);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), SWSTOOFBlocks.COPPER_TORCH);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), SWSTOOFBlocks.COPPER_WALL_TORCH);

        BlockRenderLayerMap.put(RenderLayer.getCutout(), SWSTOOFBlocks.IRON_CAMPFIRE);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), SWSTOOFBlocks.IRON_FIRE);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), SWSTOOFBlocks.IRON_TORCH);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), SWSTOOFBlocks.IRON_WALL_TORCH);

        BlockRenderLayerMap.put(RenderLayer.getCutout(), SWSTOOFBlocks.REDSTONE_FIRE);
    }
    
}
