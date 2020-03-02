package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower12;
import gothickopselek.entity.model.ModelFlower12;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower12 extends RenderLiving<EntityFlower12>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower12.png");
	
	public RenderFlower12(RenderManager manager)
	{
		super(manager, new ModelFlower12(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower12 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower12 entityLiving, float p_1212043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_1212043_2_, rotationYaw, partialTicks);
	}
}
