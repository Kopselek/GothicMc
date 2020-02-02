package gothickopselek.blocks.TileEntity;

import java.util.Random;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ITickable;
import net.minecraft.world.World;

public class TileEntityCloud extends TileEntity implements ITickable
{
	public boolean turning()
	{
		World w = getWorld();
		long wtime = w.getWorldTime();
		long numDigs = (long)Math.log10(wtime);
		long lastDigit = wtime / (long)Math.pow(10, numDigs);
		if (lastDigit > 0 && lastDigit <= 1)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public boolean direction()
	{
		World w = getWorld();
		long wtime = w.getWorldTime();
		long secondDigit = Math.abs((wtime%100) / 10);
		if (secondDigit > 0 && secondDigit <= 5)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public boolean isNight()
	{
		World w = getWorld();
		long wtime = w.getWorldTime();
		if(wtime > 12900 && wtime < 24000)
		{
			return true;
		}else
		{
			return false;
		}
	}
	double turnY = 0.1;
	double turnX = 0.0;
	double turnZ = 0.0;
	@Override
	public void update() 
	{
		World w = getWorld();
		pos = this.getPos();
		if (w.isRemote)
		{
			if (direction() == true)
			{
				turnX = 0.05;
				turnZ = 0.05;
			}else
			{
				if (turnY == 0.1)
				{
					if (turnX > 0.12) {
						turnX -= 0.03;
					}
					else 
					{
						turnX += 0.01;
					}
				}else
				{
					if (turnZ > 0.12) {
						turnZ -= 0.03;
					}
					else 
					{
						turnZ += 0.01;
					}
				}
			if (turning() == true)
				{
					turnY = 0.05;
				}else
				{
					turnY = 0.08;
				}
			}
			Random rand = new Random();
			int RandomCase = rand.nextInt(10);
			float random = 0;
			if(RandomCase != 0)
			{
				random += (float) RandomCase / 100;
			}else {
				random = 0;
			}
			if(isNight())
			{
				w.spawnParticle(EnumParticleTypes.CLOUD, (double) pos.getX() + 0.45, (double) pos.getY(), (double) pos.getZ() + 0.45, (turnX / 2) + random, turnY, (turnZ / 2) + random, new int[0]);
			}
			w.spawnParticle(EnumParticleTypes.CLOUD, (double) pos.getX() + 0.5, (double) pos.getY(), (double) pos.getZ() + 0.5, (turnX / 2) + random, turnY, (turnZ / 2) + random, new int[0]);
		}
	}

}
