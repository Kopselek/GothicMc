package gothickopselek.server;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class NameFormat 
{
	@SubscribeEvent
	public void onNameFormat(PlayerEvent.NameFormat event)
	{
		String NameTag = event.getEntityPlayer().getCustomNameTag();
		if(NameTag != "")
		{
			event.setDisplayname(NameTag);
		}
	}
}
