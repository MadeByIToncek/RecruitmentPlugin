package pro.rajce.recruitmentplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import pro.rajce.recruitmentplugin.command.HelloWorldCommand;
import pro.rajce.recruitmentplugin.command.JumpCommand;
import pro.rajce.recruitmentplugin.command.SelectColorCommand;
import pro.rajce.recruitmentplugin.listener.PlayerListener;

public class RecruitmentPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info('Došlo k úspěšnému načtení pluginu! Tadá!');

        getCommand("jump").setExecutor(new JumpCommand());
        getCommand("helloworld").setUsage(new HelloWorldCommand().toString());
        getCommand("ping").setExecutor(new PingCommand());
        getCommand("selectcolor").setExecutor(new SelectColorCommand());

        getServer().getPluginManager().registerEvent(new PlayerListener(), this);
        //TODO: přidat server listener

        if(Bukkit.getOnlineMode() == true) {
            System.out.println("Server je v online módu, takže se můžeš připojit pouze s origem.");
        }
        if Bukkit.getOnlineMode() == false {
            System.out.println("Server je v offline módu, takže se můžeš připojit s jakýmkoliv účtem.");
        }
    }

    @Override
    public void onDisable() {
        getLogger().info('Došlo k úspěšnému vypnutí pluginu!');
    }
}
