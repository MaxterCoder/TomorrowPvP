package com.tomorrowpvp.plugin;

import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TomorrowPvP extends JavaPlugin {

    public Permission playerPermission = new Permission("PlayerChatEvent.allowed");


    // region Constructor
    public TomorrowPvP(){
        getLogger().info("Plugin TomorrowPvP is loading...");
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
        getLogger().info("TomorrowPvP onEnable");

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerChatEvent(), this);
        pm.registerEvents(new NPCTeleport(), this);
        //pm.addPermission(playerPermission);

    }

    // endregion
}