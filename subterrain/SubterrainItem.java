package lolinder.subterrain;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

/**
 * SubterrainItem
 * 
 * Class for items for the Subterrain mod
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class SubterrainItem extends Item {

	public SubterrainItem(int id) {
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setIconIndex(0);
		setItemName("subterrainItem");
	}

}

