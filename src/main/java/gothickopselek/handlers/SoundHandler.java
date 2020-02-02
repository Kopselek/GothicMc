package gothickopselek.handlers;

import gothickopselek.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundHandler
{
	public static SoundEvent fagsound;
	
	//chill music to play on server
	public static SoundEvent dark;
	public static SoundEvent forest;
	public static SoundEvent girl_singing;
	public static SoundEvent gothic3;
	public static SoundEvent khorinis;
	public static SoundEvent normal;
	public static SoundEvent shantie;
	public static SoundEvent shantie2;
	
	private static int size = 8;
	
	public static void init()
	{
		size = SoundEvent.REGISTRY.getKeys().size();
		
		fagsound = register("fagsound");
		
		dark = register("dark");
		forest = register("forest");
		girl_singing = register("girl_singing");
		gothic3 = register("gothic3");
		khorinis = register("khorinis");
		normal = register("normal");
		shantie = register("shantie");
		shantie2 = register("shantie2");
		
		
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
