package fr.cop.common.entities.champions;

import java.awt.Polygon;
import java.util.Vector;

import fr.cop.common.Buffs;
import fr.cop.common.Game;
import fr.cop.common.Stats;
import fr.cop.common.entities.Entity;
import fr.cop.common.entities.spells.Spell_Base;
import fr.cop.game.graphics.sprites.ChampionSpriteSystem;

public class Champion implements Entity {

	private Spell_Base[] spells = new Spell_Base[4];
	private int posX, posY, posXRequested, posYRequested;

	public Champion() {
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
		return null;
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
		return 16;
	}

	@Override
	public int getRenderWith() {
		return 16;
	}

	@Override
	public int getRenderHeight() {
		return 16;
	}

	public void requestMove(int x, int y) {
		Game.logger.logTxt("Champ:MoveRequested", "Server Pos Requested : (" + x + ";" + y + ").");
		posXRequested = x;
		posYRequested = y;
	}

	public void move() {
		if (this.posX > this.posXRequested) this.posX -= 1;
		if (this.posX < this.posXRequested) this.posX += 1;
		if (this.posY > this.posYRequested) this.posY -= 1;
		if (this.posY < this.posYRequested) this.posY += 1;
	}

	public int getSpriteSystem() {
		return 0;
	}
}
