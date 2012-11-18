package lolinder.subterrain.common.blocks;

import lolinder.subterrain.common.CommonProxy;
import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class BlockMod extends Block {

	public BlockMod(int id, int texture, Material material) {
		super(id, texture, material);
	}

	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	
}
