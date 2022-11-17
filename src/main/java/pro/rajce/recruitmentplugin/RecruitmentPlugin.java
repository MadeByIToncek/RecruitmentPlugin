package pro.rajce.recruitmentplugin;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import pro.rajce.recruitmentplugin.command.*;
import pro.rajce.recruitmentplugin.listener.PlayerListener;
import pro.rajce.recruitmentplugin.listener.ServerListener;
import pro.rajce.recruitmentplugin.util.MyBeautifulColor;

import java.util.Objects;

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
    
    
        // ENHANCEMENT: added check for null value of commands
        Objects.requireNonNull(getCommand("jump")).setExecutor(new JumpCommand());
        Objects.requireNonNull(getCommand("helloworld")).setUsage(new HelloWorldCommand().toString());
        Objects.requireNonNull(getCommand("ping")).setExecutor(new PingCommand());
        Objects.requireNonNull(getCommand("selectcolor")).setExecutor(new SelectColorCommand(MyBeautifulColor.values()));
        Objects.requireNonNull(getCommand("spawn")).setExecutor(new SpawnCommand());
        Objects.requireNonNull(getCommand("raketa")).setExecutor(new RaketaCommand());
        Objects.requireNonNull(getCommand("kosmonaut")).setExecutor(new KosmonautCommand());

        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        getServer().getPluginManager().registerEvents(new ServerListener(), this);
    
        // ENHANCEMENT: Replaced println() with info()
        if(Bukkit.getOnlineMode()) {
            getLogger().info("Server je v online módu, takže se můžeš připojit pouze s origem.");
        } else {
            getLogger().info("Server je v offline módu, takže se můžeš připojit s jakýmkoliv účtem.");
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
