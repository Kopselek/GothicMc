package gothickopselek.server.commands;

import gothickopselek.Reference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.SPacketPlayerListItem;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;

public class CommandCk extends CommandBase
{
	
	public static final ResourceLocation NAME_CAP = new ResourceLocation(Reference.modID, "usun");
	
	@Override
	public String getName() 
	{
		return "usun";
	}

	
	@Override
	public String getUsage(ICommandSender sender) 
	{
		return "usun <nick>";
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
			if (sender instanceof EntityPlayer)
			{
				EntityPlayer p = (EntityPlayer) sender;
				if(p.getCustomNameTag() != "" && args[0].contains(p.getName()))
				{
					p.inventory.clear();
					
					
					p.setCustomNameTag("");
					p.refreshDisplayName();
					
			    	SPacketPlayerListItem item = new SPacketPlayerListItem(SPacketPlayerListItem.Action.UPDATE_DISPLAY_NAME,p.getServer().getPlayerList().getPlayers());
			    	for(EntityPlayerMP p1 : p.getServer().getPlayerList().getPlayers())
			    	{
			    		p1.connection.sendPacket(item);
			    	}
			    	
			    	server.getCommandManager().executeCommand(server, "/tp " + p.getName() + " -173 41 723");
				}else
				{
					throw new WrongUsageException("Nie masz postaci, albo zle wpisales komende", new Object[0]);
				}
			}
		}else
		{
			throw new WrongUsageException("/usun [nick]", new Object[0]);
		}
	}
}
