package gothickopselek;

import gothickopselek.blocks.TileEntityCloud;
import gothickopselek.init.ModPotion;
import gothickopselek.server.BW;
import gothickopselek.server.commands.CommandImie;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		Main.proxy.registerTileEntities();
		ModPotion.registerPotions();
		
	}
	@SuppressWarnings("deprecation")
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityCloud.class, Reference.modID + ":cloud");
	}
	public void init(FMLInitializationEvent event) 
	{
		
	}
	public void postInit(FMLPostInitializationEvent event) 
	{
		MinecraftForge.EVENT_BUS.register(new BW());
	}
	
	public void serverInit(FMLServerStartingEvent event) 
	{
		event.registerServerCommand(new CommandImie());
	}
	
	public void registerItemRender(Item item, int meta, String id) {}
	public void registerWariantRenderer(Item item, int meta, String filename, String id) {}
}
