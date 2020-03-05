package gothickopselek.server.commands;

import gothickopselek.Reference;
import gothickopselek.init.ModItems;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;

public class CommandPlayLute extends CommandBase
{
	
	public static final ResourceLocation NAME_CAP = new ResourceLocation(Reference.modID, "playlute");
	
	@Override
	public String getName() 
	{
		return "playlute";
	}

	
	@Override
	public String getUsage(ICommandSender sender) 
	{
		return "playlute <number 0-9>";
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) 
	{
		return true;
	}
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		if(args.length >= 1 && args[0].length() == 1)
		{
			if(Integer.parseInt(args[0]) < 10 && Integer.parseInt(args[0]) > 0)
			{
				if(sender instanceof EntityPlayer)
				{
					EntityPlayer p = (EntityPlayer) sender;
					if(p.getHeldItemOffhand().getItem() == ModItems.lute)
					{
						BlockPos pPos = p.getPosition();
						p.getServer().getEntityWorld().playSound(null, pPos.getX(), pPos.getY(), pPos.getZ(), SoundEvents.BLOCK_NOTE_GUITAR, SoundCategory.AMBIENT, 1.0F, 0.0F + (Float.parseFloat(args[0]) / 5));
					}
				}
			}
		}
	}
}
