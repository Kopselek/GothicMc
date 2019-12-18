package gothickopselek.client;

import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Messages
{
	@SubscribeEvent
	public void chat(ClientChatEvent event)
	{
		String message = event.getMessage();
		String dot = message.substring(message.length() - 1);
		if (dot.contains(".") || dot.contains("!") || dot.contains("?")) {
		}else {
			if (message.contains("/"))
			{
			}else {
				event.setMessage(message + ".");
			}
		}
	}
}
