package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityScierwojad;
import gothickopselek.entity.model.ModelScierwojad;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScierwojad extends RenderLiving<EntityScierwojad>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Scierwojad.png");
	
	public RenderScierwojad(RenderManager manager)
	{
		super(manager, new ModelScierwojad(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityScierwojad entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityScierwojad entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
