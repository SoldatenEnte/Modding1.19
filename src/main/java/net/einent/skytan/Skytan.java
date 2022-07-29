package net.einent.skytan;

import net.einent.skytan.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class Skytan implements ModInitializer {
	public static final String MOD_ID = "skytan";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		GeckoLib.initialize();
	}
}
