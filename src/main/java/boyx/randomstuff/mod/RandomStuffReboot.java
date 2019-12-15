package boyx.randomstuff.mod;

import boyx.randomstuff.mod.handler.ConfigurationHandler;
import boyx.randomstuff.mod.init.ModBlocks;
import boyx.randomstuff.mod.proxy.CommonProxy;
import boyx.randomstuff.mod.util.Log;
import boyx.randomstuff.mod.util.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class RandomStuffReboot {
	@Mod.Instance(Reference.MODID)
	public static RandomStuffReboot instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preInit) {
		ConfigurationHandler.init(preInit.getSuggestedConfigurationFile());
		ModBlocks.init();
		proxy.preInit();
		Log.info("PreInit Complete");
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent init) {
		proxy.init();
		Log.info("Init Complete");
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postInit) {
		proxy.postInit();
		Log.info("PostInit Complete");
	}

}
