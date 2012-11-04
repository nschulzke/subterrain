package lolinder.subterrain.common.items;

import lolinder.subterrain.common.CommonProxy;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;

/**
 * ItemBonePickaxe
 * 
 * Class for bone pickaxes.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemBonePickaxe extends ItemPickaxe {

	public ItemBonePickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
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
        return this.toolMaterial.getEnchantability() + 2;
    }

}
