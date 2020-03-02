package gothickopselek.server;


import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import gothickopselek.init.ModItems;
import net.minecraft.block.BlockChest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RightClickEventCustom 
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
		
		if(heldItem.getItem() == ModItems.dice)
		{
			EntityPlayer p = event.getEntityPlayer();
			Random r = new Random();
			int a = r.nextInt(6);
			a++;
			
			double minX = p.posX - 15.0;
			double minY = p.posY - 15.0;
			double minZ = p.posZ - 15.0;
			double maxX = p.posX + 15.0;
			double maxY = p.posY + 15.0;
			double maxZ = p.posZ + 15.0;
			
			World worldIn = p.getEntityWorld();
			AxisAlignedBB boundingbox = new AxisAlignedBB(minX, minY, minZ, maxX, maxY, maxZ);
			List<? extends EntityPlayer> entityList = worldIn.getEntitiesWithinAABB(p.getClass(), boundingbox);
			for(int i = 0; i < entityList.size(); i++) {
				if(!event.getWorld().isRemote)
				{
					String mess = p.getDisplayNameString() + " Wyrzucil " + a + " oczek";
					entityList.get(i).sendMessage(new TextComponentString(TextFormatting.DARK_PURPLE + mess));
				}
			}
		}
	}
}
