package gothickopselek.client;

import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
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
