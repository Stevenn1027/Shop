package me.steven1027.shop.ui;

import me.steven1027.shop.utils.Common;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class Main {

    public void openMain(Player player) {
        final Inventory inv = Bukkit.createInventory(null, 27, Common.colorize("&a&lShop"));
        player.openInventory(inv);

        ItemStack item = new ItemStack(Material.BONE);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(Common.colorize("&a&lMob Drops"));
        item.setItemMeta(meta);
        inv.setItem(11, item);

        item = new ItemStack(Material.APPLE);
        meta.setDisplayName(Common.colorize("&a&lFood"));
        item.setItemMeta(meta);
        inv.setItem(12, item);

        item = new ItemStack(Material.GRASS_BLOCK);
        meta.setDisplayName(Common.colorize("&a&lBlocks"));
        item.setItemMeta(meta);
        inv.setItem(13, item);

        item = new ItemStack(Material.DIAMOND);
        meta.setDisplayName(Common.colorize("&a&lOres"));
        item.setItemMeta(meta);
        inv.setItem(14, item);

        item = new ItemStack(Material.WITHER_SKELETON_SKULL);
        final SkullMeta skullMeta = (SkullMeta) item.getItemMeta();
        skullMeta.setDisplayName(Common.colorize("&a&lValubles"));
        item.setItemMeta(skullMeta);
        inv.setItem(15, item);

        item = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        final int[] slots = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26 };
        for (int slot : slots) {
            inv.setItem(slot, item);
        }
    }
}
