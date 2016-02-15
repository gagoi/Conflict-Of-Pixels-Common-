package fr.cop.common.entities.champions;

import java.awt.Polygon;
import java.util.Vector;

import fr.cop.common.Buffs;
import fr.cop.common.Stats;
import fr.cop.common.entities.Entity;
import fr.cop.common.entities.spells.Spell_Base;

public class Champion implements Entity {

	private Spell_Base[] spells = new Spell_Base[4];
	private int posX, posY, posXRequested, posYRequested;
	private final String SERVER_NAME;

	public static final int DIRECTION_TOP = 0;
	public static final int DIRECTION_BOTTOM = 1;
	public static final int DIRECTION_RIGHT = 2;
	public static final int DIRECTION_LEFT = 3;

	public static final int STEP_CENTER = 0;
	public static final int STEP_RIGHT = 1;
	public static final int STEP_LEFT = 2;

	public Champion(String name) {
		SERVER_NAME = name;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Spell_Base[] getSpells() {
		return spells;
	}

	public Champion setSpell1(Spell_Base spell) {
		this.spells[0] = spell;
		return this;
	}

	public Champion setSpell2(Spell_Base spell) {
		this.spells[1] = spell;
		return this;
	}

	public Champion setSpell3(Spell_Base spell) {
		this.spells[2] = spell;
		return this;
	}

	public Champion setSpell4(Spell_Base spell) {
		this.spells[3] = spell;
		return this;
	}

	@Override
	public Polygon getHitbox() {
		return null;
	}


	@Override
	public String getUUID() {
		return "champion:" + SERVER_NAME.toLowerCase();
	}

	@Override
	public Vector<Buffs> getBuffs() {
		return null;
	}

	@Override
	public Stats getStats() {
		return null;
	}

	@Override
	public boolean isFocusable() {
		return true;
	}

	@Override
	public boolean isInvincible() {
		return false;
	}

	@Override
	public void onDeathEvent() {
	}

	@Override
	public void onSpawnEvent() {
	}

	@Override
	public void onRespawnEven() {
	}

	@Override
	public void onDamageTaken() {
	}

	@Override
	public void onDamageDealt() {
	}

	

	@Override
	public int getServerPosX() {
		return posX;
	}

	@Override
	public int getServerPosY() {
		return posY;
	}

	@Override
	public int getServerWidth() {
		return 16;
	}

	@Override
	public int getServerHeight() {
		return 32;
	}

	

	public void requestMove(int x, int y) {
		posXRequested = x;
		posYRequested = y;
	}

	public void move() {
		if (this.posX > this.posXRequested) this.posX -= 5;
		if (this.posX < this.posXRequested) this.posX += 5;
		if (this.posY > this.posYRequested) this.posY -= 5;
		if (this.posY < this.posYRequested) this.posY += 5;
	}

	public int getDirection(){
		if (this.posX > this.posXRequested) return DIRECTION_LEFT;
		if (this.posX < this.posXRequested) return DIRECTION_RIGHT;
		if (this.posY > this.posYRequested) return DIRECTION_BOTTOM;
		if (this.posY < this.posYRequested) return DIRECTION_TOP;
		return DIRECTION_BOTTOM;
	}
}
