package lolinder.subterrain;

import net.minecraft.src.BlockStationary;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockBitumenStationary extends BlockStationary {

	public BlockBitumenStationary(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(100F);
		this.setLightOpacity(3);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

}
