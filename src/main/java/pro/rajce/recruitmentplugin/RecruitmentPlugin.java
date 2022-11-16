package pro.rajce.recruitmentplugin;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import pro.rajce.recruitmentplugin.command.*;
import pro.rajce.recruitmentplugin.listener.PlayerListener;
import pro.rajce.recruitmentplugin.listener.ServerListener;
import pro.rajce.recruitmentplugin.util.MyBeautifulColor;

/**
 * Main class of Recruitment plugin
 */
public class RecruitmentPlugin extends JavaPlugin implements Listener {
    public static FileConfiguration config;
    /**
     * Primary function called when enabling the plugin.
     */
    @Override
    public void onEnable() {
        saveDefaultConfig();
        config = getConfig();
        getLogger().info("Došlo k úspěšnému načtení pluginu! Tadá!");

        getCommand("jump").setExecutor(new JumpCommand());
        getCommand("helloworld").setUsage(new HelloWorldCommand().toString());
        getCommand("ping").setExecutor(new PingCommand());
        getCommand("selectcolor").setExecutor(new SelectColorCommand(MyBeautifulColor.values()));
        getCommand("spawn").setExecutor(new SpawnCommand());

        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        getServer().getPluginManager().registerEvents(new ServerListener(), this);

        if(Bukkit.getOnlineMode()) {
            System.out.println("Server je v online módu, takže se můžeš připojit pouze s origem.");
        } else {
            System.out.println("Server je v offline módu, takže se můžeš připojit s jakýmkoliv účtem.");
        }
    }
    /**
     * Primary function called when disabling the plugin.
     */
    @Override
    public void onDisable() {
        getLogger().info("Došlo k úspěšnému vypnutí pluginu!");
    }
}
