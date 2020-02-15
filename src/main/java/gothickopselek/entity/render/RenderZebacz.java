package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityZebacz;
import gothickopselek.entity.model.ModelZebacz;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZebacz extends RenderLiving<EntityZebacz>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Zebacz.png");
	
	public RenderZebacz(RenderManager manager)
	{
		super(manager, new ModelZebacz(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityZebacz entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityZebacz entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}