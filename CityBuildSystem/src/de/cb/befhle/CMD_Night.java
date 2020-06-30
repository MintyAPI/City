//////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.
//////////////////////////////////////////////////////////////////////////////////////////

package de.cb.befhle;

import de.cb.main.CityBuild;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Night implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("night"))
            if (p.hasPermission("cbs.night")) {
                if (args.length == 0) {
                    p.getWorld().setTime(15000L);
                    p.sendMessage(CityBuild.Prefix + "Du hast die Zeit zu §9Nacht §7geändert");
                            p.playSound(p.getLocation(), Sound.NOTE_PIANO, 3.0F, 3.0F);
                } else {
                    p.sendMessage(CityBuild.use + "§c/night");
                }
            } else {
                p.sendMessage(CityBuild.noPerm);
            }
        return false;
    }
}
