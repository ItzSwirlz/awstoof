package com.github.itzswirlz.swstoof;

import net.fabricmc.api.ModInitializer;

public class SWSTOOFMod implements ModInitializer {
	public static final String MOD_ID = "sowesettheoreonfire";

	@Override
	public void onInitialize() {
		SWSTOOFParticles.registerFireParticles();

		SWSTOOFBlocks.registerCopperFireBlocks();
		SWSTOOFItems.registerCopperBlockItems();

		SWSTOOFBlocks.registerIronFireBlocks();
		SWSTOOFItems.registerIronBlockItems();

		SWSTOOFBlocks.registerRedstoneFireBlocks();
		SWSTOOFItems.registerRedstoneBlockItems();

		SWSTOOFItemGroup.registerswstoofItemGroup();

		SWSTOOFBlocks.updateCampfireBlockEntityType();
	}
}
