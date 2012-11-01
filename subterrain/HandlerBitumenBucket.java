package lolinder.subterrain;

import net.minecraft.src.ItemStack;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.World;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class HandlerBitumenBucket {

	public HandlerBitumenBucket() {
		// TODO Auto-generated constructor stub
	}

	@ForgeSubscribe
	public void onBucketFill(FillBucketEvent event){

		ItemStack result = fillCustomBucket(event.world,event.target);

		if(result == null)
			return;

		event.result=result;
		event.setResult(Result.ALLOW);
	}

	public ItemStack fillCustomBucket(World world, MovingObjectPosition pos) {

		int blockID = world.getBlockId(pos.blockX,pos.blockY,pos.blockZ);

		if((blockID == Subterrain.bitumenStill.blockID || blockID == Subterrain.bitumenFlowing.blockID)
				&& world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0) {

			world.setBlockWithNotify(pos.blockX, pos.blockY, pos.blockZ, 0);

			return new ItemStack(Subterrain.bucketBitumen);
		} else
			return null;

	}

}
