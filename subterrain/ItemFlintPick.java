package lolinder.subterrain;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;

public class ItemFlintPick extends ItemPickaxe {

	public ItemFlintPick(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
	}

	@Override
	public String getTextureFile()
	{
		return CommonProxy.ITEMS_PNG;
	}

}
