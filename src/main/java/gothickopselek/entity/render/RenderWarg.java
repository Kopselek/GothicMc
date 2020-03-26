package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityWarg;
import gothickopselek.entity.model.ModelWarg;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWarg extends RenderLiving<EntityWarg>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Warg.png");
	
	public RenderWarg(RenderManager manager)
	{
		super(manager, new ModelWarg(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityWarg entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityWarg entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
