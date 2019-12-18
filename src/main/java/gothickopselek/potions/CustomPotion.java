package gothickopselek.potions;

import gothickopselek.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class CustomPotion extends Potion
{

	public CustomPotion(String name, boolean isBadEffectIn, int colour, int iconIndexX, int iconIndexY) 
	{
		super(isBadEffectIn, colour);
		setPotionName("effect." + name);
		setIconIndex(iconIndexX, iconIndexY);
		setRegistryName(new ResourceLocation(Reference.modID + ":" + name));
	}
	
	@Override
	public boolean hasStatusIcon() 
	{
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Reference.modID + ":textures/gui/potion_effects.png"));
		return true;
	}
}
