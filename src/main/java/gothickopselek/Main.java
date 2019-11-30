package gothickopselek;

import gothickopselek.CommonProxy;
import gothickopselek.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.modID, name = Reference.modName, version = Reference.modVersion, acceptedMinecraftVersions = Reference.modMcVersion)
public class Main 
{
	public static final CreativeTabs GothicMcTab = new gothickopselek.tabs.GothicMcTab();
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.modClientProxy, serverSide = Reference.modCommonProxy)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	@EventHandler
	public void Postinit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}

	public void sendToServer(TextComponentString textComponentString) {
		
	}
}
