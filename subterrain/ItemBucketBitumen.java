package lolinder.subterrain;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemBucket;

public class ItemBucketBitumen extends ItemBucket {

	public ItemBucketBitumen(int id) {
		super(id, Subterrain.bitumenFlowing.blockID);
		setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
