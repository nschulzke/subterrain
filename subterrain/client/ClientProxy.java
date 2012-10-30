package lolinder.subterrain.client;

import net.minecraftforge.client.MinecraftForgeClient;
import lolinder.subterrain.CommonProxy;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}
	
}
