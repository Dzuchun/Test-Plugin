package dzuchun.paper.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {

	@Override
	public void onLoad() {
		System.out.println("TestPlugin greets you. This message means, that it functions properly.");
		// TODO enable
	}

	@Override
	public void onDisable() {
		// TODO disable
	}

}
