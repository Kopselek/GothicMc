package gothickopselek.server;

import gothickopselek.init.ModPotion;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MessageServer 
{
	
	@SubscribeEvent
	public void chatServer(ServerChatEvent event)
	{
		EntityPlayerMP p = event.getPlayer();
		if(event.getPlayer() != null)
		{
			if(p.isPotionActive(ModPotion.beer_Effect)) //change player's message when he is drunked
			{
				String mess = event.getMessage();
				if(mess.contains("a") || mess.contains("e") || mess.contains("o") || mess.contains("i"))
				{
					if(!mess.contains("/"))
					{
						event.setCanceled(true);
						String replace1 = mess.replace('a', 'z');
						String replace2 = replace1.replace('e', 't');
						String replace3 = replace2.replace('o', 'b');
						String replace4Final = replace3.replace('i', 'k');
						String newMess = event.getPlayer().getName() + ": " + replace4Final;
						event.setComponent(new TextComponentString(newMess));
						p.sendMessage(new TextComponentString(newMess));
					}
				}
			}
		}
	}
	
}
