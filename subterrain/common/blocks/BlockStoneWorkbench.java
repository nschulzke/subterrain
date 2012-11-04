package lolinder.subterrain.common.blocks;

import lolinder.subterrain.common.CommonProxy;
import net.minecraft.src.BlockWorkbench;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockStoneWorkbench extends BlockWorkbench {

	public BlockStoneWorkbench(int id) {
		super(id);
		setHardness(1.5F);
		setResistance(10.0F);
		setStepSound(soundStoneFootstep);
		this.blockIndexInTexture = 4;
		setCreativeTab(CreativeTabs.tabDecorations);
	}

	@Override
	public int getBlockTextureFromSide(int par1)
	{
		return par1 == 1 ? this.blockIndexInTexture + 16 : (par1 == 0 ? this.blockIndexInTexture - 1 : (par1 != 2 && par1 != 4 ? this.blockIndexInTexture : this.blockIndexInTexture + 1));
	}

	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

}
