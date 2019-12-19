package gothickopselek.server;

import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class BW
{
	@SubscribeEvent
	public void damage(LivingDeathEvent event)
	{
		Entity p = event.getEntity();
		BlockPos pos = p.getPosition();
		
		if (p instanceof EntityPlayer)
		{
			if (event.getSource().getTrueSource() instanceof EntityPlayer)
			{
				((EntityPlayer) p).setSpawnChunk(pos, true, p.world.provider.getDimension());
			}else
			{
				Random rand = new Random();
				int RandomCase = rand.nextInt(4);
					
				switch(RandomCase)
				{
				case 0:
					BlockPos pos2 = new BlockPos(85, 48, 90);
					((EntityPlayer) p).setSpawnChunk(pos2, true, p.world.provider.getDimension());
					break;
				case 1:
					BlockPos pos3 = new BlockPos(277, 37, 56);
					((EntityPlayer) p).setSpawnChunk(pos3, true, p.world.provider.getDimension());
					break;
				case 2:
					BlockPos pos4 = new BlockPos(-404, 43, 294);
					((EntityPlayer) p).setSpawnChunk(pos4, true, p.world.provider.getDimension());
					break;
				case 3:
					BlockPos pos5 = new BlockPos(-125, 51, -66);
					((EntityPlayer) p).setSpawnChunk(pos5, true, p.world.provider.getDimension());
					break;
				}
			}
		}
	}
	
	@SubscribeEvent
	public void respawn(PlayerRespawnEvent event)
	{
		EntityPlayer p = event.player;
		p.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5000, 1));
		p.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 500, 0));
		p.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 2000, 0));
		p.setHealth(2);
	}
}
