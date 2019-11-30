package gothickopselek.server;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BW implements ITickable
{
	private int freeze = 0;
	private BlockPos pos;
	private String entity;
	public void setpos(BlockPos pos) { this.pos = pos; }
	public BlockPos getpos() { return this.pos; }
	public void setfreeze(int freeze) { this.freeze = freeze; }
	public int getfreeze() { return this.freeze; }
	@SubscribeEvent
	public void death(LivingDeathEvent event)
	{
		Entity p = event.getEntity();
		if (p instanceof EntityPlayer)
		{
			if (event.getSource().getTrueSource() instanceof EntityPlayer) 
			{
				event.setCanceled(event.isCancelable());
			}
		}
	}
	@SubscribeEvent
	public void damage(LivingDamageEvent event)
	{
		Entity p = event.getEntity();
		if (p instanceof EntityPlayer)
		{
			if (event.getSource().getTrueSource() instanceof EntityPlayer) 
			{
				float a = event.getAmount();
				if (a <= 1)
				{
					if (this.freeze > 0)
					{
						this.freeze =+ 300;
						this.pos = p.getPosition();
						this.entity = p.getName();
					}
				}
			}
		}
	}
	@Override
	public void update() 
	{
		if (this.freeze > 0)
		{
			MinecraftServer s = FMLCommonHandler.instance().getMinecraftServerInstance();
			s.getCommandManager().executeCommand(s, "/tp " + this.entity + " " + this.pos);
		}
	}
}
