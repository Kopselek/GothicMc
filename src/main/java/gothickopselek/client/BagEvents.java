package gothickopselek.client;

import gothickopselek.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BagEvents 
{
	@SideOnly(Side.SERVER)
	@SubscribeEvent
	public void jumpBag(LivingJumpEvent event)
	{
		if (event.getEntity() instanceof EntityPlayer)
		{
			EntityPlayer p = (EntityPlayer) event.getEntity();
			if(p.inventory.armorItemInSlot(3).getItem() == ModItems.line_bag)
			{
				p.addVelocity(p.motionX, p.motionY - 1.0D, p.motionZ);
			}
		}
	}
}
