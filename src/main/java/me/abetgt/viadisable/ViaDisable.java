package me.abetgt.viadisable;

import org.bukkit.Bukkit;
import org.bukkit.configuration.Configuration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ViaDisable extends JavaPlugin {

    PluginManager pm = Bukkit.getPluginManager();
    Configuration config;

    String v1 = "ViaVersion";
    String v2 = "ViaRewind";
    String v3 = "ViaBackwards";

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        config = getConfig();

        // Disabling the plugins
        if(pm.getPlugin(v1) != null){
            if(config.getBoolean(v1)){
                if(pm.isPluginEnabled(v1)){
                    pm.disablePlugin(pm.getPlugin(v1));
                }
            }
        }

        if(pm.getPlugin(v2) != null){
            if(config.getBoolean(v2)){
                if(pm.isPluginEnabled(v2)){
                    pm.disablePlugin(pm.getPlugin(v2));
                }
            }
        }

        if(pm.getPlugin(v3) != null){
            if(config.getBoolean(v3)){
                if(pm.isPluginEnabled(v3)){
                    pm.disablePlugin(pm.getPlugin(v3));
                }
            }
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
