package gothickopselek.handlers;

import gothickopselek.entity.EntityCieniostwor;
import gothickopselek.entity.EntityFlower1;
import gothickopselek.entity.EntityFlower10;
import gothickopselek.entity.EntityFlower11;
import gothickopselek.entity.EntityFlower12;
import gothickopselek.entity.EntityFlower2;
import gothickopselek.entity.EntityFlower3;
import gothickopselek.entity.EntityFlower4;
import gothickopselek.entity.EntityFlower5;
import gothickopselek.entity.EntityFlower6;
import gothickopselek.entity.EntityFlower7;
import gothickopselek.entity.EntityFlower8;
import gothickopselek.entity.EntityFlower9;
import gothickopselek.entity.EntityGoblin;
import gothickopselek.entity.EntityGoblin2;
import gothickopselek.entity.EntityKretoszczur;
import gothickopselek.entity.EntityPolnaBestia;
import gothickopselek.entity.EntityScierwojad;
import gothickopselek.entity.EntityTopielec;
import gothickopselek.entity.EntityWarg;
import gothickopselek.entity.EntityWilk;
import gothickopselek.entity.EntityZebacz;
import gothickopselek.entity.render.RenderCieniostwor;
import gothickopselek.entity.render.RenderFlower1;
import gothickopselek.entity.render.RenderFlower10;
import gothickopselek.entity.render.RenderFlower11;
import gothickopselek.entity.render.RenderFlower12;
import gothickopselek.entity.render.RenderFlower2;
import gothickopselek.entity.render.RenderFlower3;
import gothickopselek.entity.render.RenderFlower4;
import gothickopselek.entity.render.RenderFlower5;
import gothickopselek.entity.render.RenderFlower6;
import gothickopselek.entity.render.RenderFlower7;
import gothickopselek.entity.render.RenderFlower8;
import gothickopselek.entity.render.RenderFlower9;
import gothickopselek.entity.render.RenderGoblin;
import gothickopselek.entity.render.RenderGoblin2;
import gothickopselek.entity.render.RenderKretoszczur;
import gothickopselek.entity.render.RenderPolnaBestia;
import gothickopselek.entity.render.RenderScierwojad;
import gothickopselek.entity.render.RenderTopielec;
import gothickopselek.entity.render.RenderWarg;
import gothickopselek.entity.render.RenderWilk;
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
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower8.class, new IRenderFactory<EntityFlower8>()
		{

			@Override
			public Render<? super EntityFlower8> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower8(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower9.class, new IRenderFactory<EntityFlower9>()
		{

			@Override
			public Render<? super EntityFlower9> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower9(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower10.class, new IRenderFactory<EntityFlower10>()
		{

			@Override
			public Render<? super EntityFlower10> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower10(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower11.class, new IRenderFactory<EntityFlower11>()
		{

			@Override
			public Render<? super EntityFlower11> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower11(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower12.class, new IRenderFactory<EntityFlower12>()
		{

			@Override
			public Render<? super EntityFlower12> createRenderFor(RenderManager manager) 
			{
				return new RenderFlower12(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityGoblin.class, new IRenderFactory<EntityGoblin>()
		{

			@Override
			public Render<? super EntityGoblin> createRenderFor(RenderManager manager) 
			{
				return new RenderGoblin(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityGoblin2.class, new IRenderFactory<EntityGoblin2>()
		{

			@Override
			public Render<? super EntityGoblin2> createRenderFor(RenderManager manager) 
			{
				return new RenderGoblin2(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityWilk.class, new IRenderFactory<EntityWilk>()
		{

			@Override
			public Render<? super EntityWilk> createRenderFor(RenderManager manager) 
			{
				return new RenderWilk(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPolnaBestia.class, new IRenderFactory<EntityPolnaBestia>()
		{

			@Override
			public Render<? super EntityPolnaBestia> createRenderFor(RenderManager manager) 
			{
				return new RenderPolnaBestia(manager);
			}
			
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityWarg.class, new IRenderFactory<EntityWarg>()
		{

			@Override
			public Render<? super EntityWarg> createRenderFor(RenderManager manager) 
			{
				return new RenderWarg(manager);
			}
			
		});
	}
}

