package lolinder.subterrain.common.blocks;

import lolinder.subterrain.common.CommonProxy;
import net.minecraft.src.BlockStationary;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

/**
 * BlockBitumenStationary
 * 
 * Bitumen liquid that is still.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
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
