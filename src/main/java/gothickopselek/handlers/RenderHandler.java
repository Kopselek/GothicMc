package gothickopselek.handlers;

import gothickopselek.entity.EntityKretoszczur;
import gothickopselek.entity.EntityScierwojad;
import gothickopselek.entity.render.RenderKretoszczur;
import gothickopselek.entity.render.RenderScierwojad;
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
		RenderingRegistry.registerEntityRenderingHandler(EntityScierwojad.class, new IRenderFactory<EntityScierwojad>()
		{

			@Override
			public Render<? super EntityScierwojad> createRenderFor(RenderManager manager) 
			{
				return new RenderScierwojad(manager);
			}
			
		});
	}
}

