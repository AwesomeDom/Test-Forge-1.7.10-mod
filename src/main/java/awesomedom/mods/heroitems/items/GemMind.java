package awesomedom.mods.heroitems.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import awesomedom.mods.heroitems.Dictionary;
import awesomedom.mods.heroitems.HeroItems;
import baubles.api.BaubleType;
import baubles.api.BaublesApi;
import baubles.api.IBauble;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GemMind extends Item implements IBauble {

    
    public GemMind() {
    	setMaxStackSize(1);
        setCreativeTab(HeroItems.tabSuperMC);
        setUnlocalizedName(Dictionary.MOD_ID + ":" + Dictionary.GEM_MIND);
	}

	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister register)
    {
        this.itemIcon = register.registerIcon(Dictionary.MOD_ID + ":" + Dictionary.GEM_MIND);
    }
	
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            if (BaublesApi.getBaubles(player).getStackInSlot(1) == null)
            {
                BaublesApi.getBaubles(player).setInventorySlotContents(1, itemStack);
                player.inventory.getCurrentItem().stackSize = 0;
            } else if (BaublesApi.getBaubles(player).getStackInSlot(2) == null) {
                BaublesApi.getBaubles(player).setInventorySlotContents(2, itemStack);
                player.inventory.getCurrentItem().stackSize = 0;
            }

            else
            {
                return itemStack;
            }
        }

        return itemStack;
    }
    
    @Override
    public void onEquipped(ItemStack itemStack, EntityLivingBase entity)
    {
        if (!entity.worldObj.isRemote)
        {
            entity.worldObj.playSoundAtEntity(entity, "random.pop", 0.1F, 1.3F);
        }
    }

    @Override
    public void onUnequipped(ItemStack itemStack, EntityLivingBase entity)
    {
        if (!entity.worldObj.isRemote)
        {
            entity.worldObj.playSoundAtEntity(entity, "random.fizz", 0.1F, 1.3F);
        }
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemStack)
    {
        return BaubleType.RING;
    }

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
	}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		// TODO Auto-generated method stub
		return true;
	}

}