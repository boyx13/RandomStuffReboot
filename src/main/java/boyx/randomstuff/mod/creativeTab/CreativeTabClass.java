package boyx.randomstuff.mod.creativeTab;

import boyx.randomstuff.mod.init.ModItems;
import boyx.randomstuff.mod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabClass {
	
	public static final CreativeTabs RSReboot_TAB = new CreativeTabs(Reference.MODID.toLowerCase()) {

		@Override
		public Item getTabIconItem() {
			return ModItems.tester;
		}	
	};
}
