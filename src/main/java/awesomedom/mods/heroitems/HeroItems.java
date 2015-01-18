package awesomedom.mods.heroitems;

import awesomedom.mods.heroitems.items.ItemLoader;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = HeroItems.MODID, version = HeroItems.VERSION)
public class HeroItems
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemLoader.load();

    }
}
