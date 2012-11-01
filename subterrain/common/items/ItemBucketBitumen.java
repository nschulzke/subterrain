package lolinder.subterrain.common.items;

import lolinder.subterrain.common.CommonProxy;
import lolinder.subterrain.common.blocks.ModBlocks;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemBucket;

/**
 * ItemBucketBitumen
 * 
 * A bucket of bitumen.  Needs HandlerBitumenBucket to work.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemBucketBitumen extends ItemBucket {

	public ItemBucketBitumen(int id) {
		super(id, ModBlocks.bitumenFlowing.blockID);
		setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
