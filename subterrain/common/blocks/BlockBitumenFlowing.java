package lolinder.subterrain.common.blocks;

/**
 * BlockBitumenFlowing
 * 
 * Bitumen liquid that is moving.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
import java.util.Random;

import lolinder.subterrain.common.CommonProxy;

import net.minecraft.src.Block;
import net.minecraft.src.BlockFlowing;
import net.minecraft.src.BlockFluid;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

public class BlockBitumenFlowing extends BlockFlowing {
	
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
	
}
