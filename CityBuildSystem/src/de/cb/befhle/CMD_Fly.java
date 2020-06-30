//////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.
//////////////////////////////////////////////////////////////////////////////////////////

package de.cb.befhle;

import de.cb.main.CityBuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class CMD_Fly implements CommandExecutor {
    FileConfiguration cfg;

    public CMD_Fly(FileConfiguration config) {
        this.cfg = config;
    }

    public CMD_Fly() {

    }

    @SuppressWarnings("deprecation")
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            System.out.println("Du musst ein Spieler sein");
            return true;
        }
        Player p = (Player)sender;
        if (!p.hasPermission("fly.fly")) {
            p.sendMessage(CityBuild.Prefix + "§cDazu hast du keine rechte");
            return true;
        }
        if (p.getAllowFlight()) {
            p.setAllowFlight(false);
            p.setFlying(false);
            p.sendMessage(CityBuild.Prefix + "§c§lFlug Modus Deaktiviert");
        } else {
            p.setAllowFlight(true);
            p.sendMessage(CityBuild.Prefix + "§a§lFlug Modus Aktiviert");
        }
        return true;
    }
}
