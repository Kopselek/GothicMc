package gothickopselek.server;


import java.util.concurrent.ThreadLocalRandom;

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
				if (!event.getWorld().isRemote) 
				{
					if (heldItem.getItem() == ModItems.Picklock)
					{
						int randomInt = ThreadLocalRandom.current().nextInt(0,10);
						if(randomInt > 4)
						{
							event.getEntityPlayer().sendMessage(new TextComponentString(event.getEntityPlayer().getName() + ": Wytrych zlamal sie."));
							
							event.setCanceled(true);
							int stack = heldItem.getCount();
							event.getEntityPlayer().setHeldItem(event.getEntityPlayer().getActiveHand(), new ItemStack(ModItems.Picklock, stack - 1));
						}
						
					}else {
						event.setCanceled(true);
						event.getEntityPlayer().sendMessage(new TextComponentString(event.getEntityPlayer().getName() + ": Czym?"));
					}
				}
			}
		}
		
	}
	
}
