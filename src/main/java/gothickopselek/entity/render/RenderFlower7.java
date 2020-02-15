package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower7;
import gothickopselek.entity.model.ModelFlower7;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower7 extends RenderLiving<EntityFlower7>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower7.png");
	
	public RenderFlower7(RenderManager manager)
	{
		super(manager, new ModelFlower7(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower7 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower7 entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}