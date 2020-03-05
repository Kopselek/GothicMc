package gothickopselek.server;

import gothickopselek.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DamageEvent 
{
	@SubscribeEvent
	public void damage(LivingAttackEvent event)
	{
		if(event.getSource().getTrueSource() instanceof EntityPlayer)
		{
			EntityPlayer attacker = (EntityPlayer) event.getSource().getTrueSource();
			if(attacker.inventory.armorItemInSlot(3).getItem() == ModItems.line_bag)
			{
				if(event.isCancelable())
				{
					event.setCanceled(true);
				}
			}
		}
	}
}
