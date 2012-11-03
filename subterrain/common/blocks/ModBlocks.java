package lolinder.subterrain.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraftforge.common.MinecraftForge;

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
	public static Block oreBitumen;

	// Prevent instantiation
	private ModBlocks() {}
	
	public static void init() {
		
		// Initialize blocks
		bitumenFlowing = new BlockBitumenFlowing(431, Material.water).setBlockName("subBitumenFlowing");
		bitumenStill = new BlockBitumenStationary(432, Material.water).setBlockName("subBitumenStill");
		lantern = new BlockLantern(430, 0).setBlockName("subLantern").setLightValue(0.9375F);
		boneTorch = new BlockBoneTorch(434, 1).setBlockName("subBoneTorch").setLightValue(0.9375F);
		oreBitumen = new BlockOreBitumen(435, 2, Material.rock).setBlockName("subOreBitumen");
		
		// Register blocks
		GameRegistry.registerBlock(lantern);
		GameRegistry.registerBlock(boneTorch);
		GameRegistry.registerBlock(bitumenFlowing);
		GameRegistry.registerBlock(bitumenStill);
		GameRegistry.registerBlock(oreBitumen);
		
		MinecraftForge.setBlockHarvestLevel(oreBitumen, "pickaxe", 0);
		
		initRecipes();
		
		// Register names
		LanguageRegistry.addName(lantern, "Lantern");
		LanguageRegistry.addName(boneTorch, "Bone Torch");
		LanguageRegistry.addName(oreBitumen, "Bitumen Ore");
		
	}
	
	private static void initRecipes() {
		// To come later
	}

}
