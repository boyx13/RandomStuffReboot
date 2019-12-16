package boyx.randomstuff.mod.init;

import boyx.randomstuff.mod.block.BlockClass;
import boyx.randomstuff.mod.block.blocks.BlockBrightStone;
import boyx.randomstuff.mod.util.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModBlocks {
	
	public static final BlockClass brightStone = new BlockBrightStone();
		
	public static void init() {	
		
		GameRegistry.registerBlock(brightStone, "brightStone");
	}
}
