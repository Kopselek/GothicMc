package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower1;
import gothickopselek.entity.model.ModelFlower1;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower1 extends RenderLiving<EntityFlower1>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower1.png");
	
	public RenderFlower1(RenderManager manager)
	{
		super(manager, new ModelFlower1(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower1 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower1 entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
