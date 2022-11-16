package pro.rajce.recruitmentplugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pro.rajce.recruitmentplugin.util.MyBeautifulUtil;
/**
 * Command executor for executing /helloworld command
 */
public class HelloWorldCommand implements CommandExecutor {
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
        sender.sendMessage(MyBeautifulUtil.getHelloWorldString());
        return false;
    }
}
