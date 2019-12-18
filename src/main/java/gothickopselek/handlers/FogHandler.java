package gothickopselek.handlers;


import gothickopselek.init.ModPotion;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogColors;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogDensity;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.event.terraingen.BiomeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class FogHandler 
{

	public static FogHandler INSTANCE = new FogHandler();
	public boolean biomeSet = false;
	
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	@SideOnly(Side.CLIENT)
	public void onFogColors(FogColors event) 
	{
		Entity p = event.getEntity();
		if(p instanceof EntityPlayer)
		{
			if(((EntityPlayer) p).isPotionActive(ModPotion.Fag_Effect))
			{
			    event.setGreen(255.0F);
			}
		}
	}

	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	@SideOnly(Side.CLIENT)
	public void onFogDensity(FogDensity event) 
	{
		Entity p = event.getEntity();
		if(p instanceof EntityPlayer)
		{
			if(((EntityPlayer) p).isPotionActive(ModPotion.Fag_Effect))
			{
				event.setDensity(0.00001F);
				event.setCanceled(true);
				biomeSet = true;
			}else
			{
				biomeSet = false;
			}
		}
	}
	
	
	@SubscribeEvent(priority=EventPriority.HIGH, receiveCanceled=true)
	@SideOnly(Side.CLIENT)
	public void onBiomeChange(BiomeEvent.BiomeColor event)
	{
		if(biomeSet)
		{
			
			event.setNewColor(16733695);
		}
		else
		{
			event.setNewColor(1922333);
		}
	}
	
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void changeModel(RenderPlayerEvent.Pre event)
	{
		if(biomeSet)
		{
			event.setCanceled(true);
		}else
		{
			event.setCanceled(false);
		}
	}
	@SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void playFogMusic(PlaySoundEvent event)
    {
    	if(event.getSound() != null && event.getSound().getCategory() != null && event.getSound().getCategory() == SoundCategory.MUSIC)
    	{
    		event.setResultSound(null);
    	}
    }
}
