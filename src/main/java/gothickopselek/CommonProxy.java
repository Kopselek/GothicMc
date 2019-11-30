package gothickopselek;

import gothickopselek.server.BW;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		
	}
	public void init(FMLInitializationEvent event) 
	{
		
	}
	public void postInit(FMLPostInitializationEvent event) 
	{
		MinecraftForge.EVENT_BUS.register(new BW());
	}
	public void registerItemRender(Item item, int meta, String id) {}
}
