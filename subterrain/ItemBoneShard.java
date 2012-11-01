package lolinder.subterrain;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumMovingObjectType;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.World;

public class ItemBoneShard extends Item {

	public ItemBoneShard(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	

	@Override
	public String getTextureFile()
	{
		return CommonProxy.ITEMS_PNG;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		MovingObjectPosition clicked = this.getMovingObjectPositionFromPlayer(world, player, true);
		if (clicked.typeOfHit == EnumMovingObjectType.TILE) {
			int clickedX = clicked.blockX;
			int clickedY = clicked.blockY;
			int clickedZ = clicked.blockZ;
			
			int clickedBlockID = world.getBlockId(clickedX, clickedY, clickedZ);
			
			if (!world.canMineBlock(player, clickedX, clickedY, clickedZ));
			
			if ( clickedBlockID == Subterrain.bitumenFlowing.blockID || clickedBlockID == Subterrain.bitumenStill.blockID ) {
				--itemStack.stackSize;
				if (itemStack.stackSize <= 0) {
					return new ItemStack(Subterrain.boneTorch);
				}
				if (!player.inventory.addItemStackToInventory(new ItemStack(Subterrain.boneTorch))) {
					player.dropPlayerItem(new ItemStack(Subterrain.boneTorch));
				}
			}
		}
		return itemStack;
	}

}
