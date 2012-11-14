package lolinder.subterrain.common.items;

import lolinder.subterrain.common.CommonProxy;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;

/**
 * ItemBoneSword
 * 
 * Class for bone swords.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemBoneSword extends ItemSword {

	public ItemBoneSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		int damage = this.getMaxDamage();
		this.setMaxDamage((int)(damage * 1.5));
	}

	@Override
	public String getTextureFile()
	{
		return CommonProxy.ITEMS_PNG;
	}
	
	@Override
    public int getItemEnchantability()
    {
        return super.getItemEnchantability() + 2;
    }

}
