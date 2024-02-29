package com.github.itzswirlz.awstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.base.api.event.Event;
import org.quiltmc.qsl.base.impl.event.EventRegistry;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;
import org.quiltmc.qsl.registry.api.event.RegistryEvents;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.particle.ParticleFactory.Sprite;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.SpriteAtlasHolder;
import net.minecraft.client.texture.SpriteAtlasManager;
import net.minecraft.screen.PlayerScreenHandler;

public class AWSTOOFModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(ModContainer mod) {
        ParticleFactoryRegistry.getInstance().register(AWSTOOFParticles.COPPER_FIRE_FLAME, FlameParticle.Factory::new);

        BlockRenderLayerMap.put(RenderLayer.getCutout(), AWSTOOFBlocks.COPPER_FIRE);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), AWSTOOFBlocks.COPPER_TORCH);
        BlockRenderLayerMap.put(RenderLayer.getCutout(), AWSTOOFBlocks.COPPER_WALL_TORCH);

        BlockRenderLayerMap.put(RenderLayer.getCutout(), AWSTOOFBlocks.REDSTONE_FIRE);
    }
    
}
