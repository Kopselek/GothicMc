package gothickopselek.init;

import gothickopselek.potions.CustomPotion;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModPotion 
{
	public static final Potion Fag_Effect = new CustomPotion("jazz", false, 6525591, 0, 0).registerPotionAttributeModifier(SharedMonsterAttributes.MOVEMENT_SPEED, MathHelper.getRandomUUID().toString(), 0.1D, 2);
	public static final PotionType Fag_Potion = new PotionType("jazz", new PotionEffect[] {new PotionEffect(Fag_Effect, 4800)}).setRegistryName("jazz");
	public static final PotionType Long_Fag_Potion = new PotionType("jazz", new PotionEffect[] {new PotionEffect(Fag_Effect, 7200)}).setRegistryName("long_jazz");
	
	public static final Potion beer_Effect = new CustomPotion("beer", false, 6525591, 1, 0).registerPotionAttributeModifier(SharedMonsterAttributes.MAX_HEALTH, MathHelper.getRandomUUID().toString(), 0.1D, 2);
	public static final PotionType beer_Potion = new PotionType("beer", new PotionEffect[] {new PotionEffect(beer_Effect, 4800)}).setRegistryName("beer");
	public static final PotionType Long_beer_Potion = new PotionType("beer", new PotionEffect[] {new PotionEffect(beer_Effect, 7200)}).setRegistryName("long_beer");
	
	public static void registerPotions()
	{
		registerPotion(Fag_Potion, Long_Fag_Potion, Fag_Effect);
		registerPotion(beer_Potion, Long_beer_Potion, beer_Effect);
	}
	private static void registerPotion(PotionType defaultPotion, PotionType longPotion, Potion effect)
	{
		ForgeRegistries.POTIONS.register(effect);
		ForgeRegistries.POTION_TYPES.register(defaultPotion);
		ForgeRegistries.POTION_TYPES.register(longPotion);
	}
}
