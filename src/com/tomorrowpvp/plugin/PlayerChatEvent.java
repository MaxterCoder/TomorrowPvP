package com.tomorrowpvp.plugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class PlayerChatEvent implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        System.out.println("PlayerChatEvent onChat");

        Player p = e.getPlayer();
        String message = e.getMessage();
        message.replace("%", "Percent");

        if (p.getName().equals("GamerBoy793")) {
            e.setFormat("§0§l[§1§lOwner§0§l]§4" + p.getName() + "§f-> " + message);
        } else if (p.getName().equals("RedRoyalPlaysMC")) {
            e.setFormat("§0§l[§1§lOwner§0§l]§4" + p.getName() + "§f-> " + message);
        } else if (p.getName().equals("gannonsmith")) {
                e.setFormat("§0§l[§2§lMod§0§l]§4" + p.getName() + "§f-> " + message);
        } else if (p.getName().equals("masterwoodchuck")){
            e.setFormat("§0§l[§e§lAdmin§0§l]§4" + p.getName() + "§f-> " + message);
        } else if (p.getName().equals("BlueGigabeast")) {
            e.setFormat("§0§l[§e§lAdmin§0§l]§4" + p.getName() + "§f-> " + message);
        } else {
            e.setFormat(p.getName() + "->" + message);
        }

//        return;
//        if (PermissionsEx.getUser(p).inGroup("Default")) {
//            e.setFormat(p.getName() + "->" + message);
//
//        }
//
//        if (PermissionsEx.getUser(p).inGroup("Knight")) {
//            e.setFormat("§0§l[§7§lKnight§0§l]" + p.getName() + "->" + message);
//
//        }
//
//        if (PermissionsEx.getUser(p).inGroup("Lord")) {
//            e.setFormat("§0§l[§4§lLord§0§l]" + p.getName() + "->" + message);
//
//        }
//
//        if (PermissionsEx.getUser(p).inGroup("Champion")) {
//            //e.setFormat("§0§l[§6§lChampion§0§l]" + p.getName() + "->" + message);
//
//        }
//
//        if (PermissionsEx.getUser(p).inGroup("Owner")) {
//            e.setFormat("§0§l[§1§lOwner§0§l]" + p.getName() + "->" + message);
//
//        }
//
//        if (PermissionsEx.getUser(p).inGroup("Admin")) {
//            e.setFormat("§0§l[§e§lAdmin§0§l]" + p.getName() + "->" + message);
//
//        }
//
//        if (PermissionsEx.getUser(p).inGroup("Mod")) {
//            e.setFormat("§0§l[§2§lMod§0§l]" + p.getName() + "->" + message);
//
//        }
//
//        if (PermissionsEx.getUser(p).inGroup("YouTube")) {
//            e.setFormat("§0§l[§4§lY§f§lou§4§lT§f§lube§0§l]" + p.getName() + "->" + message);
//
//        }
//
//        if (PermissionsEx.getUser(p).inGroup("Twitch")) {
//            e.setFormat("§0§l[§5§lTwitch§0§l]" + p.getName() + "->" + message);
//
//        }
    }
}
