package com.tomorrowpvp.plugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
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
        //Action action = event.getAction();
        //BlockFace blockFace = event.getBlockFace();

        Integer clickX = event.getPlayer().getLocation().getBlockX();
        Integer clickY = event.getPlayer().getLocation().getBlockY();
        Integer clickZ = event.getPlayer().getLocation().getBlockZ();

        TomorrowPvP.getInstance().getLogger().info(String.format("onPlayerInteract x=%d, y=%d, z=%d",
                clickX, clickY, clickZ));

        for (TeleportLocation location : TomorrowPvP.getTeleportLocations()) {
            if (location.getX().equals(clickX) && location.getY().equals(clickY) && location.getZ().equals(clickZ)) {

                player.sendMessage(ChatColor.GREEN + "Welcome back to Spawn!");

                TomorrowPvP.getInstance().getLogger().info(String.format("teleport to %d, %d, %d",
                        location.getTeleportX(), location.getTeleportY(), location.getTeleportZ()));

                player.teleport(new Location(player.getWorld(), location.getTeleportX(),
                        location.getTeleportY(), location.getTeleportZ()));

            }
        }

    }
}

