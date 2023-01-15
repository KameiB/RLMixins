package rlmixins.wrapper;

import com.Shultrea.Rin.Enchantments_Sector.Smc_010;
import com.Shultrea.Rin.Enum.EnumList;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public abstract class SMEWrapper {

    public static Enchantment getSwifterSlashes() { return Smc_010.SwifterSlashes; }
    public static Enchantment getHeavyWeight() { return Smc_010.HeavyWeight; }
    public static Enchantment getRusted() { return Smc_010.Rusted; }

    public static  EnumEnchantmentType getCombatAxeType() { return EnumList.COMBAT_AXE; }
}