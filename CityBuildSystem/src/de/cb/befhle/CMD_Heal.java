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

public class CMD_Heal implements CommandExecutor {

    @SuppressWarnings("deprecation")
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("tutorial.heal")) {
                if(args.length == 0) {
                    player.setHealth(20);
                    player.setFoodLevel(20);
                    player.sendMessage(CityBuild.Prefix + "§a§lDu wurdest geheilt!");
                    player.playSound(player.getLocation(), Sound.BAT_HURT,1,1);

                }else if(args.length == 1) {
                    Player target = Bukkit.getPlayer(args[0]);
                    if(target != null) {
                        target.setHealth(20);
                        target.setFoodLevel(20);
                        target.sendMessage(CityBuild.Prefix + "§aDu wurdest von §c" + player.getName() + " §ageheilt!");
                        target.playSound(target.getLocation(), Sound.BAT_HURT,1,1);
                        player.sendMessage(CityBuild.Prefix + "§aDu hast den Spieler §c" + target.getName() + " §ageheilt!");
                        player.playSound(player.getLocation(), Sound.VILLAGER_NO,1,1);
                    } else
                        player.sendMessage(CityBuild.Prefix + "§cDer Spieler " + args[0] + " ist nicht auf dem Server.");
                    player.playSound(player.getLocation(), Sound.VILLAGER_NO,1,1);
                } else
                    player.sendMessage(CityBuild.Prefix + "§cBitte benutze /heal <SPIELER>!");
                player.playSound(player.getLocation(), Sound.VILLAGER_NO,1,1);
            } else
                player.sendMessage(CityBuild.Prefix + "§cDu hast keine Rechte für diesen Command");
            player.playSound(player.getLocation(), Sound.VILLAGER_NO,1,1);
        } else
            sender.sendMessage(CityBuild.Prefix + "Diesen Command darfst du nur als Spieler benutzen!");

        return false;
    }

}
