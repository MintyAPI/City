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
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_TP implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command CMD, String label, String[] args) {

        Player p = (Player) sender;
        if (p.hasPermission("cb.tp")) {

            if (!(sender instanceof Player)) {

                sender.sendMessage("§cERROR | Du bist kein Spieler");

            }

            if (args.length == 0) {


                p.sendMessage(CityBuild.Prefix + ChatColor.GRAY + "Bitte benutze: §c/tp <NAME>");
                p.sendTitle("§7Bitte benutze", "§c/tp <NAME>");
                p.playSound(p.getLocation(), Sound.BAT_HURT, 1, 1);

            }
            if (args.length == 1) {

                Player target = Bukkit.getServer().getPlayer(args[0]);

                p.teleport(target.getLocation());

                p.sendMessage(CityBuild.Prefix + ChatColor.GRAY + "Du wurdest erfolgreich zu " + ChatColor.RED + target.getName() + " §7teleportiert");
                p.sendTitle("§7Du wurdest erfolgreich zu", ChatColor.RED + target.getName() + " §7Teleportiert");
                p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);

            }

            if (args.length >= 2) {

                p.sendMessage(CityBuild.Prefix + ChatColor.GRAY + "Bitte benutze §c/tp <NAME>");
                p.sendTitle("§7Bitte benutze", "§c/tp <NAME>");
                p.playSound(p.getLocation(), Sound.BAT_HURT, 1, 1);


            }

        }
        return false;
    }
}