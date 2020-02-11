package gothickopselek.server.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.SPacketPlayerListItem;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;

import java.util.Arrays;
import gothickopselek.Reference;

public class CommandImie extends CommandBase
{
	
	public static final ResourceLocation NAME_CAP = new ResourceLocation(Reference.modID, "imie");
	
	@Override
	public String getName() 
	{
		return "imie";
	}

	
	@Override
	public String getUsage(ICommandSender sender) 
	{
		return "imie <imie>";
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) 
	{
		return true;
	}
	
	public static String convertArrayToString(String[] strArray)
	{
		return Arrays.toString(strArray);
	}
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		if (args.length >= 1 && args[0].length() > 0)
		{
		if (sender instanceof EntityPlayer)
			{
				EntityPlayer p = (EntityPlayer) sender;
				if(p.getCustomNameTag() == "")
				{
					String imieArg = convertArrayToString(args);
					String imieArgFix = imieArg.replace("[", "");
					imieArgFix = imieArgFix.replace(",", "");
					imieArgFix = imieArgFix.replace("]", "");
						
					if(imieArgFix.length() <= 16)
					{
						p.setCustomNameTag(imieArgFix);
						p.refreshDisplayName();
						
				    	SPacketPlayerListItem item = new SPacketPlayerListItem(SPacketPlayerListItem.Action.UPDATE_DISPLAY_NAME,p.getServer().getPlayerList().getPlayers());
				    	for(EntityPlayerMP p1 : p.getServer().getPlayerList().getPlayers())
				    	{
				    		p1.connection.sendPacket(item);
				    	}
						
				    	p.sendMessage(new TextComponentString("Twoje imie zostalo zmienione na: " + imieArgFix));
					}else
					{
						throw new WrongUsageException("Maksymalna dlugosc to 16 znakow!", new Object[0]);
					}
				}
			}
		}else
		{
			throw new WrongUsageException("/imie [imie]", new Object[0]);
		}
	}

}
