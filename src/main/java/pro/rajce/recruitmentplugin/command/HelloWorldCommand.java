package pro.rajce.recruitmentplugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pro.rajce.recruitmentplugin.util.MyBeautifulUtil;

public class HelloWorldCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(MyBeautifulUtil.getHelloWorldString());
        return false;
    }
}
