package gothickopselek.server;

import gothickopselek.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderLivingEvent.Specials;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NoName 
{
	@SuppressWarnings("rawtypes")
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void Pre(Specials.Pre event)
	{
		if(event.getEntity() instanceof EntityPlayer)
		{
			if(event.isCancelable())
			{
				EntityPlayer p = (EntityPlayer) event.getEntity();
				if(p.inventory.armorItemInSlot(3).getItem() == ModItems.Mask)
				{
					event.setCanceled(true);
				}
			}
		}
	}
}
