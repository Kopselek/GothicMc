package gothickopselek.handlers;

import gothickopselek.entity.EntityCieniostwor;
import gothickopselek.entity.EntityFlower1;
import gothickopselek.entity.EntityFlower2;
import gothickopselek.entity.EntityFlower3;
import gothickopselek.entity.EntityFlower4;
import gothickopselek.entity.EntityFlower5;
import gothickopselek.entity.EntityFlower6;
import gothickopselek.entity.EntityFlower7;
import gothickopselek.entity.EntityKretoszczur;
import gothickopselek.entity.EntityScierwojad;
import gothickopselek.entity.EntityTopielec;
import gothickopselek.entity.EntityZebacz;
import gothickopselek.entity.render.RenderCieniostwor;
import gothickopselek.entity.render.RenderFlower1;
import gothickopselek.entity.render.RenderFlower2;
import gothickopselek.entity.render.RenderFlower3;
import gothickopselek.entity.render.RenderFlower4;
import gothickopselek.entity.render.RenderFlower5;
import gothickopselek.entity.render.RenderFlower6;
import gothickopselek.entity.render.RenderFlower7;
import gothickopselek.entity.render.RenderKretoszczur;
import gothickopselek.entity.render.RenderScierwojad;
import gothickopselek.entity.render.RenderTopielec;
import gothickopselek.entity.render.RenderZebacz;
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
		RenderingRegistry.registerEntityRenderingHandler(EntityCieniostwor.class, new IRenderFactory<EntityCieniostwor>()
		{

			@Override
			public Render<? super EntityCieniostwor> createRenderFor(RenderManager manager) 
			{
				return new RenderCieniostwor(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTopielec.class, new IRenderFactory<EntityTopielec>()
		{

			@Override
			public Render<? super EntityTopielec> createRenderFor(RenderManager manager) 
			{
				return new RenderTopielec(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityZebacz.class, new IRenderFactory<EntityZebacz>()
		{

			@Override
			public Render<? super EntityZebacz> createRenderFor(RenderManager manager) 
			{
				return new RenderZebacz(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower1.class, new IRenderFactory<EntityFlower1>()
		{

			@Override
			public Render<? super EntityFlower1> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower1(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower2.class, new IRenderFactory<EntityFlower2>()
		{

			@Override
			public Render<? super EntityFlower2> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower2(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower3.class, new IRenderFactory<EntityFlower3>()
		{

			@Override
			public Render<? super EntityFlower3> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower3(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower4.class, new IRenderFactory<EntityFlower4>()
		{

			@Override
			public Render<? super EntityFlower4> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower4(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower5.class, new IRenderFactory<EntityFlower5>()
		{

			@Override
			public Render<? super EntityFlower5> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower5(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower6.class, new IRenderFactory<EntityFlower6>()
		{

			@Override
			public Render<? super EntityFlower6> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower6(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower7.class, new IRenderFactory<EntityFlower7>()
		{

			@Override
			public Render<? super EntityFlower7> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower7(manager);
			}
			
		});
	}
}

