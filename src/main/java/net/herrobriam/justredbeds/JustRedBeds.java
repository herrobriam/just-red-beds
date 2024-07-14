package net.herrobriam.justredbeds;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustRedBeds implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("just-red-beds");

	@Override
	public void onInitialize() {

		LOGGER.info("Undoing the colour update...");
	}
}