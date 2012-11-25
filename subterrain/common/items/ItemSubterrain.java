package lolinder.subterrain.common.items;

import lolinder.subterrain.common.CommonProxy;
import lolinder.subterrain.common.blocks.ModBlocks;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumMovingObjectType;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.World;

/**
 * ItemChunkBitumen
 * 
 * A chunk of solid bitumen.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemSubterrain extends Item {

	public ItemSubterrain(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public String getTextureFile()
	{
		return CommonProxy.ITEMS_PNG;
	}

}
