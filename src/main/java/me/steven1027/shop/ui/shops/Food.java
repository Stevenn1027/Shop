package me.steven1027.shop.ui.shops;

import me.steven1027.shop.utils.Common;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Food {

    public void openFood(Player player) {
        Inventory inv = Bukkit.createInventory(null, 36, Common.colorize("&a&lFood"));
        player.openInventory(inv);

        Common.buildItem("Cooked Beef", 2, inv, 1);
        Common.buildItem("Cooked Porkchop", 2, inv, 2);
        Common.buildItem("Pufferfish", 30, inv, 3);
        Common.buildItem("Cooked Cod", 2, inv, 4);
        Common.buildItem("Cooked Salmon", 2, inv, 5);
        Common.buildItem("Cake", 50, inv, 6);
        Common.buildItem("Cookie", 2, inv, 7);
        Common.buildItem("Melon Slice", 1, inv, 10);
        Common.buildItem("Pumpkin Pie", 5, inv, 11);
        Common.buildItem("Baked Potato", 2, inv, 12);
        Common.buildItem("Cooked Rabbit", 3, inv, 13);
        Common.buildItem("Cooked Mutton", 2, inv, 14);
        Common.buildItem("Beetroot", 1, inv, 15);
        Common.buildItem("Honey Bottle", 25, inv, 16);
        Common.buildItem("Bread", 2, inv, 20);
        Common.buildItem("Cooked Chicken", 2, inv, 21);
        Common.buildItem("Apple", 10, inv, 22);
        Common.buildItem("Carrot", 1, inv, 23);
        Common.buildItem("Sweet Berries", 1, inv, 24);

        final ItemStack item = new ItemStack(Material.BARRIER);
        final ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Common.colorize("&c&lBack"));
        item.setItemMeta(meta);
        inv.setItem(31, item);
    }
}
