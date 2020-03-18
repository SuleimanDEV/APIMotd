package me.suleimanmotd;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SuleiMain extends JavaPlugin implements Listener{
	
	public static SuleiMain instance;
	public static SuleiMain getInstance() {
		return instance;
	}
	
	@Override
	public void onEnable() {
		instance = this;
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	private void motd(ServerListPingEvent e) {
		e.setMaxPlayers(2020);
		e.setMotd("           §6§lSULEI PLUGINS §7| §floja.suleiman.com\n        §aR. SULEI: §e§lNOVO! §fSistema de Spawners!");
	}
	
}
