package gothickopselek.handlers;

import gothickopselek.ClientProxy;
import gothickopselek.IHasModel;
import gothickopselek.gui.GuiTutorial;
import gothickopselek.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

@EventBusSubscriber
public class RegistryHandler 
{

@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
public static void onEvent(KeyInputEvent event)
{

    // make local copy of key binding array
    KeyBinding[] keyBindings = ClientProxy.keyBindings;
   
    // check each enumerated key binding type for pressed and take appropriate action
    if (keyBindings[0].isPressed()) 
    {
        // DEBUG
        System.out.println("Key binding ="+keyBindings[0].getKeyDescription());
        Minecraft.getMinecraft().displayGuiScreen(new GuiTutorial());
        // do stuff for this key binding here
        // remember you may need to send packet to server
    }
}
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	//@SubscribeEvent
	//public static void onBlockRegister(RegistryEvent.Register<Block> event)
	//{
	//	event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	//}
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		//for(Block block : ModBlocks.BLOCKS)
		//{
		//	if(block instanceof IHasModel)
		//	{
		//		((IHasModel)block).registerModels();
		//	}
		//}
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
	}
}