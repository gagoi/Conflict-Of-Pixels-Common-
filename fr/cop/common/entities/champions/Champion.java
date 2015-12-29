package fr.cop.common.entities.champions;

import java.awt.Polygon;
import java.util.Vector;

import fr.cop.common.Buffs;
import fr.cop.common.Game;
import fr.cop.common.Stats;
import fr.cop.common.entities.Entity;
import fr.cop.common.entities.spells.Spell_Base;

public class Champion implements Entity {

	private Spell_Base[] spells = new Spell_Base[4];
	private int posX, posY, posXRequested, posYRequested, step;
	private final String displayedName;

	public static final int DIRECTION_TOP = 0;
	public static final int DIRECTION_BOTTOM = 1;
	public static final int DIRECTION_RIGHT = 2;
	public static final int DIRECTION_LEFT = 3;

	public static final int STEP_CENTER = 0;
	public static final int STEP_RIGHT = 1;
	public static final int STEP_LEFT = 2;

	public Champion(String name) {
		this.displayedName = name;
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
	public String getDisplayedName() {
		return this.displayedName;
	}

	@Override
	public String getUUID() {
		return "champion:" + getDisplayedName().toLowerCase();
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
	}

	@Override
	public void onDamageDealt() {
	}

	@Override
	public String getSpriteInformation() {
		return null;
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

	@Override
	public int getRenderWith() {
		return 16;
	}

	@Override
	public int getRenderHeight() {
		return 32;
	}

	public void requestMove(int x, int y) {
		Game.logger.logTxt("Champ:MoveRequested", "Server Pos Requested : (" + x + ";" + y + ").");
		posXRequested = x;
		posYRequested = y;
	}

	public void move() {
		this.step++;
		if(this.step > 2) this.step = 0;
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
	
	public int getStep(){
		return this.step;
	}
}
