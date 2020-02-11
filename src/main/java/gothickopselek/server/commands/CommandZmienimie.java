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
import net.minecraft.util.text.TextComponentString;

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
				
		    	SPacketPlayerListItem item = new SPacketPlayerListItem(SPacketPlayerListItem.Action.UPDATE_DISPLAY_NAME,target.getServer().getPlayerList().getPlayers());
		    	for(EntityPlayerMP p1 : target.getServer().getPlayerList().getPlayers())
		    	{
		    		p1.connection.sendPacket(item);
		    	}
				
		    	target.sendMessage(new TextComponentString("Twoje imie zostalo zmienione na: " + newName));
			}
		}else
		{
			throw new WrongUsageException("/zmienimie [nick gracza] [nowe imie uzyj _ zamiast spacji]", new Object[0]);
		}
	}

}
