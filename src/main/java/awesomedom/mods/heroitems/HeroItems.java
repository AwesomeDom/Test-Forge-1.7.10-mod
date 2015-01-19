package awesomedom.mods.heroitems;

import awesomedom.mods.heroitems.items.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = HeroItems.MODID, version = HeroItems.VERSION, dependencies = "required-after:Baubles")
public class HeroItems
{
    public static final String MODID = "Super Minecraft Items";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemLoader.load();

    }
    
    public static CreativeTabs tabSuperMC = new CreativeTabs("SuperMC") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return ItemLoader.gemReality;
        }
    };
}
