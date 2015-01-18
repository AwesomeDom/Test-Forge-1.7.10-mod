package AwesomeDom.mods.BeepBoop.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import baubles.api.BaubleType;
import baubles.api.BaublesApi;
import baubles.api.IBauble;

public class itemGem extends Item {

    public itemGem() {
        maxStackSize = 1;
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("genericItem");
    }
	
}

