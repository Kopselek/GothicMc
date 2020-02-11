package gothickopselek.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GothicMcTab extends CreativeTabs
{
	public GothicMcTab() 
	{ 
	super("GothicMcTab");
	this.setBackgroundImageName("drstonetab.png"); 
	}
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.BOOK);
	}
}
