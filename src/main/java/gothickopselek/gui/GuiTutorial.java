package gothickopselek.gui;

import java.io.IOException;

import gothickopselek.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GuiTutorial extends GuiScreen
{
	final ResourceLocation texture = new ResourceLocation(Reference.modID + ":textures/gui/book.png");
	int guiHeight = 256;
	int guiWidth = 256;
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) 
	{
		int centerX = (width / 2) - guiWidth / 2;
		int centerY = (height /2) - guiHeight / 2;
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		drawTexturedModalRect(centerX, centerY, 0, 0, guiWidth, guiHeight);
		drawString(fontRenderer, "Postaæ", centerX, centerY / 2, 0x9d9a91);
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
	public void initGui() 
	{
		super.initGui();
	}
	
	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		super.actionPerformed(button);
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
	@Override
	public void onGuiClosed() {
		super.onGuiClosed();
	}
}
