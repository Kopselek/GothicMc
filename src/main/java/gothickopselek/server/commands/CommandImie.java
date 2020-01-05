package gothickopselek.server.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
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
		if (sender instanceof EntityPlayer)
		{
			EntityPlayer p = (EntityPlayer) sender;
			if(p.getCustomNameTag() == "")
			{
				String imieArg = convertArrayToString(args);
				String imieArgFix = imieArg.replace("[", "");
				imieArgFix = imieArgFix.replace(",", "");
				imieArgFix = imieArgFix.replace("]", "");
				
				p.setCustomNameTag(imieArgFix);
				p.refreshDisplayName();
			}
		}
	}

}
