//////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.
//////////////////////////////////////////////////////////////////////////////////////////

package de.cb.befhle;

import de.cb.main.CityBuild;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Workbench implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("craft"))
            if (p.hasPermission("cbs.craft")) {
                if (args.length == 0) {
                    Location location = p.getLocation();
                    p.openWorkbench(location, true);
                    p.playSound(p.getLocation(), Sound.CHEST_OPEN, 2.0F, 2.0F);
                } else {
                    p.sendMessage(CityBuild.use + "§c/wb");
                }
            } else {
                p.sendMessage(CityBuild.noPerm);
            }
        return false;
    }
}
