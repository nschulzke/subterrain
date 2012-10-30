package lolinder.subterrain;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
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

	static EnumToolMaterial toolFLINT = EnumHelper.addToolMaterial("FLINT", 0, 15, 1.0F, 0, 0);
	public static Item flintTool = new ItemFlintTool(3330, toolFLINT).setIconIndex(0).setCreativeTab(CreativeTabs.tabTools).setItemName("flintTool");


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
		
		LanguageRegistry.addName(flintTool, "Flint Tool");
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}
