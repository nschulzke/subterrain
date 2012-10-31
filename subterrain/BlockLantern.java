package lolinder.subterrain;

import static net.minecraftforge.common.ForgeDirection.DOWN;
import static net.minecraftforge.common.ForgeDirection.EAST;
import static net.minecraftforge.common.ForgeDirection.NORTH;
import static net.minecraftforge.common.ForgeDirection.SOUTH;
import static net.minecraftforge.common.ForgeDirection.UP;
import static net.minecraftforge.common.ForgeDirection.WEST;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.BlockTorch;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeDirection;

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
