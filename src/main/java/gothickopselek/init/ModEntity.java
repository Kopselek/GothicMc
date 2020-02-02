package gothickopselek.init;

import gothickopselek.Main;
import gothickopselek.Reference;
import gothickopselek.entity.EntityKretoszczur;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntity 
{
	public static void registerEntities()
	{
		registerEntity("Kretoszczur", EntityKretoszczur.class, Reference.ENTITY_KRETOSZCZUR, 50, 11437146, 000000);
	}
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.modID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
