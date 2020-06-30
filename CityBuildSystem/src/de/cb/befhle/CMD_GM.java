//////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.
//////////////////////////////////////////////////////////////////////////////////////////

package de.cb.befhle;

import de.cb.main.CityBuild;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_GM implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
        if (!(sender instanceof Player))
            sender.sendMessage(CityBuild.Prefix + "§4§lMan muss ein Spieler sein um diesen Command auszuführen");
        Player p = (Player)sender;
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("1")) {
                if (p.hasPermission("tutorial.gm1")) {
                    p.setGameMode(GameMode.CREATIVE);
                    p.sendMessage(CityBuild.Prefix + "§7Du bist num im §a§lCREATIVE §7Modus");
                    p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT,1,1);
                } else {
                    p.sendMessage(CityBuild.Prefix + "§4§lDu hast keine Rechte!");
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
                }
            } else if (args[0].equalsIgnoreCase("2")) {
                if (p.hasPermission("gm.2")) {
                    p.setGameMode(GameMode.ADVENTURE);
                    p.sendMessage(CityBuild.Prefix + "§7Du bist num im §4§lADVENTURE §7Modus");
                    p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT,1,1);
                } else {
                    p.sendMessage(CityBuild.Prefix + "§4§lDu hast keine Rechte!");
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
                }
            } else if (args[0].equalsIgnoreCase("3")) {
                if (p.hasPermission("gm.3")) {
                    p.setGameMode(GameMode.SPECTATOR);
                    p.sendMessage(CityBuild.Prefix + "§7Du bist nun im §f§lSPECTATOR §7Modus");
                    p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT,1,1);
                } else {
                    p.sendMessage(CityBuild.Prefix + "§4§lDu hast keine Rechte!");
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
                }
            } else if (args[0].equalsIgnoreCase("0")) {
                if (p.hasPermission("gm.0")) {
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendMessage(CityBuild.Prefix + "§7Du bist num im §c§lSURVIVAL §7Modus");
                    p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT,1,1);
                } else {
                    p.sendMessage(CityBuild.Prefix + "§4§lDu hast keine Rechte!");
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
                }
            } else {
                p.sendMessage(CityBuild.Prefix + "Angabe! GameModes: - 3");
                p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
            }
        } else if (args.length == 2) {
            try {
                Player a = Bukkit.getPlayer(args[1]);
                if (args[0].equalsIgnoreCase("1")) {
                    if (a.hasPermission("gm.1")) {
                        a.setGameMode(GameMode.CREATIVE);
                        a.sendMessage(CityBuild.Prefix + "§7Du bist num im §a§lCREATIVE §7Modus");
                        p.sendMessage(CityBuild.Prefix + "§7Du bist num im §a§lCREATIVE §7Modus");
                        p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT,1,1);
                    } else {
                        a.sendMessage(CityBuild.Prefix + "§4§lDu hast keine Rechte!");
                        p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
                    }
                } else if (args[0].equalsIgnoreCase("2")) {
                    if (a.hasPermission("gm.2")) {
                        a.setGameMode(GameMode.ADVENTURE);
                        a.sendMessage(CityBuild.Prefix + "§7Du bist num im §4§lADVENTURE §7Modus");
                        p.sendMessage(CityBuild.Prefix + "§7Du bist num im §4§lADVENTURE §7Modus");
                        p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT,1,1);
                    } else {
                        a.sendMessage("§4§lDu hast keine Rechte!");
                        p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
                    }
                } else if (args[0].equalsIgnoreCase("3")) {
                    if (a.hasPermission("gm.3")) {
                        a.setGameMode(GameMode.SPECTATOR);
                        a.sendMessage(CityBuild.Prefix + "§7Du bist num im §f§lSPECTATOR §7Modus");
                        p.sendMessage(CityBuild.Prefix + "§7Du bist num im §f§lSPECTATOR §7Modus");
                        p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT,1,1);
                    } else {
                        a.sendMessage(CityBuild.Prefix + "§4§lDu hast keine Rechte!");
                        p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
                    }
                } else if (args[0].equalsIgnoreCase("0")) {
                    if (a.hasPermission("gm.0")) {
                        a.setGameMode(GameMode.SURVIVAL);
                        a.sendMessage(CityBuild.Prefix + "§7Du bist num im §c§lSURVIVAL §7Modus");
                        p.sendMessage(CityBuild.Prefix + "§7Du bist num im §c§lSURVIVAL §7Modus");
                        p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT,1,1);
                    } else {
                        a.sendMessage(CityBuild.Prefix + "§4§lDu hast keine Rechte!");
                        p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
                    }
                } else {
                    a.sendMessage(CityBuild.Prefix + "Angabe! Gamemodes: - 3");
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
                }
            } catch (NullPointerException d) {
                p.sendMessage(CityBuild.Prefix + "Spielername angegeben oder der Spieler ist nicht online!");
                p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
            }
        } else {
            p.sendMessage(CityBuild.Prefix + "benutzte <0-3> [Spielername]");
            p.playSound(p.getLocation(), Sound.VILLAGER_NO,1,1);
        }
        return true;
    }
}
