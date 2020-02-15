package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower3;
import gothickopselek.entity.model.ModelFlower3;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower3 extends RenderLiving<EntityFlower3>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower3.png");
	
	public RenderFlower3(RenderManager manager)
	{
		super(manager, new ModelFlower3(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower3 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower3 entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}