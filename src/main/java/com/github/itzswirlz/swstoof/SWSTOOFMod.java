package com.github.itzswirlz.swstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class SWSTOOFMod implements ModInitializer {
	@Override
	public void onInitialize(ModContainer mod) {
		SWSTOOFParticles.registerFireParticles(mod);

		SWSTOOFBlocks.registerCopperFireBlocks(mod);
		SWSTOOFItems.registerCopperBlockItems(mod);

		SWSTOOFBlocks.registerIronFireBlocks(mod);
		SWSTOOFItems.registerIronBlockItems(mod);

		SWSTOOFBlocks.registerRedstoneFireBlocks(mod);

		SWSTOOFItemGroup.registerswstoofItemGroup(mod);

		SWSTOOFBlocks.updateCampfireBlockEntityType();
	}
}
