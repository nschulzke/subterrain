package lolinder.subterrain.common.items;

import lolinder.subterrain.common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;

/**
 * ItemFlintTool
 * 
 * A simple flint tool.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemFlintTool extends ItemPickaxe {
	public ItemFlintTool(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		setCreativeTab(CreativeTabs.tabTools);
	}

	@Override
	public String getTextureFile()
	{
		return CommonProxy.ITEMS_PNG;
	}
}
