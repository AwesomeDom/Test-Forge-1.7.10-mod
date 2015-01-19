package awesomedom.mods.heroitems.items;

import awesomedom.mods.heroitems.Dictionary;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemLoader {
	
	public static Item gemSpace;
	public static Item gemSoul;
	public static Item gemReality;
	public static Item gemTime;
	public static Item gemPower;
	public static Item gemMind;
	
    public static void load()
    {
    	gemSpace = new GemSpace();
    	gemSoul = new GemSoul();
    	gemReality = new GemReality();
    	gemTime = new GemTime();
    	gemPower = new GemPower();
    	gemMind = new GemMind();
    	
    	GameRegistry.registerItem(gemSpace, Dictionary.GEM_SPACE);
    	GameRegistry.registerItem(gemSoul, Dictionary.GEM_SOUL);
    	GameRegistry.registerItem(gemReality, Dictionary.GEM_REALITY);
    	GameRegistry.registerItem(gemTime, Dictionary.GEM_TIME);
    	GameRegistry.registerItem(gemPower, Dictionary.GEM_POWER);
    	GameRegistry.registerItem(gemMind, Dictionary.GEM_MIND);
    }

}
