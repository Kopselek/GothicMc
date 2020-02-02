package gothickopselek.blocks;

import gothickopselek.blocks.TileEntity.TileEntityCloud;
import gothickopselek.init.ModItems;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Cloud extends BlockBase implements ITileEntityProvider
{
	public Cloud(String name) 
	{
		super(name, Material.BARRIER);
		this.setBlockUnbreakable();
		this.setResistance(6000001.0F);
		ModItems.ITEMS.add(new ItemBlock(this).setMaxStackSize(1).setRegistryName(this.getRegistryName()));
	}
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityCloud();
	}
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityCloud();
	}
	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
	@Override
    public boolean canCollideCheck(IBlockState state, boolean hitIfLiquid)
    {
        return false;
    }
	@Override
    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
    {
        return true;
    }
	@Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
    
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) 
	{
		return EnumBlockRenderType.INVISIBLE;
	}
	
}
