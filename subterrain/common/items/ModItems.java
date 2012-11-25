package lolinder.subterrain.common.items;

import lolinder.subterrain.common.blocks.ModBlocks;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
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
	
	// Add bone hoes
	public static Item stoneBoneHoe;
	public static Item ironBoneHoe;
	public static Item goldBoneHoe;
	public static Item diamondBoneHoe;
	
	// Add bone shovels
	public static Item stoneBoneShovel;
	public static Item ironBoneShovel;
	public static Item goldBoneShovel;
	public static Item diamondBoneShovel;
	
	// Add bone swords
	public static Item stoneBoneSword;
	public static Item ironBoneSword;
	public static Item goldBoneSword;
	public static Item diamondBoneSword;
	
	// Add misc items
	public static Item bucketBitumen;
	public static Item stoneBowl;

	// Prevent instantiation
	private ModItems() {}
	
	public static void init() {
		
		// Initialize material items
		chunkBitumen = new ItemSubterrain(3327).setCreativeTab(CreativeTabs.tabMaterials).setIconIndex(22).setItemName("subChunkBitumen");
		bitumenInBucket = new ItemSubterrain(3328).setCreativeTab(CreativeTabs.tabMaterials).setIconIndex(23).setItemName("subBitumenInBucket").setContainerItem(Item.bucketEmpty).setMaxStackSize(1);
		
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
		
		// Initialize hoes
		stoneBoneHoe = new ItemBoneHoe(3339, EnumToolMaterial.STONE).setIconIndex(9).setItemName("subStoneBoneHoe");
		ironBoneHoe = new ItemBoneHoe(3340, EnumToolMaterial.IRON).setIconIndex(10).setItemName("subIronBoneHoe");
		goldBoneHoe = new ItemBoneHoe(3341, EnumToolMaterial.GOLD).setIconIndex(11).setItemName("subGoldBoneHoe");
		diamondBoneHoe= new ItemBoneHoe(3342, EnumToolMaterial.EMERALD).setIconIndex(12).setItemName("subDiamondBoneHoe");
		
		// Initialize shovels
		stoneBoneShovel = new ItemBoneShovel(3343, EnumToolMaterial.STONE).setIconIndex(13).setItemName("subStoneBoneShovel");
		ironBoneShovel = new ItemBoneShovel(3344, EnumToolMaterial.IRON).setIconIndex(14).setItemName("subIronBoneShovel");
		goldBoneShovel = new ItemBoneShovel(3345, EnumToolMaterial.GOLD).setIconIndex(15).setItemName("subGoldBoneShovel");
		diamondBoneShovel = new ItemBoneShovel(3346, EnumToolMaterial.EMERALD).setIconIndex(16).setItemName("subDiamondBoneShovel");
		
		// Initialize swords
		stoneBoneSword = new ItemBoneSword(3347, EnumToolMaterial.STONE).setIconIndex(17).setItemName("subStoneBoneSword");
		ironBoneSword = new ItemBoneSword(3348, EnumToolMaterial.IRON).setIconIndex(18).setItemName("subIronBoneSword");
		goldBoneSword = new ItemBoneSword(3349, EnumToolMaterial.GOLD).setIconIndex(19).setItemName("subGoldBoneSword");
		diamondBoneSword = new ItemBoneSword(3350, EnumToolMaterial.EMERALD).setIconIndex(20).setItemName("subDiamondBoneSword");
		
		// Initialize misc items
		bucketBitumen = new ItemBucketBitumen(3329).setIconIndex(21).setItemName("subBucketBitumen");
		stoneBowl = new ItemSubterrain(3351).setIconIndex(24).setItemName("subStoneBowl");

		initRecipes();
		
		// Register names
		LanguageRegistry.addName(bitumenInBucket, "Bitumen in a Bucket");
		LanguageRegistry.addName(chunkBitumen, "Chunk of Bitumen");
		LanguageRegistry.addName(bucketBitumen, "Bucket of Bitumen");
		LanguageRegistry.addName(bucketBitumen, "Stone Bowl");
		
		LanguageRegistry.addName(flintTool, "Flint Tool");
		LanguageRegistry.addName(stoneBonePick, "Stone Pickaxe");
		LanguageRegistry.addName(ironBonePick, "Iron Pickaxe");
		LanguageRegistry.addName(goldBonePick, "Gold Pickaxe");
		LanguageRegistry.addName(diamondBonePick, "Diamond Pickaxe");
		LanguageRegistry.addName(stoneBoneAxe, "Stone Axe");
		LanguageRegistry.addName(ironBoneAxe, "Iron Axe");
		LanguageRegistry.addName(goldBoneAxe, "Gold Axe");
		LanguageRegistry.addName(diamondBoneAxe, "Diamond Axe");
		LanguageRegistry.addName(stoneBoneHoe, "Stone Hoe");
		LanguageRegistry.addName(ironBoneHoe, "Iron Hoe");
		LanguageRegistry.addName(goldBoneHoe, "Gold Hoe");
		LanguageRegistry.addName(diamondBoneHoe, "Diamond Hoe");
		LanguageRegistry.addName(stoneBoneShovel, "Stone Shovel");
		LanguageRegistry.addName(ironBoneShovel, "Iron Shovel");
		LanguageRegistry.addName(goldBoneShovel, "Gold Shovel");
		LanguageRegistry.addName(diamondBoneShovel, "Diamond Shovel");
		LanguageRegistry.addName(stoneBoneSword, "Stone Sword");
		LanguageRegistry.addName(ironBoneSword, "Iron Sword");
		LanguageRegistry.addName(goldBoneSword, "Gold Sword");
		LanguageRegistry.addName(diamondBoneSword, "Diamond Sword");
		
	}
	
	private static void initRecipes() {
		// Define stacks
		ItemStack oneBitChunk = new ItemStack(chunkBitumen);
		ItemStack oneBucket = new ItemStack(Item.bucketEmpty);
		ItemStack oneBucketBit = new ItemStack(bucketBitumen);
		ItemStack oneBitInBucket = new ItemStack(bitumenInBucket);
		
		GameRegistry.addRecipe(oneBitInBucket, "x", "y", 'x', oneBitChunk, 'y', oneBucket);
		GameRegistry.addShapelessRecipe(new ItemStack(flintTool), Item.flint);
		GameRegistry.addShapelessRecipe(oneBitChunk, oneBitInBucket);
		GameRegistry.addSmelting(bitumenInBucket.shiftedIndex, oneBucketBit, 1.0F);
		GameRegistry.addSmelting(ModBlocks.oreBitumen.blockID, oneBitChunk, 1.0F);
		
		String toolPatterns[][] = {{"xxx", " i ", " i "},{"xx", "xi", " i"},{"x", "i", "i"},{"xx", " i", " i"},{"x", "x", "i"}};
		Object items[][] = {{Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotGold},
				{stoneBonePick, ironBonePick, diamondBonePick, goldBonePick},
				{stoneBoneAxe, ironBoneAxe, diamondBoneAxe, goldBoneAxe},
				{stoneBoneShovel, ironBoneShovel, diamondBoneShovel, goldBoneShovel},
				{stoneBoneHoe, ironBoneHoe, diamondBoneHoe, goldBoneHoe},
				{stoneBoneSword, ironBoneSword, diamondBoneSword, goldBoneSword}};
		
		for (int i = 0; i < items[0].length; i++) {
			Object material = items[0][i];
			for (int j = 0; j < items.length - 1; j++) {
				Item result = (Item)items[j + 1][i];
				GameRegistry.addRecipe(new ItemStack(result), new Object[] {toolPatterns[j], 'i', Item.bone, 'x', material});
			}
		}
	}

}
