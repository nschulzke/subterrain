package lolinder.subterrain.common.blocks;

import static net.minecraftforge.common.ForgeDirection.DOWN;
import static net.minecraftforge.common.ForgeDirection.EAST;
import static net.minecraftforge.common.ForgeDirection.NORTH;
import static net.minecraftforge.common.ForgeDirection.SOUTH;
import static net.minecraftforge.common.ForgeDirection.UP;
import static net.minecraftforge.common.ForgeDirection.WEST;

import java.util.Random;

import lolinder.subterrain.common.CommonProxy;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.BlockTorch;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeDirection;

/**
 * BlockLantern
 * 
 * A lantern block.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockLantern extends Block {

	protected BlockLantern(int id, int texture) {
		super(id, texture, Material.circuits);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setHardness(0.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setBlockBoundsForItemRender();
		this.setRequiresSelfNotify();
	}

	@Override
	public void setBlockBoundsForItemRender()
	{
		float width = 0.375F;
		float radius = width/2;
		float height = 0.5F;
		this.setBlockBounds(0.5F - radius, 0.0F, 0.5F - radius, 0.5F + radius, height, 0.5F + radius);
	}

	@Override
	public boolean canPlaceBlockAt(World world, int xPos, int yPos, int zPos)
	{
		return super.canPlaceBlockAt(world, xPos, yPos, zPos) && world.doesBlockHaveSolidTopSurface(xPos, yPos - 1, zPos);
	}

	@Override
	public void onNeighborBlockChange(World world, int xPos, int yPos, int zPos, int blockId)
	{
		if (!world.doesBlockHaveSolidTopSurface(xPos, yPos - 1, zPos))
		{
			this.dropBlockAsItem(world, xPos, yPos, zPos, world.getBlockMetadata(xPos, yPos, zPos), 0);
			world.setBlockWithNotify(xPos, yPos, zPos, 0);
		}
	}

	@Override
	public void randomDisplayTick(World par1World, int parX, int parY, int parZ, Random par5Random)
	{
        double posX = (double)((float)parX + 0.5F);
        double posY = (double)((float)parY + 0.2F);
        double posZ = (double)((float)parZ + 0.5F);
		par1World.spawnParticle("smoke", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
		par1World.spawnParticle("flame", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
	}

	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int metaData)
	{
		return side == 1 ? this.blockIndexInTexture : (side == 0 ? this.blockIndexInTexture + 32 : this.blockIndexInTexture + 16);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

}
