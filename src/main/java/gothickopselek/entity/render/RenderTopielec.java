package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityTopielec;
import gothickopselek.entity.model.ModelTopielec;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTopielec extends RenderLiving<EntityTopielec>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Topielec.png");
	
	public RenderTopielec(RenderManager manager)
	{
		super(manager, new ModelTopielec(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityTopielec entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityTopielec entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}