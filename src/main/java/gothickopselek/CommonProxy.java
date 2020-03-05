package gothickopselek;

import gothickopselek.blocks.TileEntity.TileEntityCloud;
import gothickopselek.client.BagEvents;
import gothickopselek.init.ModEntity;
import gothickopselek.init.ModPotion;
import gothickopselek.server.BW;
import gothickopselek.server.DamageEvent;
import gothickopselek.server.MessageServer;
import gothickopselek.server.RightClickEventCustom;
import gothickopselek.server.NameFormat;
import gothickopselek.server.NoName;
import gothickopselek.server.commands.CommandImie;
import gothickopselek.server.commands.CommandPlayLute;
import gothickopselek.server.commands.CommandSprimie;
import gothickopselek.server.commands.CommandZmienimie;
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
		ModEntity.registerEntities();
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
		MinecraftForge.EVENT_BUS.register(new MessageServer());
		MinecraftForge.EVENT_BUS.register(new NameFormat());
		MinecraftForge.EVENT_BUS.register(new RightClickEventCustom());
		MinecraftForge.EVENT_BUS.register(new NoName());
		MinecraftForge.EVENT_BUS.register(new BagEvents());
		MinecraftForge.EVENT_BUS.register(new DamageEvent());
	}
	
	public void serverInit(FMLServerStartingEvent event) 
	{
		event.registerServerCommand(new CommandImie());
		event.registerServerCommand(new CommandSprimie());
		event.registerServerCommand(new CommandZmienimie());
		event.registerServerCommand(new CommandPlayLute());
	}
	
	public void registerItemRender(Item item, int meta, String id) {}
	public void registerWariantRenderer(Item item, int meta, String filename, String id) {}
}
