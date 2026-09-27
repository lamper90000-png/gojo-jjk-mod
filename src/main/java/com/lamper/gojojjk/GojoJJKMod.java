package com.lamper.gojojjk;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GojoJJKMod implements ModInitializer {
	public static final String MOD_ID = "gojo-jjk-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Gojo JJK Mod initialized!");
		
		// Initialize moves, items, and other mod content here
		GojoAbilities.register();
	}
}
