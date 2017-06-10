package com.tomorrowpvp.plugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class NPCTeleport implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        Action action = event.getAction();
        if(action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if(player.getItemInHand().getType() == Material.DIAMOND_BLOCK) {

                player.sendMessage(ChatColor.GREEN + "Welcome back to Spawn!" );
                player.teleport(player.getWorld().getSpawnLocation());
                player.getInventory().remove(player.getItemInHand());

            }



        }


    }

}
