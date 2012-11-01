package lolinder.subterrain;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemPickaxe;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Subterrain
 * 
 * Main mod class
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
@Mod(modid="Subterrain", name="Subterrain", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Subterrain {

	// Add tool materials
	static EnumToolMaterial toolFLINT = EnumHelper.addToolMaterial("oneFLINT", 1, 15, 1.0F, 0, 0);
	static EnumToolMaterial toolSTONEBONE = EnumHelper.addToolMaterial("subSTONEBONE", 1, 262, 4.0F, 1, 7);
	static EnumToolMaterial toolIRONBONE = EnumHelper.addToolMaterial("subIRONBONE", 2, 524, 6.0F, 2, 16);
	static EnumToolMaterial toolGOLDBONE = EnumHelper.addToolMaterial("subGOLDBONE", 0, 48, 12.0F, 0, 24);
	static EnumToolMaterial toolDIAMONDBONE = EnumHelper.addToolMaterial("subDIAMONDBONE", 3, 2047, 8.0F, 3, 12);
	
	// Add miscellaneous items
	public static final Item flintTool = new ItemFlintTool(3330, toolFLINT).setIconIndex(0).setMaxStackSize(1).setCreativeTab(CreativeTabs.tabTools).setItemName("subFlintTool");
	public static final Block lantern = new BlockLantern(430, 0).setBlockName("subLantern").setCreativeTab(CreativeTabs.tabDecorations).setLightValue(0.9375F).setHardness(0.0F).setStepSound(Block.soundWoodFootstep);

	// Add bone pickaxes
	public static final Item stoneBonePick = new ItemBonePickaxe(3331, toolSTONEBONE).setIconIndex(1).setItemName("subStoneBonePick");
	public static final Item ironBonePick = new ItemBonePickaxe(3332, toolIRONBONE).setIconIndex(2).setItemName("subIronBonePick");
	public static final Item goldBonePick = new ItemBonePickaxe(3333, toolGOLDBONE).setIconIndex(3).setItemName("subGoldBonePick");
	public static final Item diamondBonePick = new ItemBonePickaxe(3334, toolDIAMONDBONE).setIconIndex(4).setItemName("subDiamondBonePick");
	
	// Add bone axes
	public static final Item stoneBoneAxe = new ItemBoneAxe(3335, toolSTONEBONE).setIconIndex(5).setItemName("subStoneBoneAxe");
	public static final Item ironBoneAxe = new ItemBoneAxe(3336, toolIRONBONE).setIconIndex(6).setItemName("subIronBoneAxe");
	public static final Item goldBoneAxe = new ItemBoneAxe(3337, toolGOLDBONE).setIconIndex(7).setItemName("subGoldBoneAxe");
	public static final Item diamondBoneAxe = new ItemBoneAxe(3338, toolDIAMONDBONE).setIconIndex(8).setItemName("subDiamondBoneAxe");
	
	// The instance of your mod that Forge uses.
	@Instance("Generic")
	public static Subterrain instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="lolinder.subterrain.client.ClientProxy", serverSide="lolinder.subterrain.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// Stub Method
	}

	@Init
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		
		GameRegistry.registerBlock(lantern);
		
		LanguageRegistry.addName(lantern, "Lantern");
		LanguageRegistry.addName(flintTool, "Flint Tool");
		LanguageRegistry.addName(stoneBonePick, "Stone Pickaxe");
		LanguageRegistry.addName(ironBonePick, "Iron Pickaxe");
		LanguageRegistry.addName(goldBonePick, "Gold Pickaxe");
		LanguageRegistry.addName(diamondBonePick, "Diamond Pickaxe");
		LanguageRegistry.addName(stoneBoneAxe, "Stone Axe");
		LanguageRegistry.addName(ironBoneAxe, "Iron Axe");
		LanguageRegistry.addName(goldBoneAxe, "Gold Axe");
		LanguageRegistry.addName(diamondBonePick, "Diamond Axe");
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}
