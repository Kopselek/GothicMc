package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower8;
import gothickopselek.entity.model.ModelFlower8;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower8 extends RenderLiving<EntityFlower8>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower8.png");
	
	public RenderFlower8(RenderManager manager)
	{
		super(manager, new ModelFlower8(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower8 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower8 entityLiving, float p_88043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_88043_2_, rotationYaw, partialTicks);
	}
}
