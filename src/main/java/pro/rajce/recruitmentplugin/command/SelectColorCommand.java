package pro.rajce.recruitmentplugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pro.rajce.recruitmentplugin.util.MyBeautifulColor;

public class SelectColorCommand implements CommandExecutor {

    MyBeautifulColor[] colors;

    private SelectColorCommand(MyBeautifulColor[] colors) {
        this.colors = colors;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        MyBeautifulColor myBeautifulColor = colors[random.nextInt(colors.length)];
        sender.sendMessage("Vybral jsem náhodnou barvu: " + myBeautifulColor.name());
        return false;
    }
}
