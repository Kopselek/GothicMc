package gothickopselek.items;

import gothickopselek.Main;
import gothickopselek.init.ModItems;
import gothickopselek.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.GothicMcTab);
		
		ModItems.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRender(this, 0, "inventory");
	}
	
}
