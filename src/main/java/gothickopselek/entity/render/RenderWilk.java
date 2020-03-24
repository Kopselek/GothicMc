package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityWilk;
import gothickopselek.entity.model.ModelWilk;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWilk extends RenderLiving<EntityWilk>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Wilk.png");
	
	public RenderWilk(RenderManager manager)
	{
		super(manager, new ModelWilk(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityWilk entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityWilk entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
