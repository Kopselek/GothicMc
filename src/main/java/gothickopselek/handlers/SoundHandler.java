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
	
	public static SoundEvent kretoszczur_ambient;
	public static SoundEvent kretoszczur_death;
	public static SoundEvent kretoszczur_hurt;
	
	public static SoundEvent scierwojad_ambient;
	public static SoundEvent scierwojad_death;
	public static SoundEvent scierwojad_hurt;
	public static SoundEvent scierwojad_attack;
	
	private static int size = 15;
	
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
		
		kretoszczur_ambient = register("kretoszczur_ambient");
		kretoszczur_death = register("kretoszczur_death");
		kretoszczur_hurt = register("kretoszczur_hurt");
		
		scierwojad_ambient = register("scierwojad_ambient");
		scierwojad_death = register("scierwojad_death");
		scierwojad_hurt = register("scierwojad_hurt");
		scierwojad_attack = register("scierwojad_attack");
		
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
