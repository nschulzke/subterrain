package lolinder.subterrain.client;

import net.minecraftforge.client.MinecraftForgeClient;
import lolinder.subterrain.CommonProxy;

/**
 * ClientProxy
 * 
 * Client proxy class.  Client functionality that can't go in CommonProxy
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}
	
}
