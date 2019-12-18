package gothickopselek.blocks;

import gothickopselek.IHasModel;
import gothickopselek.Main;
import gothickopselek.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.GothicMcTab);
		
		ModBlocks.BLOCKS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
	}
}

