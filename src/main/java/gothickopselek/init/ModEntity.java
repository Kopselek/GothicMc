package gothickopselek.init;

import gothickopselek.Main;
import gothickopselek.Reference;
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
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntity 
{
	public static void registerEntities()
	{
		registerEntity("Kretoszczur", EntityKretoszczur.class, Reference.ENTITY_KRETOSZCZUR, 50, 11437146, 000000);
		registerEntity("Scierwojad", EntityScierwojad.class, Reference.ENTITY_SCIERWOJAD, 50, 000000, 11437146);
		registerEntity("Cieniostwor", EntityCieniostwor.class, Reference.ENTITY_CIENIOSTWOR, 50, 000000, 10012956);
		registerEntity("Topielec", EntityTopielec.class, Reference.ENTITY_TOPIELEC, 50, 10012956, 000000);
		registerEntity("Zebacz", EntityZebacz.class, Reference.ENTITY_ZEBACZ, 50, 10012956, 23423477);
		
		registerEntity("Flower1", EntityFlower1.class, Reference.ENTITY_FLOWER1, 50, 000000, 000000);
		registerEntity("Flower2", EntityFlower2.class, Reference.ENTITY_FLOWER2, 50, 000000, 000000);
		registerEntity("Flower3", EntityFlower3.class, Reference.ENTITY_FLOWER3, 50, 000000, 000000);
		registerEntity("Flower4", EntityFlower4.class, Reference.ENTITY_FLOWER4, 50, 000000, 000000);
		registerEntity("Flower5", EntityFlower5.class, Reference.ENTITY_FLOWER5, 50, 000000, 000000);
		registerEntity("Flower6", EntityFlower6.class, Reference.ENTITY_FLOWER6, 50, 000000, 000000);
		registerEntity("Flower7", EntityFlower7.class, Reference.ENTITY_FLOWER7, 50, 000000, 000000);
		registerEntity("Flower8", EntityFlower8.class, Reference.ENTITY_FLOWER8, 50, 000000, 000000);
		registerEntity("Flower9", EntityFlower9.class, Reference.ENTITY_FLOWER9, 50, 000000, 000000);
		registerEntity("Flower10", EntityFlower10.class, Reference.ENTITY_FLOWER10, 50, 000000, 000000);
		registerEntity("Flower11", EntityFlower11.class, Reference.ENTITY_FLOWER11, 50, 000000, 000000);
		registerEntity("Flower12", EntityFlower12.class, Reference.ENTITY_FLOWER12, 50, 000000, 000000);
		
		registerEntity("Goblin", EntityGoblin.class, Reference.ENTITY_GOBLIN, 50, 23423477, 10012956);
		registerEntity("Goblin2", EntityGoblin2.class, Reference.ENTITY_GOBLIN2, 50, 23423477, 100352956);
		
		registerEntity("Wilk", EntityWilk.class, Reference.ENTITY_WILK, 50, 23454477, 10012956);
		registerEntity("PolnaBestia", EntityPolnaBestia.class, Reference.ENTITY_POLNABESTIA, 50, 23426577, 120553956);
		registerEntity("Warg", EntityWarg.class, Reference.ENTITY_WARG, 50, 120553956, 23426577);
	}
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.modID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
