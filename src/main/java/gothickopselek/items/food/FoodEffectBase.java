package gothickopselek.items.food;

import gothickopselek.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
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
				MinecraftServer w = worldIn.getMinecraftServer();
				int posX = player.getPosition().getX();
				int posY = player.getPosition().getY();
				int posZ = player.getPosition().getZ();
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 5000, 0));
				w.commandManager.executeCommand(w, "stopsound " + player.getName());
				w.commandManager.executeCommand(w, "playsound gothickopselek:fagsound player " + player.getName() + " " + posX + " " + posY + " " + posZ + " 100 1");
				
			}else if(stack.getItem() == ModItems.beer)
			{
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 5000, 0));
			}
			
		}
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		if(stack.getItem() == ModItems.Fag)
		{
			return EnumAction.EAT;
		}else if(stack.getItem() == ModItems.beer)
		{
			return EnumAction.DRINK;
		}
		return EnumAction.EAT;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
}
