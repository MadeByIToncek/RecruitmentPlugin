package pro.rajce.recruitmentplugin.command;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Command executor for executing /kosmonaut command
 */
public class KosmonautCommand implements CommandExecutor {
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
        if(sender instanceof Player player) {
            player.getInventory().setHelmet(new ItemStack(Material.GLASS));
            player.sendMessage(ChatColor.GREEN + "Stal se z tebe kosmonaut!");
        }
        return true;
    }
}
