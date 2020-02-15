package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower4;
import gothickopselek.entity.model.ModelFlower4;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower4 extends RenderLiving<EntityFlower4>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower4.png");
	
	public RenderFlower4(RenderManager manager)
	{
		super(manager, new ModelFlower4(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower4 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower4 entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
