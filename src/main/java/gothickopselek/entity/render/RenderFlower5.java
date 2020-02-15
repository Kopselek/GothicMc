package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower5;
import gothickopselek.entity.model.ModelFlower5;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower5 extends RenderLiving<EntityFlower5>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower5.png");
	
	public RenderFlower5(RenderManager manager)
	{
		super(manager, new ModelFlower5(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower5 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower5 entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
