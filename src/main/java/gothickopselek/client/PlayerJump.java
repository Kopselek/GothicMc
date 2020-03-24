package gothickopselek.client;

import gothickopselek.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerJump 
{
	@SubscribeEvent(priority = EventPriority.LOW)
	public void onJump(LivingJumpEvent event)
	{
		if(event.getEntity() instanceof EntityPlayer)
		{
			EntityPlayer p = (EntityPlayer) event.getEntity();
			if(p.isSprinting())
			{
				p.motionY = 0;
			}
			if(p.inventory.armorItemInSlot(3).getItem() == ModItems.line_bag)
			{
				p.motionY = 0;
			}
		}
	}
}
