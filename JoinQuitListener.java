package me.maurice.joinquitplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitListener implements Listener {
    
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (e.getPlayer().getName().equalsIgnoreCase("MainAccGotHacked"))
            e.setJoinMessage("§8[§a+§8] §c" + e.getPlayer().getName());
        else
            e.setJoinMessage("§8[§a+§8] §7" + e.getPlayer().getName());
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        if (e.getPlayer().getName().equalsIgnoreCase("MainAccGotHacked"))
            e.setQuitMessage("§8[§c-§8] §c" + e.getPlayer().getName());
        else
            e.setQuitMessage("§8[§c-§8] §7" + e.getPlayer().getName());
    }
}
