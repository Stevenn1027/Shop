package me.steven1027.shop.commands;

import me.steven1027.shop.ui.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShopCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage("You must be a player to use this command!");
            return true;
        }

        if (label.equalsIgnoreCase("shop")) {
            new Main().openMain((Player) sender);
            return true;
        }
        return true;
    }
}