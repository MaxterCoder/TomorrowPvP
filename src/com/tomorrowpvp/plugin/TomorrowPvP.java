package com.tomorrowpvp.plugin;

import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TomorrowPvP extends JavaPlugin {

    private static TomorrowPvP instance;
    private ArrayList<TeleportLocation> teleportLocations;

    public ArrayList<TeleportLocation> getTeleportLocations() {
        return teleportLocations;
    }

    public Permission playerPermission = new Permission("PlayerChatEvent.allowed");

    public static TomorrowPvP getInstance() {
        return TomorrowPvP.instance;
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

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerChatEvent(), this);
        pm.registerEvents(new NPCTeleport(), this);
        //pm.addPermission(playerPermission);

    }

    private void setTeleportLocations() {
        getLogger().info("TomorrowPvP setTeleportLocations");

        TeleportLocation location = new TeleportLocation("tp1", 17, 65, 280, 17, 66, 256);

        location = new TeleportLocation("tp1", 18, 65, 280, 17, 66, 256);
        location = new TeleportLocation("tp1", 18, 66, 280, 17, 66, 256);
        location = new TeleportLocation("tp1", 17, 66, 280, 17, 66, 256);


    }

    // endregion
}