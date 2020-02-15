package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower6;
import gothickopselek.entity.model.ModelFlower6;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower6 extends RenderLiving<EntityFlower6>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower6.png");
	
	public RenderFlower6(RenderManager manager)
	{
		super(manager, new ModelFlower6(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower6 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower6 entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
