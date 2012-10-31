package lolinder.subterrain;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;

public class ItemFlintTool extends ItemPickaxe {
	public ItemFlintTool(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setMaxDamage(15);
		this.efficiencyOnProperMaterial = 1.0F;
	}

	@Override
	public String getTextureFile()
	{
		return CommonProxy.ITEMS_PNG;
	}
	
	@Override
    public int getItemEnchantability()
    {
        return 0;
    }
}
