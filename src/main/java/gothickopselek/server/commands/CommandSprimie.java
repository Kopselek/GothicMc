package gothickopselek.server.commands;

import gothickopselek.Reference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;

public class CommandSprimie extends CommandBase
{
	public static final ResourceLocation NAME_CAP = new ResourceLocation(Reference.modID, "sprimie");
	
	@Override
	public String getName() 
	{
		return "sprimie";
	}

	@Override
	public String getUsage(ICommandSender sender) 
	{
		return "sprimie <imie>";
	}

	@Override
	public int getRequiredPermissionLevel() 
	{
		return 3;
	}
	
	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) 
	{
		return true;
	}
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		if (args.length == 1 && args[0].length() > 0)
		{
			String name = args[0].toString();
			name = name.replace("_", " ");
			
			String[] serverList = server.getOnlinePlayerNames();
			for(int i = 0; i <= serverList.length - 1; ++i)
			{
				EntityPlayer p = server.getPlayerList().getPlayerByUsername(serverList[i]);
				if (p.getCustomNameTag().contains(name))
				{
					EntityPlayer pSender = (EntityPlayer) sender;
					pSender.sendMessage(new TextComponentString("Imie gracza " + name));
					pSender.sendMessage(new TextComponentString("Nick gracza " + p.getName()));
				}
			}
				
		}else
		{
			throw new WrongUsageException("/sprimie [imie] / dodaj _ zamiast spacji", new Object[0]);
		}
	}
}
