package lolinder.subterrain.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

/**
 * ModBlocks
 * 
 * The main class that creates all the blocks.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ModBlocks {
	
	// Add blocks
	public static Block bitumenFlowing;
	public static Block bitumenStill;
	public static Block lantern;
	public static Block boneTorch;

	// Prevent instantiation
	private ModBlocks() {}
	
	public static void init() {
		
		// Initialize blocks
		bitumenFlowing = new BlockBitumenFlowing(431, Material.water);
		bitumenStill = new BlockBitumenStationary(432, Material.water);
		lantern = new BlockLantern(430, 0).setBlockName("subLantern").setLightValue(0.9375F);
		boneTorch = new BlockBoneTorch(434, 1).setBlockName("subBoneTorch").setLightValue(0.9375F);
		
		// Register blocks
		GameRegistry.registerBlock(lantern);
		GameRegistry.registerBlock(boneTorch);
		GameRegistry.registerBlock(bitumenFlowing);
		GameRegistry.registerBlock(bitumenStill);
		
		initRecipes();
		
		// Register names
		LanguageRegistry.addName(lantern, "Lantern");
		LanguageRegistry.addName(boneTorch, "Bone Torch");
		
	}
	
	private static void initRecipes() {
		// To come later
	}

}
