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
	public static SoundEvent kretoszczur_attack;
	
	public static SoundEvent scierwojad_ambient;
	public static SoundEvent scierwojad_death;
	public static SoundEvent scierwojad_hurt;
	public static SoundEvent scierwojad_attack;
	
	public static SoundEvent cieniostwor_ambient;
	public static SoundEvent cieniostwor_death;
	public static SoundEvent cieniostwor_hurt;
	public static SoundEvent cieniostwor_attack;
	
	public static SoundEvent topielec_ambient;
	public static SoundEvent topielec_death;
	public static SoundEvent topielec_hurt;
	public static SoundEvent topielec_attack;
	
	public static SoundEvent zebacz_ambient;
	public static SoundEvent zebacz_death;
	public static SoundEvent zebacz_hurt;
	public static SoundEvent zebacz_attack;
	
	public static SoundEvent goblin_ambient;
	public static SoundEvent goblin_death;
	public static SoundEvent goblin_hurt;
	public static SoundEvent goblin_attack;
	
	public static SoundEvent wilk_ambient;
	public static SoundEvent wilk_death;
	public static SoundEvent wilk_hurt;
	public static SoundEvent wilk_attack;
	
	public static SoundEvent PolnaBestia_ambient;
	public static SoundEvent PolnaBestia_death;
	public static SoundEvent PolnaBestia_hurt;
	public static SoundEvent PolnaBestia_attack;
	
	private static int size = 40;
	
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
		kretoszczur_attack = register("kretoszczur_attack");
		
		scierwojad_ambient = register("scierwojad_ambient");
		scierwojad_death = register("scierwojad_death");
		scierwojad_hurt = register("scierwojad_hurt");
		scierwojad_attack = register("scierwojad_attack");
		
		cieniostwor_ambient = register("cieniostwor_ambient");
		cieniostwor_death = register("cieniostwor_death");
		cieniostwor_hurt = register("cieniostwor_hurt");
		cieniostwor_attack = register("cieniostwor_attack");
		
		topielec_ambient = register("topielec_ambient");
		topielec_death = register("topielec_death");
		topielec_hurt = register("topielec_hurt");
		topielec_attack = register("topielec_attack");
		
		zebacz_ambient = register("zebacz_ambient");
		zebacz_death = register("zebacz_death");
		zebacz_hurt = register("zebacz_hurt");
		zebacz_attack = register("zebacz_attack");
		
		goblin_ambient = register("goblin_ambient");
		goblin_death = register("goblin_death");
		goblin_hurt = register("goblin_hurt");
		goblin_attack = register("goblin_attack");
		
		wilk_ambient = register("wilk_ambient");
		wilk_death = register("wilk_death");
		wilk_hurt = register("wilk_hurt");
		wilk_attack = register("wilk_attack");
		
		PolnaBestia_ambient = register("PolnaBestia_ambient");
		PolnaBestia_death = register("PolnaBestia_death");
		PolnaBestia_hurt = register("PolnaBestia_hurt");
		PolnaBestia_attack = register("PolnaBestia_attack");
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
