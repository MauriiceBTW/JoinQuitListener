package me.maurice.joinquitplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinQuitPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new JoinQuitPlugin(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
