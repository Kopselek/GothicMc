package gothickopselek.items.armor;

import gothickopselek.IHasModel;
import gothickopselek.Main;
import gothickopselek.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.SPacketPlayerListItem;
import net.minecraft.world.World;

public class ArmorBase extends ItemArmor implements IHasModel
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if(!world.isRemote)
		{
			if(itemStack.getItem() == ModItems.Mask && player.getCustomNameTag() != "")
			{
				//save player's name tag to save it in data
				String savedTag = player.getCustomNameTag();
				
				player.setCustomNameTag("Zamaskowany");
				player.refreshDisplayName();
				
		    	SPacketPlayerListItem item = new SPacketPlayerListItem(SPacketPlayerListItem.Action.UPDATE_DISPLAY_NAME,player.getServer().getPlayerList().getPlayers());
		    	for(EntityPlayerMP p1 : player.getServer().getPlayerList().getPlayers())
		    	{
		    		p1.connection.sendPacket(item);
		    	}
		    	
		    	player.setCustomNameTag(savedTag);
			}
		}
	}
}
