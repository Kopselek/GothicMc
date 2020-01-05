package gothickopselek.server;

import java.util.List;

import gothickopselek.init.ModPotion;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MessageServer 
{
	
    public static boolean validateText(String text)
    {
        boolean matches = text.matches(".*\\*[a-zA-Z0-9 ]*\\*.*");
        return matches;
    }
    
	@SubscribeEvent
	public void chatServer(ServerChatEvent event)
	{
		EntityPlayerMP p = event.getPlayer();
		String mess = event.getMessage();
		String newMess = "";
		String CustomNameTag = event.getPlayer().getCustomNameTag();
		String pName;
		if (CustomNameTag == "")
		{
			pName = event.getPlayer().getName();
		}else
		{
			pName = event.getPlayer().getCustomNameTag();
		}
		if(event.getPlayer() != null)
		{
			event.setCanceled(true);
			if(mess.length() > 1)
			{
				if(p.isPotionActive(ModPotion.beer_Effect)) //change player's message when beer_effect is active
				{
					if(mess.contains("a") || mess.contains("e") || mess.contains("o") || mess.contains("i"))
					{
						if(!mess.contains("/"))
						{
							String replace1 = mess.replace('a', 'z');
							String replace2 = replace1.replace('e', 't');
							String replace3 = replace2.replace('o', 'b');
							String replace4Final = replace3.replace('i', 'k');
							newMess = pName + ": " + replace4Final;
						}
					}
				}else
				{
					if(validateText(mess))
					{
						String outputString = "";
						boolean ifColor = false;
						for(int i = 0; i < mess.length(); i++)
						{
							if(mess.charAt(i) == '*')
							{
								outputString = outputString+TextFormatting.LIGHT_PURPLE+mess.substring(i, i+1);
								ifColor = !ifColor;
							}else
							{
								if(ifColor)
								{
									outputString = outputString+TextFormatting.LIGHT_PURPLE+mess.substring(i, i+1);
								}else
								{
									outputString = outputString+TextFormatting.WHITE+mess.substring(i, i+1);
								}
							}
						}
						newMess = pName + ": " + outputString;
					}else
					{
						newMess = pName + ": " + mess;
					}
				}
			}
			
			double minX = p.posX - 15.0;
			double minY = p.posY - 15.0;
			double minZ = p.posZ - 15.0;
			double maxX = p.posX + 15.0;
			double maxY = p.posY + 15.0;
			double maxZ = p.posZ + 15.0;
			
			World worldIn = p.getEntityWorld();
			AxisAlignedBB boundingbox = new AxisAlignedBB(minX, minY, minZ, maxX, maxY, maxZ);
			List<? extends EntityPlayerMP> entityList = worldIn.getEntitiesWithinAABB(p.getClass(), boundingbox);
			for(int i = 0; i < entityList.size(); i++) {
				event.setComponent(new TextComponentString(newMess));
				entityList.get(i).sendMessage(new TextComponentString(newMess));
			}
		}
	}
}
