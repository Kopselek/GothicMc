package gothickopselek;

import org.lwjgl.input.Keyboard;

import gothickopselek.client.Messages;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
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
		// declare an array of key bindings
		keyBindings = new KeyBinding[2]; 
		  
		// instantiate the key bindings
		keyBindings[0] = new KeyBinding("key.structure.desc", Keyboard.KEY_B, "key.staty");
		  
		// register all the key bindings
		for (int i = 0; i < keyBindings.length; ++i) 
		{
		    ClientRegistry.registerKeyBinding(keyBindings[i]);
		}
	}
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
		MinecraftForge.EVENT_BUS.register(new Messages());
	}
	@Override
	public void registerItemRender(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
}
