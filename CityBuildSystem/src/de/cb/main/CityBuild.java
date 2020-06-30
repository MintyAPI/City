package de.cb.main;

import de.cb.Listeners.JoinListener;
import de.cb.Listeners.QuitListener;
import de.cb.befhle.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class CityBuild extends JavaPlugin {

    public static String Prefix = "§7[§9CityBuild§7] ";
    public static String noPerm = "§7Dazu hast du keine §cRechte§7!";
    public static String notfound = "§7Der §cSpieler §7wurde nicht gefunden.";
    public static String use = "§7Bitte benutze: ";
    //Hallo

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getServer().getPluginManager().registerEvents(new QuitListener(), this);

        getCommand("Invsee").setExecutor(new CMD_Invsee());
        getCommand("Partner").setExecutor(new CMD_Partner());
        getCommand("Website").setExecutor(new CMD_Website());
        getCommand("Ts").setExecutor(new CMD_TS());
        getCommand("Tp").setExecutor(new CMD_TP());
        getCommand("Tpa").setExecutor(new CMD_TPA());
        getCommand("Tpo").setExecutor(new CMD_TPO());
        getCommand("Tpaccept").setExecutor(new CMD_TPAceept());
        getCommand("gm").setExecutor((CommandExecutor) new CMD_GM());
        getCommand("fly").setExecutor(new CMD_Fly());
        getCommand("Feed").setExecutor(new CMD_Feed());
        getCommand("Heal").setExecutor(new CMD_Heal());
        getCommand("sun").setExecutor(new CMD_Sun());
        getCommand("night").setExecutor(new CMD_Night());
        getCommand("craft").setExecutor(new CMD_Workbench());
        getCommand("ec").setExecutor(new CMD_Enderchest());
        getCommand("day").setExecutor(new CMD_Day());
        getCommand("repair").setExecutor(new CMD_Repair());
        getCommand("rename").setExecutor(new CMD_Rename());


    }
}
