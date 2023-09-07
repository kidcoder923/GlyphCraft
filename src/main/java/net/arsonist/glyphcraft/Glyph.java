package net.arsonist.glyphcraft;

import net.arsonist.glyphcraft.block.ModBlocks;
import net.arsonist.glyphcraft.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Glyph implements ModInitializer {
	public static final String MOD_ID = "glyphcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

	}
}
