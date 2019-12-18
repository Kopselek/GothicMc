package gothickopselek;

import gothickopselek.client.Messages;
import gothickopselek.handlers.FogHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	public static KeyBinding[] keyBindings;
	
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
	}
	
	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
	}
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
		MinecraftForge.EVENT_BUS.register(new FogHandler());
		MinecraftForge.EVENT_BUS.register(new Messages());
	}
	@Override
	public void registerItemRender(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
}
