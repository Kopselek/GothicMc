package gothickopselek.entity.render;

import gothickopselek.Reference;
import gothickopselek.entity.EntityGoblin2;
import gothickopselek.entity.model.ModelGoblin2;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGoblin2 extends RenderLiving<EntityGoblin2>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modID + ":textures/entity/Goblin2.png");
	
	public RenderGoblin2(RenderManager manager)
	{
		super(manager, new ModelGoblin2(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityGoblin2 entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityGoblin2 entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
