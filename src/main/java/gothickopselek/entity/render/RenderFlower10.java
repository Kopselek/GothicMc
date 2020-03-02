package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityFlower10;
import gothickopselek.entity.model.ModelFlower10;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlower10 extends RenderLiving<EntityFlower10>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Flower10.png");
	
	public RenderFlower10(RenderManager manager)
	{
		super(manager, new ModelFlower10(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityFlower10 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityFlower10 entityLiving, float p_1010043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_1010043_2_, rotationYaw, partialTicks);
	}
}