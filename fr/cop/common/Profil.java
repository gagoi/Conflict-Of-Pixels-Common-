package fr.cop.common;

public class Profil {

	int wins = 52;
	String nickname, UUID;
	int xpAmmount = 150;

	public Profil() {
		nickname = "Gagoi";
	}

	public int getWin() {
		return this.wins;
	}

	public String getFormattedKDA() {
		return ("Kills : " + 2 + "\rDeaths : " + 3);
	}
	
	public int getXpAmmount(){
		return xpAmmount;
	}
	
	public String getNickname(){
		return nickname;
	}
	
	public String getUUID(){
		return "player:AAAABBBBCCCC0000";
	}

	public float getXpAmmountInLevel() {
		return getXpAmmount()/getNextLevelNeededXp();
	}

	public float getNextLevelNeededXp() {
		return getXpAmmount()*2;
	}

	public int getIcon() {
		return 0;
	}
}
