package pro.rajce.recruitmentplugin.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerLoadEvent;

public class ServerListener implements Listener {
    @EventHandler
    public void onServerLoad(ServerLoadEvent event) {
        System.out.println("Server has been loaded!");
    }
}
