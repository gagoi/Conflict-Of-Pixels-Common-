package fr.cop.common.entities.champions;

public abstract class Character {
	public int x, y;
	public int xSize, ySize;
	

	public Character() {

	}

	public abstract int getId();

	public abstract String getName();

	public abstract void spell0();

	public abstract void spell1();

	public abstract void spell2();

	public abstract void spell3();

	public void spell(int idSpell) {
		switch (idSpell) {
		case 0:
			spell0();
			break;
		case 1:
			spell1();
			break;
		case 2:
			spell2();
			break;
		case 3:
			spell3();
			break;

		default:
			break;
		}
	}
}