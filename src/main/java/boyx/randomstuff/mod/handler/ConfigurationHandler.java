package boyx.randomstuff.mod.handler;

import java.io.File;

import boyx.randomstuff.mod.util.Log;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static void init(File configFile) {
		
		Configuration configuration = new Configuration(configFile);
		boolean configValue = false;
		
		try {
			configuration.load();
			configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example").getBoolean(true);
			}catch(Exception e) {
				Log.error("Config File Error");
			}finally {
				configuration.save();
				Log.info("Config Loaded!");
			}
	}

}
