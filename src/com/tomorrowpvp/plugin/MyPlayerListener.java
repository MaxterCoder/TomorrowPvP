package com.tomorrowpvp.plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.io.IOException;



public class MyPlayerListener implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {

        for (String word : e.getMessage().split(" ")) {

            if(TomorrowPvP.config.getStringList("CurseWords").contains(word)) {

                e.setCancelled(true);
                e.getPlayer().sendMessage(ChatColor.DARK_RED + "Your message was blocked by TomorrowPvP");

            }

        }

    }

}
