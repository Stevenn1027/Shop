package me.steven1027.shop.ui;

import me.steven1027.shop.utils.Common;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class QuantitySelector {

    public void openQuantitySelector(Player player) {
        final Inventory inv = Bukkit.createInventory(null, 36, Common.colorize("&a&lSelect Quantity"));
        player.openInventory(inv);

        ItemStack item = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(Common.colorize("&7Sell &e&l1"));
        item.setItemMeta(meta);
        inv.setItem(12, item);

        item = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
        meta.setDisplayName(Common.colorize("&7Sell &6&l16"));
        item.setItemMeta(meta);
        inv.setItem(13, item);

        item = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        meta.setDisplayName(Common.colorize("&7Sell &4&lall"));
        item.setItemMeta(meta);
        inv.setItem(14, item);

        item = new ItemStack(Material.BARRIER);
        meta.setDisplayName(Common.colorize("&c&lBack"));
        item.setItemMeta(meta);
        inv.setItem(22, item);

        item = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        int[] slots = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35 };
        for (int slot : slots) {
            inv.setItem(slot, item);
        }
    }
}
