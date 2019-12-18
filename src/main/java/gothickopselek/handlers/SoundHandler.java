package gothickopselek.handlers;

import gothickopselek.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundHandler
{
	public static SoundEvent fagsound;
	private static int size = 0;
	
	public static void init()
	{
		size = SoundEvent.REGISTRY.getKeys().size();
		
		fagsound = register("fagsound");
	}
	
	public static SoundEvent register(String name) 
	{
		ResourceLocation loc = new ResourceLocation(Reference.modID + ":" + name);
		SoundEvent e = new SoundEvent(loc);
		
		SoundEvent.REGISTRY.register(size, loc, e);
		size++;
		
		return e;
	}
}
