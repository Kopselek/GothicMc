package gothickopselek.items.food;

import gothickopselek.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodEffectBase extends FoodBase 
{
	PotionEffect effect;
	
	
	public FoodEffectBase(String name, int amount, float saturaion, boolean isAnimalFood, PotionEffect effect) 
	{
		super(name, amount, saturaion, isAnimalFood);
		setAlwaysEdible();
		
		
		
		this.effect = effect;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if (!worldIn.isRemote)
		{
			player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
			if(stack.getItem() == ModItems.Fag)
			{
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 4600, 0));
				
			}else if(stack.getItem() == ModItems.beer || stack.getItem() == ModItems.ryzowka)
			{
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(15), 5000, 1));
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 5000, 0));
				
			}else if(stack.getItem() == ModItems.wine || stack.getItem() == ModItems.gin)
			{
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(15), 5000, 0));
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 5000, 0));
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 5000, 0));
				
			}else if(stack.getItem() == ModItems.wine2) 
			{
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 5000, 0));
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 5000, 0));
			}
			
		}
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		if(stack.getItem() == ModItems.Fag)
		{
			return EnumAction.EAT;
		}
		return EnumAction.DRINK;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
}
