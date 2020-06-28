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
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import sun.applet.Main;

public class CMD_Invsee implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command CMD, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;
            if(p.hasPermission("cb.invsee")) {
                if(args.length == 1) {
                    Player open_inv = Bukkit.getPlayerExact(args[0]);
                    if(open_inv != null) {
                        p.openInventory(open_inv.getInventory());
                    }else {
                        p.sendMessage(CityBuild.Prefix + "§cDieser Spieler ist nicht auf dem Server");
                        p.sendTitle("§7Dieser Spieler ist", "§cnicht §7auf dem Server");
                        p.playSound(p.getLocation(), Sound.BAT_HURT,1,1);
                    }
                }else {
                    p.sendMessage(CityBuild.Prefix + "§c/invsee <PLAYER>");
                    p.sendTitle("§7Bitte benutze", "§c/invsee <PLAYER>");
                    p.playSound(p.getLocation(), Sound.BAT_HURT,1,1); }
            }
        }
        return true;
    }
}
