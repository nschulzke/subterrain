package lolinder.subterrain.common.items;

import lolinder.subterrain.common.blocks.ModBlocks;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
	
	// Add material items
	public static Item chunkBitumen;
	public static Item bitumenInBucket;
	
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
	
	// Add bone shovels
	public static Item stoneBoneShovel;
	public static Item ironBoneShovel;
	public static Item goldBoneShovel;
	public static Item diamondBoneShovel;
	
	// Add misc items
	public static Item bucketBitumen;

	// Prevent instantiation
	private ModItems() {}
	
	public static void init() {
		
		// Initialize material items
		chunkBitumen = new ItemSubterrainMat(3339).setIconIndex(21).setItemName("subChunkBitumen");
		bitumenInBucket = new ItemSubterrainMat(3340).setIconIndex(22).setItemName("subBitumenInBucket").setContainerItem(Item.bucketEmpty).setMaxStackSize(1);
		
		// Initialize pickaxes
		flintTool = new ItemFlintTool(3330, toolFLINT).setIconIndex(0).setItemName("subFlintTool");
		stoneBonePick = new ItemBonePickaxe(3331, EnumToolMaterial.STONE).setIconIndex(1).setItemName("subStoneBonePick");
		ironBonePick = new ItemBonePickaxe(3332, EnumToolMaterial.IRON).setIconIndex(2).setItemName("subIronBonePick");
		goldBonePick = new ItemBonePickaxe(3333, EnumToolMaterial.GOLD).setIconIndex(3).setItemName("subGoldBonePick");
		diamondBonePick = new ItemBonePickaxe(3334, EnumToolMaterial.EMERALD).setIconIndex(4).setItemName("subDiamondBonePick");
		
		// Initialize axes
		stoneBoneAxe = new ItemBoneAxe(3335, EnumToolMaterial.STONE).setIconIndex(5).setItemName("subStoneBoneAxe");
		ironBoneAxe = new ItemBoneAxe(3336, EnumToolMaterial.IRON).setIconIndex(6).setItemName("subIronBoneAxe");
		goldBoneAxe = new ItemBoneAxe(3337, EnumToolMaterial.GOLD).setIconIndex(7).setItemName("subGoldBoneAxe");
		diamondBoneAxe = new ItemBoneAxe(3338, EnumToolMaterial.EMERALD).setIconIndex(8).setItemName("subDiamondBoneAxe");
		
		// Initialize shovels
		stoneBoneShovel = new ItemBoneShovel(3335, EnumToolMaterial.STONE).setIconIndex(13).setItemName("subStoneBoneShovel");
		ironBoneShovel = new ItemBoneShovel(3336, EnumToolMaterial.IRON).setIconIndex(14).setItemName("subIronBoneShovel");
		goldBoneShovel = new ItemBoneShovel(3337, EnumToolMaterial.GOLD).setIconIndex(15).setItemName("subGoldBoneShovel");
		diamondBoneShovel = new ItemBoneShovel(3338, EnumToolMaterial.EMERALD).setIconIndex(16).setItemName("subDiamondBoneShovel");
		
		// Initialize misc items
		bucketBitumen = new ItemBucketBitumen(3329).setIconIndex(20).setItemName("subBucketBitumen");

		initRecipes();
		
		// Register names
		LanguageRegistry.addName(bitumenInBucket, "Bitumen in a Bucket");
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
		
		LanguageRegistry.addName(stoneBoneShovel, "Stone Shovel");
		LanguageRegistry.addName(ironBoneShovel, "Iron Shovel");
		LanguageRegistry.addName(goldBoneShovel, "Gold Shovel");
		LanguageRegistry.addName(diamondBoneShovel, "Diamond Shovel");
		
	}
	
	private static void initRecipes() {
		// Define stacks
		ItemStack oneBitChunk = new ItemStack(chunkBitumen);
		ItemStack oneBucket = new ItemStack(Item.bucketEmpty);
		ItemStack oneBucketBit = new ItemStack(bucketBitumen);
		ItemStack oneBitInBucket = new ItemStack(bitumenInBucket);
		
		GameRegistry.addRecipe(oneBitInBucket, "x ", "y ", 'x', oneBitChunk, 'y', oneBucket);
		GameRegistry.addShapelessRecipe(new ItemStack(flintTool), Item.flint);
		GameRegistry.addShapelessRecipe(oneBitChunk, oneBitInBucket);
		GameRegistry.addSmelting(bitumenInBucket.shiftedIndex, oneBucketBit, 1.0F);
		GameRegistry.addSmelting(ModBlocks.oreBitumen.blockID, oneBitChunk, 1.0F);
	}

}
