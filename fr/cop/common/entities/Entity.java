package fr.cop.common.entities;

import fr.cop.common.Buffs;
import fr.cop.common.Stats;

public interface Entity {

	public String getDisplayedName();
	
	public String getUUID();
	
	public int getPosX();
	
	public int getPosY();
	
	public int getWidth();
	
	public int getHeight();
	
	public boolean isHitting();
	
	public Buffs[] getBuffs();
	
	public void addBuff(Buffs buff);
	
	public void removeBuff(Buffs buff);
	
	public Stats getStats();
	
	public boolean isFocusable();
	
	public boolean isInvincible();
	
	public void onDeathEvent();
	
	public void onSpawnEvent();
	
	public void onRespawnEven();
	
	public void onDamageTaken();
	
	public void onDamageDealt();
}
