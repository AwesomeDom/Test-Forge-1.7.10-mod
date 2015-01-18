package awesomedom.mods.heroitems.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLoader {
	
	public static Item ItemGem;
	
    public static void load()
    {
    	ItemGem = new ItemGem();
    	
    	GameRegistry.registerItem(ItemGem, "BeepBoop_testItem");
    }

}
