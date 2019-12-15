package boyx.randomstuff.mod.init;

import boyx.randomstuff.mod.item.ItemClass;
import boyx.randomstuff.mod.item.items.ItemTester;
import boyx.randomstuff.mod.util.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModItems {
	
	public static final ItemClass tester = new ItemTester();
	
	public static void init(){
		
		GameRegistry.registerItem(tester, "Tester");
	}

}
