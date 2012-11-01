package lolinder.subterrain.common;

/**
 * CommonProxy
 * 
 * Common client/server proxy class.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class CommonProxy {
	public static String ITEMS_PNG = "/lolinder/subterrain/common/items.png";
	public static String BLOCK_PNG = "/lolinder/subterrain/common/block.png";

	//To be overridden by ClientProxy
	public void registerRenderers() {	}
}
