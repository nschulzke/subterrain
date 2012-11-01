package lolinder.subterrain;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockFlowing;
import net.minecraft.src.BlockFluid;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Material;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

public class BlockBitumenFlowing extends BlockFlowing {

	private boolean dontTick = false;
	
	public BlockBitumenFlowing(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(100F);
		this.setLightOpacity(3);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	
	@Override
	public boolean getBlocksMovement(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return false;
    }
}
