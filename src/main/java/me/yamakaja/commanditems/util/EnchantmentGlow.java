package me.yamakaja.commanditems.util;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.ItemStack;

public class EnchantmentGlow extends EnchantmentWrapper {

    private final NamespacedKey key;

    public EnchantmentGlow(NamespacedKey key) {
        super();
        this.key = key;
    }

    @Override
    public NamespacedKey getKey() {
        return key;
    }

    @Override
    public boolean canEnchantItem(ItemStack item) {
        return true;
    }

    @Override
    public boolean conflictsWith(Enchantment other) {
        return false;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return null;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public String getName() {
        return "Glow";
    }

    @Override
    public int getStartLevel() {
        return 1;
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isCursed() {
        return false;
    }

    @Override
    public String getTranslationKey() {
        return "enchantment.glow";
    }

    @Override
    public boolean isRegistered() {
        return true;
    }

    @Override
    public NamespacedKey getKeyOrNull() {
        return key;
    }

    @Override
    public NamespacedKey getKeyOrThrow() {
        return key;
    }
}