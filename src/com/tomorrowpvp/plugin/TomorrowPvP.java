package com.tomorrowpvp.plugin;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;

import static sun.security.krb5.SCDynamicStoreConfig.getConfig;

public class TomorrowPvP extends JavaPlugin {


    private static TomorrowPvP instance;
    private static ArrayList<TeleportLocation> teleportLocations;

    public static FileConfiguration config;

    public static ArrayList<TeleportLocation> getTeleportLocations() {
        if(teleportLocations == null) {
            teleportLocations = new ArrayList<>();
        }
        return TomorrowPvP.teleportLocations;
    }

    public Permission playerPermission = new Permission("PlayerChatEvent.allowed");

    public static TomorrowPvP getInstance() {
        return TomorrowPvP.instance;
    }

    //probably wanna call this in onEnable
    public void handleConfig(){
        if (!fileExists()) {//check if the file exists, if not make it
            config = getConfig();//set the global varriable
            config.options().copyDefaults(false);//boiler plate
            config.addDefault("PATH", "VALUE");//set a path and its value, using a . will create a new line.
            config.options().copyDefaults(true);//boiler plate
            saveConfig();//tell bukkit to save the darn thing
        }
    }

    //boiler plate
    private boolean fileExists() {
        try {
            File file = new File("plugins/TomorrowPvP/config.yml");
            return file.exists();
        } catch (Exception e) {
            //Hide error silently >:D
        }
        return true;
    }

    //call this to get a message (in this case a string) from the config
    private String readConfig(String path){
        return config.getString(path);//read a string from the config. Do config.get to see all data types.
    }

    // region Constructor
    public TomorrowPvP(){
        getLogger().info("Plugin TomorrowPvP is loading...");


        teleportLocations = new ArrayList<>();
    }
    // endregion

    // region Override Functions

    @Override
    public void onDisable() {
        getLogger().info("TomorrowPvP onDisable");


        super.onDisable();
    }

    @Override
    public void onEnable() {
        super.onEnable();
        TomorrowPvP.instance = this;
        getLogger().info("TomorrowPvP onEnable");

        config = getConfig();
        getConfig().options().copyDefaults(true);
        //handleConfig();
        setTeleportLocations();

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerChatEvent(), this);
        pm.registerEvents(new NPCTeleport(), this);
        pm.registerEvents(new MyPlayerListener(), this);

    }

    private void setTeleportLocations() {
        getLogger().info("TomorrowPvP setTeleportLocations");

        teleportLocations = new ArrayList<>();

        TeleportLocation location = new TeleportLocation("tp1", 17, 65, 278, 17, 66, 256);
        teleportLocations.add(location);

        location = new TeleportLocation("tp1", 18, 65, 280, 17, 66, 256);
        teleportLocations.add(location);

        location = new TeleportLocation("tp1", 18, 66, 280, 17, 66, 256);
        teleportLocations.add(location);

        location = new TeleportLocation("tp1", 17, 66, 280, 17, 66, 256);
        teleportLocations.add(location);

    }

    // endregion
}