package lolinder.subterrain.common.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
	public static Block stoneWorkbench;
	public static Block blockLightstone;
	public static Block blockDimstone;
	public static Block blockDarkstone;
	
	// Prevent instantiation
	private ModBlocks() {}
	
	public static void init() {
		
		// Initialize blocks
		bitumenFlowing = new BlockBitumenFlowing(431, Material.water).setBlockName("subBitumenFlowing");
		bitumenStill = new BlockBitumenStationary(432, Material.water).setBlockName("subBitumenStill");
		lantern = new BlockLantern(430, 0).setBlockName("subLantern").setLightValue(0.9375F);
		boneTorch = new BlockBoneTorch(434, 1).setBlockName("subBoneTorch").setLightValue(0.9375F);
		oreBitumen = new BlockOreBitumen(435, 2, Material.rock).setBlockName("subOreBitumen");
		stoneWorkbench = new BlockStoneWorkbench(436).setBlockName("subStoneWorkbench");
		blockLightstone = new BlockMod(440, 8, Material.rock).setBlockName("subBlockLightstone").setLightValue(1.0F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
		blockDimstone = new BlockMod(441, 9, Material.rock).setBlockName("subBlockDimstone").setLightValue(0.5F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
		blockDarkstone = new BlockMod(442, 10, Material.rock).setBlockName("subBlockDarkstone").setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);

		// Register blocks
		GameRegistry.registerBlock(lantern);
		GameRegistry.registerBlock(boneTorch);
		GameRegistry.registerBlock(bitumenFlowing);
		GameRegistry.registerBlock(bitumenStill);
		GameRegistry.registerBlock(oreBitumen);
		GameRegistry.registerBlock(stoneWorkbench);
		GameRegistry.registerBlock(blockLightstone);
		GameRegistry.registerBlock(blockDimstone);
		GameRegistry.registerBlock(blockDarkstone);
		
		MinecraftForge.setBlockHarvestLevel(oreBitumen, "pickaxe", 0);
		
		initRecipes();
		
		// Register names
		LanguageRegistry.addName(lantern, "Lantern");
		LanguageRegistry.addName(boneTorch, "Bone Torch");
		LanguageRegistry.addName(oreBitumen, "Bitumen Ore");
		LanguageRegistry.addName(stoneWorkbench, "Crafting Table");
		LanguageRegistry.addName(blockLightstone, "Lightstone");
		LanguageRegistry.addName(blockDimstone, "Dimstone");
		LanguageRegistry.addName(blockDarkstone, "Darkstone");
		
	}
	
	private static void initRecipes() {
		GameRegistry.addRecipe(new ItemStack(stoneWorkbench), "xx", "xx", 'x', new ItemStack(Block.cobblestone));
	}

}
