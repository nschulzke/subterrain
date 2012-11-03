package lolinder.subterrain.common;

import lolinder.subterrain.common.blocks.ModBlocks;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

/**
 * HandlerBoneTorchCreation
 * 
 * Allows bone torches to be created from bones.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class HandlerBoneTorchCreation {

	public HandlerBoneTorchCreation() {
	}
	
	@ForgeSubscribe
	public void onInteract(PlayerInteractEvent event) {
		if (event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) {

			EntityPlayer player = event.entityPlayer;
			ItemStack stack = player.getCurrentEquippedItem();
			if (stack != null) {
				if (stack.itemID == Item.bone.shiftedIndex) {
					World world = player.worldObj;
					MovingObjectPosition clicked = this.getMovingObjectPositionFromPlayer(world, player, true);
					int blockID;
					if (clicked != null)
						blockID = world.getBlockId(clicked.blockX, clicked.blockY, clicked.blockZ);
					else
						blockID = -1;
					if ( blockID == ModBlocks.bitumenFlowing.blockID || blockID == ModBlocks.bitumenStill.blockID ) {
						ItemStack result = new ItemStack(ModBlocks.boneTorch, 2);
						--stack.stackSize;
						if (!player.inventory.addItemStackToInventory(result)) {
								player.dropPlayerItem(result);
						}
					}
				}
			}
		}
	}
	
	protected MovingObjectPosition getMovingObjectPositionFromPlayer(World par1World, EntityPlayer par2EntityPlayer, boolean par3)
    {
        float var4 = 1.0F;
        float var5 = par2EntityPlayer.prevRotationPitch + (par2EntityPlayer.rotationPitch - par2EntityPlayer.prevRotationPitch) * var4;
        float var6 = par2EntityPlayer.prevRotationYaw + (par2EntityPlayer.rotationYaw - par2EntityPlayer.prevRotationYaw) * var4;
        double var7 = par2EntityPlayer.prevPosX + (par2EntityPlayer.posX - par2EntityPlayer.prevPosX) * (double)var4;
        double var9 = par2EntityPlayer.prevPosY + (par2EntityPlayer.posY - par2EntityPlayer.prevPosY) * (double)var4 + 1.62D - (double)par2EntityPlayer.yOffset;
        double var11 = par2EntityPlayer.prevPosZ + (par2EntityPlayer.posZ - par2EntityPlayer.prevPosZ) * (double)var4;
        Vec3 var13 = par1World.func_82732_R().getVecFromPool(var7, var9, var11);
        float var14 = MathHelper.cos(-var6 * 0.017453292F - (float)Math.PI);
        float var15 = MathHelper.sin(-var6 * 0.017453292F - (float)Math.PI);
        float var16 = -MathHelper.cos(-var5 * 0.017453292F);
        float var17 = MathHelper.sin(-var5 * 0.017453292F);
        float var18 = var15 * var16;
        float var20 = var14 * var16;
        double var21 = 5.0D;
        if (par2EntityPlayer instanceof EntityPlayerMP)
        {
            var21 = ((EntityPlayerMP)par2EntityPlayer).theItemInWorldManager.getBlockReachDistance();
        }
        Vec3 var23 = var13.addVector((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
        return par1World.rayTraceBlocks_do_do(var13, var23, par3, !par3);
    }

}
