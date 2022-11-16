package pro.rajce.recruitmentplugin.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

/**
 * Listener for player events
 */
public class PlayerListener implements Listener {
    /**
     * Triggers when bed is entered
     */
    @EventHandler
    public void onBedEnter(PlayerBedEnterEvent event) {
        event.getPlayer().sendMessage("Chceš jít spát? Dobře tedy.");
    }
    /**
     * Triggers when bed is left
     */
    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent event) {
        event.getPlayer().sendMessage("Snad se ti hezky leželo");
    }


}
