package gothickopselek.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityKretoszczur extends EntityPig
{
	public EntityKretoszczur(World worldIn) {
		super(worldIn);
		this.setSize(2.8F, 2.4F);
	}
	
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
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
    
    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(SoundEvents.ENTITY_PIG_STEP, 0.15F, 1.0F);
    }
    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) 
    {
    	return true;
    }
	
}
