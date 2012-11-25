package lolinder.subterrain.common.blocks;

import lolinder.subterrain.common.CommonProxy;
import net.minecraft.src.Block;
import net.minecraft.src.BlockLadder;
import net.minecraft.src.CreativeTabs;

/**
 * BlockBoneTorch
 * 
 * A torch crafted by right-clicking a bone shard on a block of liquid bitumen.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockBoneLadder extends BlockLadder {

	protected BlockBoneLadder(int id, int texture) {
		super(id, texture);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setHardness(0.0F);
		this.setStepSound(Block.soundWoodFootstep);
	}

	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

}
