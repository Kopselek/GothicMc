package gothickopselek.server;

import gothickopselek.init.ModItems;
import net.minecraft.block.BlockChest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModChest 
{
	@SubscribeEvent
	public void onClickChest(PlayerInteractEvent.RightClickBlock event)
	{
		BlockPos blockPos = event.getPos();
		ItemStack heldItem = event.getEntityPlayer().getHeldItemMainhand();
		IBlockState w = event.getWorld().getBlockState(blockPos);
		
		if (w.getBlock() instanceof BlockChest)
		{
			if (!event.getEntityPlayer().capabilities.isCreativeMode)
			{
				if (heldItem.getItem() == ModItems.Picklock)
				{
					
				}else {
					if (!event.getWorld().isRemote)
					{
						event.getEntityPlayer().sendMessage(new TextComponentString(event.getEntityPlayer().getName() + ": Czym?"));
					}
					event.setCanceled(true);
				}
			}
		}
		
	}
	
}
