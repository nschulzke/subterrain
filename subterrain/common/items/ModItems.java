package lolinder.subterrain.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.EnumHelper;

/**
 * ModItems
 * 
 * The main class that creates all the items.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ModItems {
	
	// Add materials
	public static final EnumToolMaterial toolFLINT = EnumHelper.addToolMaterial("oneFLINT", 1, 15, 1.0F, 0, 0);
	public static final EnumToolMaterial toolSTONEBONE = EnumHelper.addToolMaterial("subSTONEBONE", 1, 262, 4.0F, 1, 7);
	public static final EnumToolMaterial toolIRONBONE = EnumHelper.addToolMaterial("subIRONBONE", 2, 524, 6.0F, 2, 16);
	public static final EnumToolMaterial toolGOLDBONE = EnumHelper.addToolMaterial("subGOLDBONE", 0, 48, 12.0F, 0, 24);
	public static final EnumToolMaterial toolDIAMONDBONE = EnumHelper.addToolMaterial("subDIAMONDBONE", 3, 2047, 8.0F, 3, 12);
	
	// Add material items
	public static Item boneShard;
	public static Item chunkBitumen;
	
	// Add pickaxes
	public static Item flintTool;
	public static Item stoneBonePick;
	public static Item ironBonePick;
	public static Item goldBonePick;
	public static Item diamondBonePick;
	
	// Add bone axes
	public static Item stoneBoneAxe;
	public static Item ironBoneAxe;
	public static Item goldBoneAxe;
	public static Item diamondBoneAxe;
	
	// Add misc items
	public static Item bucketBitumen;

	// Prevent instantiation
	private ModItems() {}
	
	public static void init() {
		
		// Initialize material items
		chunkBitumen = new ItemChunkBitumen(3340).setIconIndex(21).setItemName("subChunkBitumen");
		
		// Initialize pickaxes
		flintTool = new ItemFlintTool(3330, toolFLINT).setIconIndex(0).setItemName("subFlintTool");
		stoneBonePick = new ItemBonePickaxe(3331, toolSTONEBONE).setIconIndex(1).setItemName("subStoneBonePick");
		ironBonePick = new ItemBonePickaxe(3332, toolIRONBONE).setIconIndex(2).setItemName("subIronBonePick");
		goldBonePick = new ItemBonePickaxe(3333, toolGOLDBONE).setIconIndex(3).setItemName("subGoldBonePick");
		diamondBonePick = new ItemBonePickaxe(3334, toolDIAMONDBONE).setIconIndex(4).setItemName("subDiamondBonePick");
		
		// Initialize axes
		stoneBoneAxe = new ItemBoneAxe(3335, toolSTONEBONE).setIconIndex(5).setItemName("subStoneBoneAxe");
		ironBoneAxe = new ItemBoneAxe(3336, toolIRONBONE).setIconIndex(6).setItemName("subIronBoneAxe");
		goldBoneAxe = new ItemBoneAxe(3337, toolGOLDBONE).setIconIndex(7).setItemName("subGoldBoneAxe");
		diamondBoneAxe = new ItemBoneAxe(3338, toolDIAMONDBONE).setIconIndex(8).setItemName("subDiamondBoneAxe");
		
		// Initialize misc items
		bucketBitumen = new ItemBucketBitumen(3329).setIconIndex(20).setItemName("subBucketBitumen");

		initRecipes();
		
		// Register names
		LanguageRegistry.addName(boneShard, "Bone Shard");
		LanguageRegistry.addName(chunkBitumen, "Chunk of Bitumen");
		LanguageRegistry.addName(bucketBitumen, "Bucket of Bitumen");
		
		LanguageRegistry.addName(flintTool, "Flint Tool");
		LanguageRegistry.addName(stoneBonePick, "Stone Pickaxe");
		LanguageRegistry.addName(ironBonePick, "Iron Pickaxe");
		LanguageRegistry.addName(goldBonePick, "Gold Pickaxe");
		LanguageRegistry.addName(diamondBonePick, "Diamond Pickaxe");
		LanguageRegistry.addName(stoneBoneAxe, "Stone Axe");
		LanguageRegistry.addName(ironBoneAxe, "Iron Axe");
		LanguageRegistry.addName(goldBoneAxe, "Gold Axe");
		LanguageRegistry.addName(diamondBoneAxe, "Diamond Axe");
		
	}
	
	private static void initRecipes() {
		// Define stacks
		ItemStack oneBone = new ItemStack(Item.bone);
		
		GameRegistry.addRecipe(new ItemStack(boneShard, 4), "x ", "x ", 'x', oneBone);
	}

}
