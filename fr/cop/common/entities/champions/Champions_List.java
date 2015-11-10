package fr.cop.common.entities.champions;

import fr.cop.common.entities.champions.individual.Champion_Test_1;

public class Champions_List {

	public static final Champion champ_test_1 = new Champion_Test_1();

	private static Champion[] champs = { champ_test_1 };

	public static Champion getChampionFromUUID(String UUID) {
		for (int i = 0; i < champs.length; i++) {
			if (UUID.equals(champs[i].getUUID())) return champs[i];
		}
		return null;
	}
	
	public static Champion getChampionFromDisplayedName(String name){
		for (int i = 0; i < champs.length; i++) {
			if (name.equals(champs[i].getDisplayedName())) return champs[i];
		}
		return null;
	}
}
