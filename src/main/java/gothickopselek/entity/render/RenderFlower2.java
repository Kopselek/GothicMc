package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower2;
import gothickopselek.entity.model.ModelFlower2;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower2 extends RenderLiving<EntityFlower2>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower2.png");
	
	public RenderFlower2(RenderManager manager)
	{
		super(manager, new ModelFlower2(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower2 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower2 entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}