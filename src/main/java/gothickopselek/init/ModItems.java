package gothickopselek.init;

import java.util.ArrayList;
import java.util.List;

import gothickopselek.Reference;
import gothickopselek.items.ItemBase;
import gothickopselek.items.armor.ArmorBase;
import gothickopselek.items.food.FoodEffectBase;
import gothickopselek.items.tools.ToolSword;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	public static final Item Fag = new FoodEffectBase("fag", 0, 10.0F, false, new PotionEffect(ModPotion.Fag_Effect, 4*(60 * 20), 0, false, false));
	public static final Item beer = new FoodEffectBase("beer", 0, 2.0F, false, new PotionEffect(ModPotion.beer_Effect, 4*(60 * 20), 0, false, true));
	
	public static final Item Coin_silver = new ItemBase("coin_silver");
	public static final Item Coin_gold = new ItemBase("coin_gold");
	public static final Item Coin_bronze = new ItemBase("coin_bronze");
	
	public static final Item Picklock = new ItemBase("picklock");
	
	public static final Item gin = new FoodEffectBase("gin", 0, 2.0F, false, new PotionEffect(ModPotion.beer_Effect, 4*(60 * 20), 0, false, true));
	public static final Item ryzowka = new FoodEffectBase("ryzowka", 0, 2.0F, false, new PotionEffect(ModPotion.beer_Effect, 4*(60 * 20), 0, false, true));
	public static final Item wine = new FoodEffectBase("wine", 0, 4.0F, false, new PotionEffect(ModPotion.beer_Effect, 4*(60 * 20), 0, false, true));
	public static final Item wine2 = new FoodEffectBase("wine2", 0, 4.0F, false, new PotionEffect(ModPotion.beer_Effect, 4*(60 * 20), 0, false, true));
	
	public static final Item lute = new ItemBase("lute");
	
	public static final Item dice = new ItemBase("dice");
	
	public static final ArmorMaterial MASK_MATERIAL = EnumHelper.addArmorMaterial("mask_material", Reference.modID + ":mask", 5, new int[] {0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static final Item Mask = new ArmorBase("mask", MASK_MATERIAL, 1, EntityEquipmentSlot.HEAD);
	
	public static final ToolMaterial BANDAGGER_MATERIAL = EnumHelper.addToolMaterial("bandagger_material", 3, 5000, 8.0F, 3.5F, 10);
	public static final ItemSword bandagger = new ToolSword("bandagger", BANDAGGER_MATERIAL);
	public static final Item banarrow = new ItemBase("banarrow");
	
	
	public static final ArmorMaterial LINE_BAG_MATERIAL = EnumHelper.addArmorMaterial("line_bag_material", Reference.modID + ":line_bag", 5, new int[] {0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static final Item line_bag = new ArmorBase("line_bag", LINE_BAG_MATERIAL, 1, EntityEquipmentSlot.HEAD);
}
