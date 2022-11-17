package pro.rajce.recruitmentplugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
/**
 * Command executor for executing /ping command
 */
public class PingCommand implements CommandExecutor {
    /**
     * Command handler
     * @param sender Source of the command
     * @param command Command which was executed
     * @param label Alias of the command which was used
     * @param args Passed command arguments
     * @return true if command passed successfully
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            // ENHANCEMENT: player variable is now inline
            player.sendMessage("Tvůj ping je &a" + player.getPing() + "ms");
        }

        return true;
    }
}
