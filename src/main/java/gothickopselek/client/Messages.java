package gothickopselek.client;

import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Messages
{
	@SubscribeEvent
	public void chat(ClientChatEvent event)
	{
		String message = event.getMessage();
		String kropka = message.substring(message.length() - 1);
		if (kropka.contains(".") || kropka.contains("!") || kropka.contains("?")) {
		}else {
			if (message.contains("/"))
			{
			}else {
				event.setMessage(message + ".");
			}
		}
	}
}
