package lolinder.subterrain.common.blocks;

import java.util.Random;

import lolinder.subterrain.common.CommonProxy;
import lolinder.subterrain.common.items.ModItems;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

/**
 * BlockOreBitumen
 * 
 * A block of bitumen ore.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockOreBitumen extends Block {

	public BlockOreBitumen(int id, int texture, Material material) {
		super(id, texture, material);
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return ModItems.chunkBitumen.shiftedIndex;
	}

	@Override
	public String getTextureFile() {
		return CommonProxy.BLOCK_PNG;
	}
	
}
