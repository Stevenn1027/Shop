package me.steven1027.shop.ui.shops;

import me.steven1027.shop.utils.Common;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Valuables {

    public void openValuables(Player player) {
        final Inventory inv = Bukkit.createInventory(null, 27, Common.colorize("&a&lValubles"));
        player.openInventory(inv);

        Common.buildItem("Beacon", 5000, inv, 0);
        Common.buildItem("Turtle Egg", 500, inv, 1);
        Common.buildItem("Conduit", 1000, inv, 2);
        Common.buildItem("Shulker Shell", 250, inv, 3);
        Common.buildItem("Trident", 500, inv, 4);
        Common.buildItem("Totem of Undying", 250, inv, 5);
        Common.buildItem("Enchanted Golden Apple", 2500, inv, 6);
        Common.buildItem("Heart of the Sea", 500, inv, 7);
        Common.buildItem("Skeleton Skull", 2500, inv, 8);
        Common.buildItem("Zombie Head", 2500, inv, 10);
        Common.buildItem("Dragon Head", 2000, inv, 11);
        Common.buildItem("Saddle", 500, inv, 12);
        Common.buildItem("Golden Apple", 200, inv, 13);
        Common.buildItem("Wither Skeleton Skull", 550, inv, 14);
        Common.buildItem("Nether Star", 1000, inv, 15);
        Common.buildItem("Creeper Head", 2500, inv, 16);

        final ItemStack item = new ItemStack(Material.BARRIER);
        final ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Common.colorize("&c&lBack"));
        item.setItemMeta(meta);
        inv.setItem(22, item);
    }
}
