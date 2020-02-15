package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityCieniostwor;
import gothickopselek.entity.model.ModelCieniostwor;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCieniostwor extends RenderLiving<EntityCieniostwor>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Cieniostwor.png");
	
	public RenderCieniostwor(RenderManager manager)
	{
		super(manager, new ModelCieniostwor(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityCieniostwor entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityCieniostwor entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
