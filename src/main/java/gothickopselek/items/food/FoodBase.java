package gothickopselek.items.food;

import gothickopselek.IHasModel;
import gothickopselek.Main;
import gothickopselek.init.ModItems;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{
	public FoodBase(String name, int amount, float saturaion, boolean isAnimalFood)
	{
		super(amount, saturaion, isAnimalFood);
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
