package gothickopselek.init;

import java.util.ArrayList;
import java.util.List;

import gothickopselek.items.ItemBase;
import gothickopselek.items.food.FoodEffectBase;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	public static final Item Fag = new FoodEffectBase("fag", 0, 10.0F, false, new PotionEffect(ModPotion.Fag_Effect, 4*(60 * 20), 0, false, false));
	public static final Item beer = new FoodEffectBase("beer", 0, 2.0F, false, new PotionEffect(ModPotion.beer_Effect, 4*(60 * 20), 0, false, true));
	
	public static final Item Coin_silver = new ItemBase("coin_silver");
	public static final Item Coin_gold = new ItemBase("coin_gold");
	public static final Item Coin_bronze = new ItemBase("coin_bronze");
	
	public static final Item Picklock = new ItemBase("picklock");
}
