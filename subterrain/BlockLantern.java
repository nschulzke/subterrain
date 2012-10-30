package lolinder.subterrain;

import net.minecraft.src.BlockTorch;

public class BlockLantern extends BlockTorch {

	protected BlockLantern(int id, int texture) {
		super(id, texture);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	
}
