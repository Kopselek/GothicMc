package gothickopselek.server.commands;

import gothickopselek.Reference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;

public class CommandZmienimie extends CommandBase
{
	public static final ResourceLocation NAME_CAP = new ResourceLocation(Reference.modID, "zmienimie");

	@Override
	public String getName() 
	{
		return "zmienimie";
	}

	@Override
	public String getUsage(ICommandSender sender) 
	{
		return "zmienimie <nick gracza> <nowe imie uzyj _ zamiast spacji>";
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
		if (args.length >= 1 && args[0].length() > 0)
		{
			EntityPlayer target = getPlayer(server, sender, args[0]);
			if (target instanceof EntityPlayer)
			{
				String newName = args[1].toString();
				newName = newName.replace("_", " ");
				
				target.setCustomNameTag(newName);
				target.refreshDisplayName();
				
                EntityPlayerMP entityplayermp = server.getPlayerList().getPlayerByUsername(target.getName());
        		
                if (entityplayermp != null)
                {
                    entityplayermp.connection.disconnect(new TextComponentTranslation("Twoje imie zostalo zmienione, wejdz ponownie na serwer!", new Object[0]));
                }
			}
		}else
		{
			throw new WrongUsageException("/zmienimie [nick gracza] [nowe imie uzyj _ zamiast spacji]", new Object[0]);
		}
	}

}
