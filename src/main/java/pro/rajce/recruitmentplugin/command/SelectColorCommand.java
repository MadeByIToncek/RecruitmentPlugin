package pro.rajce.recruitmentplugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pro.rajce.recruitmentplugin.util.MyBeautifulColor;

import java.util.Random;

/**
 * Command executor for executing /selectcolor command
 */
public class SelectColorCommand implements CommandExecutor {
    /**
     * List of colors
     */
    MyBeautifulColor[] colors;
    
    /**
     * Constructor for this class
     * @param colors List of colors
     */
    public SelectColorCommand(MyBeautifulColor[] colors) {
        this.colors = colors;
    }
    
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
        Random random = new Random();
        MyBeautifulColor myBeautifulColor = colors[random.nextInt(colors.length)];
        sender.sendMessage("Vybral jsem náhodnou barvu: " + myBeautifulColor.name());
        return true;
    }
}
