package fr.cop.common.entities;

import java.awt.Polygon;
import java.util.Vector;

import fr.cop.common.Buffs;
import fr.cop.common.Stats;

public interface Entity {

	public Polygon getHitbox();


	public String getUUID();

	public int getServerPosX();

	public int getServerPosY();

	public int getServerWidth();

	public int getServerHeight();

	public default boolean isHitting(int poxX, int posY) {
		return getHitbox().contains(poxX, posY);
	}

	public Vector<Buffs> getBuffs();

	public default void addBuff(Buffs buff){
		getBuffs().add(buff);
	}

	public default void removeBuff(Buffs buff){
		getBuffs().remove(buff);
	}

	public Stats getStats();

	public boolean isFocusable();

	public boolean isInvincible();

	public void onDeathEvent();

	public void onSpawnEvent();

	public void onRespawnEven();

	public void onDamageTaken();

	public void onDamageDealt();
}
