package net.linkle.cavers;

import net.fabricmc.api.ModInitializer;
import net.linkle.cavers.init.Contents;
import net.linkle.cavers.init.ModBlocks;
import net.linkle.cavers.init.ModItems;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String ID = "cavers";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	@Override
	public void onInitialize() {
	    ModBlocks.initialize();
	    ModItems.initialize();
	    Contents.initialize();
	}
	
	public static Identifier makeId(String id) {
	    return new Identifier(ID, id);
	}
}
