package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class RuneDto implements Serializable {

    private List<String> from;
    private List<String> into;
    private Map<String, Boolean> maps;
    private List<String> tags;
    private GoldDto gold;
    private ImageDto image;
    private MetaDataDto rune;
    private BasicDataStatsDto stats;
    private RuneStatDto stat;
    private boolean consumeOnFull;
    private boolean consumed;
    private boolean hideFromAll;
    private boolean inStore;
    private int depth;
    private int id;
    private int specialRecipe;
    private int stacks;
    private String colloq;
    private String description;
    private String group;
    private String name;
    private String plaintext;
    private String requiredChampion;
    private String sanitizedDescription;

    public RuneStatDto getStat() {
        return stat;
    }

    public List<String> getFrom() {
        return from;
    }

    public List<String> getInto() {
        return into;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public List<String> getTags() {
        return tags;
    }

    public GoldDto getGold() {
        return gold;
    }

    public ImageDto getImage() {
        return image;
    }

    public MetaDataDto getRune() {
        return rune;
    }

    public BasicDataStatsDto getStats() {
        return stats;
    }

    public boolean isConsumeOnFull() {
        return consumeOnFull;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public boolean isHideFromAll() {
        return hideFromAll;
    }

    public boolean isInStore() {
        return inStore;
    }

    public int getDepth() {
        return depth;
    }

    public int getId() {
        return id;
    }

    public int getSpecialRecipe() {
        return specialRecipe;
    }

    public int getStacks() {
        return stacks;
    }

    public String getColloq() {
        return colloq;
    }

    public String getDescription() {
        return description;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public RuneStatDto getStatDetails() {
        if (stat != null)
            return stat;

        stat = new RuneStatDto();
        double value;

        if ((value = stats.getFlatArmorMod()) != 0) {
            stat.setType("FlatArmorMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatAttackSpeedMod()) != 0) {
            stat.setType("FlatAttackSpeedMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatBlockMod()) != 0) {
            stat.setType("FlatBlockMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatCritChanceMod()) != 0) {
            stat.setType("FlatCritChanceMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatCritDamageMod()) != 0) {
            stat.setType("FlatCritDamageMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatEnergyPoolMod()) != 0) {
            stat.setType("FlatEnergyPoolMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatEnergyRegenMod()) != 0) {
            stat.setType("FlatEnergyRegenMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatEXPBonus()) != 0) {
            stat.setType("FlatEXPBonus");
            stat.setValue(value);
        } else if ((value = stats.getFlatHPPoolMod()) != 0) {
            stat.setType("FlatHPPoolMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatHPRegenMod()) != 0) {
            stat.setType("FlatHPRegenMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatMagicDamageMod()) != 0) {
            stat.setType("FlatMagicDamageMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatMovementSpeedMod()) != 0) {
            stat.setType("FlatMovementSpeedMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatMPPoolMod()) != 0) {
            stat.setType("FlatMPPoolMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatMPRegenMod()) != 0) {
            stat.setType("FlatMPRegenMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatPhysicalDamageMod()) != 0) {
            stat.setType("FlatPhysicalDamageMod");
            stat.setValue(value);
        } else if ((value = stats.getFlatSpellBlockMod()) != 0) {
            stat.setType("FlatSpellBlockMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentArmorMod()) != 0) {
            stat.setType("PercentArmorMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentAttackSpeedMod()) != 0) {
            stat.setType("PercentAttackSpeedMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentBlockMod()) != 0) {
            stat.setType("PercentBlockMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentCritChanceMod()) != 0) {
            stat.setType("PercentCritChanceMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentCritDamageMod()) != 0) {
            stat.setType("PercentCritDamageMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentDodgeMod()) != 0) {
            stat.setType("PercentDodgeMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentEXPBonus()) != 0) {
            stat.setType("PercentEXPBonus");
            stat.setValue(value);
        } else if ((value = stats.getPercentHPPoolMod()) != 0) {
            stat.setType("PercentHPPoolMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentHPRegenMod()) != 0) {
            stat.setType("PercentHPRegenMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentLifeStealMod()) != 0) {
            stat.setType("PercentLifeStealMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentMagicDamageMod()) != 0) {
            stat.setType("PercentMagicDamageMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentMovementSpeedMod()) != 0) {
            stat.setType("PercentMovementSpeedMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentMPPoolMod()) != 0) {
            stat.setType("PercentMPPoolMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentMPRegenMod()) != 0) {
            stat.setType("PercentMPRegenMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentPhysicalDamageMod()) != 0) {
            stat.setType("PercentPhysicalDamageMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentSpellBlockMod()) != 0) {
            stat.setType("PercentSpellBlockMod");
            stat.setValue(value);
        } else if ((value = stats.getPercentSpellVampMod()) != 0) {
            stat.setType("PercentSpellVampMod");
            stat.setValue(value);
        } else if ((value = stats.getrFlatArmorModPerLevel()) != 0) {
            stat.setType("rFlatArmorModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatArmorPenetrationMod()) != 0) {
            stat.setType("rFlatArmorPenetrationMod");
            stat.setValue(value);
        } else if ((value = stats.getrFlatArmorPenetrationModPerLevel()) != 0) {
            stat.setType("rFlatArmorPenetrationModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatCritChanceModPerLevel()) != 0) {
            stat.setType("rFlatCritChanceModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatCritDamageModPerLevel()) != 0) {
            stat.setType("rFlatCritDamageModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatDodgeMod()) != 0) {
            stat.setType("rFlatDodgeMod");
            stat.setValue(value);
        } else if ((value = stats.getrFlatDodgeModPerLevel()) != 0) {
            stat.setType("rFlatDodgeModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatEnergyModPerLevel()) != 0) {
            stat.setType("rFlatEnergyModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatEnergyRegenModPerLevel()) != 0) {
            stat.setType("rFlatEnergyRegenModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatGoldPer10Mod()) != 0) {
            stat.setType("rFlatGoldPer10Mod");
            stat.setValue(value);
        } else if ((value = stats.getrFlatHPModPerLevel()) != 0) {
            stat.setType("rFlatHPModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatHPRegenModPerLevel()) != 0) {
            stat.setType("rFlatHPRegenModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatMagicDamageModPerLevel()) != 0) {
            stat.setType("rFlatMagicDamageModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatMagicPenetrationMod()) != 0) {
            stat.setType("rFlatMagicPenetrationMod");
            stat.setValue(value);
        } else if ((value = stats.getrFlatMagicPenetrationModPerLevel()) != 0) {
            stat.setType("rFlatMagicPenetrationModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatMovementSpeedModPerLevel()) != 0) {
            stat.setType("rFlatMovementSpeedModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatMPModPerLevel()) != 0) {
            stat.setType("rFlatMPModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatMPRegenModPerLevel()) != 0) {
            stat.setType("rFlatMPRegenModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatPhysicalDamageModPerLevel()) != 0) {
            stat.setType("rFlatPhysicalDamageModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatSpellBlockModPerLevel()) != 0) {
            stat.setType("rFlatSpellBlockModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrFlatTimeDeadMod()) != 0) {
            stat.setType("rFlatTimeDeadMod");
            stat.setValue(value);
        } else if ((value = stats.getrFlatTimeDeadModPerLevel()) != 0) {
            stat.setType("rFlatTimeDeadModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrPercentArmorPenetrationMod()) != 0) {
            stat.setType("rPercentArmorPenetrationMod");
            stat.setValue(value);
        } else if ((value = stats.getrPercentArmorPenetrationModPerLevel()) != 0) {
            stat.setType("rPercentArmorPenetrationModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrPercentAttackSpeedModPerLevel()) != 0) {
            stat.setType("rPercentAttackSpeedModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrPercentCooldownMod()) != 0) {
            stat.setType("rPercentCooldownMod");
            stat.setValue(value);
        } else if ((value = stats.getrPercentCooldownModPerLevel()) != 0) {
            stat.setType("rPercentCooldownModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrPercentMagicPenetrationMod()) != 0) {
            stat.setType("rPercentMagicPenetrationMod");
            stat.setValue(value);
        } else if ((value = stats.getrPercentMagicPenetrationModPerLevel()) != 0) {
            stat.setType("rPercentMagicPenetrationModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrPercentMovementSpeedModPerLevel()) != 0) {
            stat.setType("rPercentMovementSpeedModPerLevel");
            stat.setValue(value);
        } else if ((value = stats.getrPercentTimeDeadMod()) != 0) {
            stat.setType("rPercentTimeDeadMod");
            stat.setValue(value);
        } else if ((value = stats.getrPercentTimeDeadModPerLevel()) != 0) {
            stat.setType("rPercentTimeDeadModPerLevel");
            stat.setValue(value);
        }
        return stat;
    }

}
