package gothickopselek.blocks.item;

import gothickopselek.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockWariants extends ItemBlock
{
	public ItemBlockWariants(Block block)
	{
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) 
	{
		return super.getUnlocalizedName() + "_" + ((IMetaName)this.block).getSpecialName(stack);
	}
}
