package pro.rajce.recruitmentplugin.command;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

import static pro.rajce.recruitmentplugin.RecruitmentPlugin.config;

/**
 * Command executor for executing /spawn command
 */
public class SpawnCommand implements CommandExecutor {
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
        if (sender instanceof Player) {
            String[] coords = Objects.requireNonNull(config.getString("spawn")).split("\\r?,");
            ((Player) sender).teleport(new Location(Bukkit.getWorld(coords[0]), Double.parseDouble(coords[1]), Double.parseDouble(coords[2]), Double.parseDouble(coords[3])));
        }
        return true;
    }
}
