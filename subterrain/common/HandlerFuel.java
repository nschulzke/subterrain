package lolinder.subterrain.common;

import lolinder.subterrain.common.items.ModItems;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class HandlerFuel implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.itemID == ModItems.chunkBitumen.shiftedIndex) return 3200;
		if (fuel.itemID == ModItems.bucketBitumen.shiftedIndex) return 3600;
		return 0;
	}

}
