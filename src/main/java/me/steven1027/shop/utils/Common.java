package me.steven1027.shop.utils;

import me.steven1027.shop.Shop;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class Common {

    public static String colorize(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public static String prefix() {
        return colorize("&e[SHOP] ");
    }

    public static String noPerm() {
        return prefix() + colorize("&e&lERROR! &7You do not have the correct permissions");
    }

    public static void buildItem(String material, double price, Inventory inv, int slot) {
        final ItemStack item = new ItemStack(Material.matchMaterial(material));
        final ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(colorize("&7&l" + material));
        meta.setLore(Arrays.asList(colorize("&cSell - &a$" + price)));
        item.setItemMeta(meta);
        inv.setItem(slot, item);
    }

    public static void sellItem(int amount, String material, double price, Player player) {
        if (amount == 0) {
            player.sendMessage(prefix() + colorize("&e&lERROR! &7You do not have the correct item and/or amount!"));
            return;
        }

        if (!player.getInventory().contains(Material.matchMaterial(material), amount)) {
            player.sendMessage(prefix() + colorize("&e&lERROR! &7You do not have the correct item and/or amount!"));
            return;
        }

        Shop.getEconomy().depositPlayer((OfflinePlayer) player, (amount * price));

        final ItemStack item = new ItemStack(Material.matchMaterial(material), amount);

        player.getInventory().removeItem(item);
        player.updateInventory();
        player.sendMessage(prefix() + colorize("&7Sucessfully sold &e" + amount + " " + material + " &7for &e$" + (amount * price) + "&7!"));
    }
}
