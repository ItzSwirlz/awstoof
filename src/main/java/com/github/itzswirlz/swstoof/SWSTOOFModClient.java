package com.github.itzswirlz.swstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.render.RenderLayer;

public class SWSTOOFModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(ModContainer mod) {
        ParticleFactoryRegistry.getInstance().register(SWSTOOFParticles.COPPER_FIRE_FLAME, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(SWSTOOFParticles.IRON_FIRE_FLAME, FlameParticle.Factory::new);

        BlockRenderLayerMap.put(RenderLayer.getCutout(), new Block[]{
            SWSTOOFBlocks.COPPER_CAMPFIRE,
            SWSTOOFBlocks.COPPER_FIRE,
            SWSTOOFBlocks.COPPER_LANTERN,
            SWSTOOFBlocks.COPPER_TORCH,
            SWSTOOFBlocks.COPPER_WALL_TORCH,

            SWSTOOFBlocks.IRON_CAMPFIRE,
            SWSTOOFBlocks.IRON_FIRE,
            SWSTOOFBlocks.IRON_LANTERN,
            SWSTOOFBlocks.IRON_TORCH,
            SWSTOOFBlocks.IRON_WALL_TORCH,

            SWSTOOFBlocks.REDSTONE_FIRE,
            SWSTOOFBlocks.REDSTONE_LANTERN
        });
    }
    
}
