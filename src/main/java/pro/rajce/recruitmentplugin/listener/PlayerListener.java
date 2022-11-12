package pro.rajce.recruitmentplugin.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.net.http.WebSocket.Listener;

public class PlayerListener implements Listener {

    @EventHandler
    public void onBedEnter(PlayerBedEnterEvent event) {
        event.getPlayer().sendMessage("Chceš jít spát? Dobře tedy.");
    }

    public void onBedLeave(PlayerBedLeaveEvent event) {
        event.getPlayer().sendMessage("Snad se ti hezky leželo");
    }


}
