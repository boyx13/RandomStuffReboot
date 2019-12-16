package boyx.randomstuff.mod.item.items;

import boyx.randomstuff.mod.handler.ConfigurationHandler;
import boyx.randomstuff.mod.item.ItemClass;
import boyx.randomstuff.mod.util.Reference;
import net.minecraft.item.ItemStack;

public class ItemTester extends ItemClass{
	
	public ItemTester() {
		super();
		this.setMaxStackSize(ConfigurationHandler.testStackSize);
		this.setUnlocalizedName("tester");
	}
}
