package boyx.randomstuff.mod.block;

import boyx.randomstuff.mod.creativeTab.CreativeTabClass;
import boyx.randomstuff.mod.util.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockClass extends Block{
	
	public BlockClass(Material material) {
		super(material);
	}
	
	public BlockClass() {
		this(Material.rock);
		this.setCreativeTab(CreativeTabClass.RSReboot_TAB);
	}

	@Override
	public String getUnlocalizedName() {
		
		return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
		
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		
		return unlocalizedName.substring(unlocalizedName.indexOf(".") +1);
		
	}
}

