package lolinder.subterrain;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;

public class ItemBonePickaxe extends ItemPickaxe {

	public ItemBonePickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}

	@Override
	public String getTextureFile()
	{
		return CommonProxy.ITEMS_PNG;
	}

}
