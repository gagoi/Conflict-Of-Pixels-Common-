package fr.cop.common.entities.spells;

import java.awt.Polygon;
import java.util.Vector;

import fr.cop.common.Buffs;
import fr.cop.common.Stats;
import fr.cop.common.entities.Entity;

public class Spell_Base implements Entity{
	
	private String name;
	@SuppressWarnings("unused")
	private int posX, posY;
	
	public Spell_Base(String name) {
		this.name = name;
	}
	

	public int getCost(){
		return 0;
	}
	@Override
	public Polygon getHitbox() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDisplayedName() {
		return name;
	}

	@Override
	public String getUUID() {
		return "spell:"+getDisplayedName().toLowerCase();
	}

	@Override
	public Vector<Buffs> getBuffs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stats getStats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFocusable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInvincible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onDeathEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSpawnEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRespawnEven() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDamageTaken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDamageDealt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSpriteInformation() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int getServerPosX() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getServerPosY() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getServerWidth() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getServerHeight() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getRenderWith() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getRenderHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
