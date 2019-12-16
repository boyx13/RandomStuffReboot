 package boyx.randomstuff.mod.block.blocks;

import boyx.randomstuff.mod.block.BlockClass;

public class BlockBrightStone extends BlockClass{
	
	public BlockBrightStone() {
		super();
		this.setBlockName("brightStone");
		this.setBlockTextureName("brightStone");
		this.setLightLevel(3.0F);
		this.setHardness(0.3F);
		this.setStepSound(soundTypeGlass);
	}
}
