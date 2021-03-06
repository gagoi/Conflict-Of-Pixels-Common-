package fr.cop.common;

public class Stats {

	private int HP;
	private int HP_Regen;
	private int MP;
	private int MP_Regen;
	private int Physical_Resistance;
	private int Magic_Resistance;
	private int Magic_Damage;
	private int Magic_Pen;
	private int Magic_Drain;
	private int Physical_Damage;
	private int Physical_Pen;
	private int Physical_Drain;
	private int Raw_Damage;
	private int Attack_Speed;
	private int Critical_Chance;
	private int Mana_Drain;
	private int Cooldown_Reduction;
	private int Mana_Cost_Reduction;
	private int Returned_Physical_Damage;
	private int Returned_Magic_Damage;
	private int Bonus_Gold;
	private int Range;
	private int Move_Speed;
	private int Xp;
	private int Earned_Golds_Per_Second;
	private int Golds;
	private int Height;

	public static final int STAT_ID_HP = 0;
	public static final int STAT_ID_HP_Regen = 1;
	public static final int STAT_ID_MP = 2;
	public static final int STAT_ID_MP_Regen = 3;
	public static final int STAT_ID_Physical_Resistance = 4;
	public static final int STAT_ID_Magic_Resistance = 5;
	public static final int STAT_ID_Magic_Damage = 6;
	public static final int STAT_ID_Magic_Pen = 7;
	public static final int STAT_ID_Magic_Drain = 8;
	public static final int STAT_ID_Physical_Damage = 9;
	public static final int STAT_ID_Physical_Pen = 10;
	public static final int STAT_ID_Physical_Drain = 11;
	public static final int STAT_ID_Raw_Damage = 12;
	public static final int STAT_ID_Attack_Speed = 13;
	public static final int STAT_ID_Critical_Chance = 14;
	public static final int STAT_ID_Mana_Drain = 15;
	public static final int STAT_ID_Cooldown_Reduction = 16;
	public static final int STAT_ID_Mana_Cost_Reduction = 17;
	public static final int STAT_ID_Returned_Physical_Damage = 18;
	public static final int STAT_ID_Returned_Magic_Damage = 19;
	public static final int STAT_ID_Bonus_Gold = 20;
	public static final int STAT_ID_Range = 21;
	public static final int STAT_ID_Move_Speed = 22;
	public static final int STAT_ID_XP = 23;
	public static final int STAT_ID_Earned_Gold_Per_Second = 24;
	public static final int STAT_ID_Golds = 25;
	public static final int STAT_ID_Height = 26;

	public static final int HEIGHT_SKY = 1;
	public static final int HEIGHT_UNDERGROUND = -1;
	public static final int HEIGHT_NORMAL = 0;
	
	private int[] STATS = {HP, HP_Regen, MP, MP_Regen, Physical_Resistance, Magic_Resistance, Magic_Damage, Magic_Pen, Magic_Drain, Physical_Damage, Physical_Pen, Attack_Speed, Critical_Chance, Mana_Drain, Cooldown_Reduction, Mana_Cost_Reduction, Returned_Physical_Damage, Returned_Magic_Damage, Bonus_Gold, Physical_Drain, Raw_Damage, Range, Move_Speed, Xp, Earned_Golds_Per_Second, Golds, Height};

	public Stats() {

	}

	public void setStat(int statId, int value) {
		STATS[statId] = value;
	}

	public void scaleUpStat(int statId, int value) {
		STATS[statId] += value;
	}

	public void scaleDownStat(int statId, int value) {
		STATS[statId] -= value;
	}

	public int getStat(int statId) {
		return STATS[statId];
	}
	
	public void setHeight(int height){
		STATS[STAT_ID_Height] = height;
	}
}
