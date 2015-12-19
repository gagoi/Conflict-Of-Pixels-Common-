package fr.cop.common;

import java.io.File;
import java.util.Vector;

import fr.cop.common.entities.champions.Champion;
import fr.cop.common.entities.champions.individual.Champion_Test_1;
import fr.cop.common.entities.spells.Spell_Base;
import fr.cop.common.logger.SimpleLog;

public class Game {

	private int time; // Temps de jeu (en secondes).
	private Champion[] champs;
	private Vector<Spell_Base> spells;
	private Level lvl;
	public static File gameFolder;
	public static SimpleLog logger;

	public final static int TYPE_SERVER = 0;
	public final static int TYPE_CLIENT = 1;
	
	private int type;

	public Game(String path, int type) {
		gameFolder = new File(path);
		this.type = type;
		logger = new SimpleLog();
		if (!gameFolder.exists()) {
			gameFolder.mkdirs();
			logger.logTxt("Folder Error ! ", "Create it !");
		}
		if (type == Game.TYPE_CLIENT) {
			lvl = new Level("map", 50); // Cr�ation de notre map, de param�tre son nom et sa taille.
			champs = new Champion[10];
			champs[0] = new Champion_Test_1() {
				public String getSpriteInformation() {
					return "tf";
				};
			};
			champs[1] = new Champion_Test_1() {
				public String getSpriteInformation() {
					return "top_tree";
				};
			};
			champs[2] = new Champion_Test_1() {
				public String getSpriteInformation() {
					return "bot_tree";
				};
			};
			for (int i = 3; i < champs.length; i++) {
				champs[i] = new Champion_Test_1();
			}
		}
	}

	public void incrementTime() {
		time++;
	}

	public int getTime() {
		return time;
	}

	public String formatedTime() {
		int hour = time % 3600;
		int min = (time - hour * 3600) % 60;
		int sec = time - min * 60;
		if (hour >= 1) return (hour + ":" + min + ":" + sec);
		else return (min + ":" + sec);
	}

	public void getInformation() {

	}

	public void setChampions(Champion[] champs) {
		this.champs = champs;
	}

	public Champion getChampion(int id) {
		return champs[id];
	}

	public Level getMap() {
		return lvl;
	}

	public int getChampionsNumber() {
		return champs.length;
	}

	public Vector<Spell_Base> getSpells() {
		return spells;
	}

	public void requestMove(Champion champ, int x, int y) {
		champ.requestMove(x, y);
	}

	public int getType() {
		return type;
	}
}
