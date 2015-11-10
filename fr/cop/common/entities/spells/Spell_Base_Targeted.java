package fr.cop.common.entities.spells;

import java.awt.Polygon;

public class Spell_Base_Targeted extends Spell_Base{

	public Spell_Base_Targeted(String name){
		super(name);
	}
	
	@Override
	public Polygon getHitbox() {
		return null;
	}
}
