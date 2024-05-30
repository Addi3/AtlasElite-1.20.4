package net.addie.atlaselite;

import net.addie.atlaselite.block.ModBlocks;
import net.addie.atlaselite.item.ModItemGroups;
import net.addie.atlaselite.item.ModItems;
import net.addie.atlaselite.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AtlasElite implements ModInitializer {
	public  static  final String MOD_ID = "atlaselite";
    public static final Logger LOGGER = LoggerFactory.getLogger("atlaselite");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Successfuly loaded!");

		ModWorldGeneration.generateModWorldGen();
	}
}