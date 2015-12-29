package fr.cop.common.entities.champions.individual;

import fr.cop.common.entities.champions.Champion;
import fr.cop.common.entities.spells.Spell_Base;
import fr.cop.common.entities.spells.Spell_Base_Targeted;
import fr.cop.common.entities.spells.Spell_Base_Untargeted;

public class Champion_Test_1 extends Champion {
	public Champion_Test_1() {
		super("Test_0x000001");
	}
	
	@Override
	public Spell_Base[] getSpells() {
		Spell_Base_Targeted spell1 = new Spell_Base_Targeted("Spell1:target");
		Spell_Base_Untargeted spell2 = new Spell_Base_Untargeted("Spell2:untarget");
		Spell_Base_Targeted spell3 = new Spell_Base_Targeted("Spell3:target");
		Spell_Base_Untargeted spell4 = new Spell_Base_Untargeted("Spell4:untarget");
		return new Spell_Base[] { spell1, spell2, spell3, spell4 };
	}
}
