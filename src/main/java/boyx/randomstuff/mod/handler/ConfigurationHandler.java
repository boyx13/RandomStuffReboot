package boyx.randomstuff.mod.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static void init(File configFile) {
		
		Configuration configuration = new Configuration(configFile);
		
		try {
			configuration.load();
			}catch(Exception e) {
				
			}finally {
				configuration.save();
			}
	}

}
