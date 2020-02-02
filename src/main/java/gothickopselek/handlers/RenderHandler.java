package gothickopselek.handlers;

import gothickopselek.entity.EntityKretoszczur;
import gothickopselek.entity.render.RenderKretoszczur;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityKretoszczur.class, new IRenderFactory<EntityKretoszczur>()
		{

			@Override
			public Render<? super EntityKretoszczur> createRenderFor(RenderManager manager) 
			{
				return new RenderKretoszczur(manager);
			}
			
		});
	}
}

