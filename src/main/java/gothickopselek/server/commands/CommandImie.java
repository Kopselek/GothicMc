package gothickopselek.server.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.event.entity.player.PlayerEvent.NameFormat;
import java.util.Arrays;

public class CommandImie extends CommandBase
{
	
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
		if (sender instanceof EntityPlayer)
		{
			EntityPlayer p = (EntityPlayer) sender;
			String pUsername = p.getName();
			NameFormat pNick = new NameFormat(p, pUsername);
			String imieArg = convertArrayToString(args);
			p.setCustomNameTag(imieArg);
			pNick.setDisplayname(imieArg);
			p.refreshDisplayName();
		}
	}

}
