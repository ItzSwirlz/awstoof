package com.github.itzswirlz.awstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class AWSTOOFMod implements ModInitializer {

	@Override
	public void onInitialize(ModContainer mod) {
		AWSTOOFParticles.registerFireParticles(mod);

		AWSTOOFBlocks.registerCopperFireBlocks(mod);
		AWSTOOFItems.registerCopperBlockItems(mod);

		AWSTOOFBlocks.registerRedstoneFireBlocks(mod);
	}
}
