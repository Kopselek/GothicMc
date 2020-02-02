package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityKretoszczur;
import gothickopselek.entity.model.ModelKretoszczur;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKretoszczur extends RenderLiving<EntityKretoszczur>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Kretoszczur.png");
	
	public RenderKretoszczur(RenderManager manager)
	{
		super(manager, new ModelKretoszczur(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityKretoszczur entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityKretoszczur entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
