package com.tomorrowpvp.plugin;

import org.bukkit.ChatColor;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class NPCTeleport implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {

        TomorrowPvP.getInstance().getLogger().info("onPlayerInteract event");

        Player player = event.getPlayer();
        Action action = event.getAction();
        BlockFace blockFace = event.getBlockFace();

        TomorrowPvP.getInstance().getLogger().info(String.format("onPlayerInteract x=109, y=69, z=261", player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ()));

        if (action.equals(Action.RIGHT_CLICK_AIR))

        player.sendMessage(ChatColor.GREEN + "Welcome back to Spawn!");


        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {


            player.sendMessage(ChatColor.GREEN + "Welcome back to Spawn!");
            player.teleport(player.getWorld().getSpawnLocation());
            player.getInventory().remove(player.getItemInHand());

        }
    }
}

