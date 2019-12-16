package boyx.randomstuff.mod.handler;

import java.io.File;

import boyx.randomstuff.mod.util.Log;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static int testStackSize = 1;
	
	public static void init(File configFile) {
		
		Configuration configuration = new Configuration(configFile);
		boolean configValue = false;
		
		try {
			configuration.load();
			configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example").getBoolean(true);
			testStackSize = configuration.get("StackSize", "testStackSize", 1, "StackSize of the Item Tester").getInt(1);
			}catch(Exception e) {
				Log.error("Config File Error");
			}finally {
				configuration.save();
				Log.info("Config Loaded!");
			}
	}

}
