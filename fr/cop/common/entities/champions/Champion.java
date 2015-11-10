package fr.cop.common.entities.champions;

import java.awt.Polygon;
import java.util.Vector;

import fr.cop.common.Buffs;
import fr.cop.common.Stats;
import fr.cop.common.entities.Entity;
import fr.cop.common.entities.spells.Spell_Base;

public class Champion implements Entity {

	private Spell_Base[] spells = new Spell_Base[4];

	public Champion() {
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
		return "champion:"+getDisplayedName().toLowerCase();
	}

	@Override
	public int getPosX() {
		return 0;
	}

	@Override
	public int getPosY() {
		return 0;
	}

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public int getHeight() {
		return 0;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void onDamageDealt() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSpriteInformation() {
		return null;
	}

}
