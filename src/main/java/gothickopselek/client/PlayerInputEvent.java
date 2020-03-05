package gothickopselek.client;

import org.lwjgl.input.Keyboard;

import gothickopselek.init.ModItems;
import gothickopselek.init.ModPotion;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class PlayerInputEvent
{
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void playerInput(InputEvent.KeyInputEvent event)
	{
		EntityPlayer p = Minecraft.getMinecraft().player;
		
		if (p.isPotionActive(ModPotion.beer_Effect))
		{
		    if(Keyboard.isKeyDown(Keyboard.KEY_S)) // down
		    {
		        p.move(MoverType.PLAYER, 0.1, 0, 0);
		    }
		    if(Keyboard.isKeyDown(Keyboard.KEY_A)) //left
		    {
		    	p.move(MoverType.PLAYER, 0, 0, 0.1);
		    }
		    if(Keyboard.isKeyDown(Keyboard.KEY_D)) //right
		    {
		    	p.move(MoverType.PLAYER, 0, 0, -0.1);
		    }
		    if(Keyboard.isKeyDown(Keyboard.KEY_W)) //up
		    {
		    	p.move(MoverType.PLAYER, -0.1, 0, 0);
		    }
			
		}
		
		if (p.getHeldItemOffhand().getItem() == ModItems.lute)
		{
			if(Keyboard.isKeyDown(Keyboard.KEY_1))
			{
				Minecraft.getMinecraft().player.sendChatMessage("/playlute " + 1);
				
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_2))
			{
				Minecraft.getMinecraft().player.sendChatMessage("/playlute " + 2);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_3))
			{
				Minecraft.getMinecraft().player.sendChatMessage("/playlute " + 3);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_4))
			{
				Minecraft.getMinecraft().player.sendChatMessage("/playlute " + 4);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_5))
			{
				Minecraft.getMinecraft().player.sendChatMessage("/playlute " + 5);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_6))
			{
				Minecraft.getMinecraft().player.sendChatMessage("/playlute " + 6);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_7))
			{
				Minecraft.getMinecraft().player.sendChatMessage("/playlute " + 7);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_8))
			{
				Minecraft.getMinecraft().player.sendChatMessage("/playlute " + 8);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_9))
			{
				Minecraft.getMinecraft().player.sendChatMessage("/playlute " + 9);
			}
		}
	}
}
