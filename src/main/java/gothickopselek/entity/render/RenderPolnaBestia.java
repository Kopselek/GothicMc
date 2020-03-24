package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityPolnaBestia;
import gothickopselek.entity.model.ModelPolnaBestia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPolnaBestia extends RenderLiving<EntityPolnaBestia>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/PolnaBestia.png");
	
	public RenderPolnaBestia(RenderManager manager)
	{
		super(manager, new ModelPolnaBestia(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityPolnaBestia entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityPolnaBestia entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
