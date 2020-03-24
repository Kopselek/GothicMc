package gothickopselek.gui;

import gothickopselek.Reference;
import gothickopselek.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiBag extends Gui
{
	private final ResourceLocation texture = new ResourceLocation(Reference.modID + ":textures/gui/bag.png");
	private final int texture_width = 576, texture_height = 576;
	
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void renderOverlay(RenderGameOverlayEvent event)
	{
		if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT)
		{
			Minecraft mc = Minecraft.getMinecraft();
			EntityPlayer p = mc.player;
			GuiScreen screen = mc.currentScreen;
			
			if(p.inventory.armorItemInSlot(3).getItem() == ModItems.line_bag)
			{
				if (screen instanceof GuiContainer)
				{
					p.closeScreen();
				}
				
				mc.renderEngine.bindTexture(texture);
				drawTexturedModalRect(0, 0, 0, 0, texture_width, texture_height);
			}
		}
	}
}