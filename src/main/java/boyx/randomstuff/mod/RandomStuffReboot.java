package boyx.randomstuff.mod;

import boyx.randomstuff.mod.proxy.CommonProxy;
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
		proxy.preInit();
		System.out.println("lol");
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent init) {
		proxy.init();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postInit) {
		proxy.postInit();
	}

}
