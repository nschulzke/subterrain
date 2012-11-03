package lolinder.subterrain.common;

import lolinder.subterrain.common.blocks.ModBlocks;
import lolinder.subterrain.common.items.ModItems;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemPickaxe;
import net.minecraft.src.MapColor;
import net.minecraft.src.Material;
import net.minecraft.src.MaterialLiquid;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
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
@Mod(modid="Subterrain", name="Subterrain", version="0.0.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Subterrain {

	@Instance("Generic")
	public static Subterrain instance;

	// Specify proxies
	@SidedProxy(clientSide="lolinder.subterrain.client.ClientProxy", serverSide="lolinder.subterrain.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// To come later
	}

	@Init
	public void load(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new HandlerBitumenBucket());
		MinecraftForge.EVENT_BUS.register(new HandlerBoneTorchCreation());
		
		proxy.registerRenderers();
		
		ModBlocks.init();
		
		ModItems.init();
		
		GameRegistry.registerWorldGenerator(new WorldGen());
		GameRegistry.registerFuelHandler(new HandlerFuel());
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// To come later
	}
}
