package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower9;
import gothickopselek.entity.model.ModelFlower9;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower9 extends RenderLiving<EntityFlower9>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower9.png");
	
	public RenderFlower9(RenderManager manager)
	{
		super(manager, new ModelFlower9(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower9 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower9 entityLiving, float p_99043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_99043_2_, rotationYaw, partialTicks);
	}
}
