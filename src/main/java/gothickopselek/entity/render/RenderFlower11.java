package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower11;
import gothickopselek.entity.model.ModelFlower11;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower11 extends RenderLiving<EntityFlower11>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower11.png");
	
	public RenderFlower11(RenderManager manager)
	{
		super(manager, new ModelFlower11(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower11 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower11 entityLiving, float p_1111043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_1111043_2_, rotationYaw, partialTicks);
	}
}
