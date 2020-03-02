package gothickopselek.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityFlower10 extends EntityPig
{
	public EntityFlower10(World worldIn) {
		super(worldIn);
		this.setSize(1.6F, 1.8F);
	}
	
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0D);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(10);
        return;
	}
	protected void initEntityAI() {
		return;
	}
	
    protected SoundEvent getAmbientSound()
    {
        return null;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return null;
    }

    protected SoundEvent getDeathSound()
    {
        return null;
    }
    
    protected ResourceLocation getLootTable()
    {
        return null;
    }
    @Override
    public boolean isBreedingItem(ItemStack stack) {
    	return false;
    }
    
    @Override
    public EntityKretoszczur createChild(EntityAgeable ageable) {
    	return null;
    }
    
    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) 
    {
    	return false;
    }
	
}
