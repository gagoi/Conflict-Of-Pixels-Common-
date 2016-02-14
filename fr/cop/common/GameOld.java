package fr.cop.common;

import java.io.File;
import java.util.Vector;

import fr.cop.common.entities.BaseEntity;
import fr.cop.common.logger.SimpleLog;

public class GameOld {

	private int time; // Temps de jeu (en secondes).
	private Level lvl;
	public static File gameFolder;
	public static SimpleLog logger;
	
	private Vector<BaseEntity> entities = new Vector<BaseEntity>();

	public final static int TYPE_SERVER = 0;
	public final static int TYPE_CLIENT = 1;

	private int type;

	public GameOld(String path, int type) {
		gameFolder = new File(path);
		this.type = type;
		logger = new SimpleLog();
		if (!gameFolder.exists()) {
			gameFolder.mkdirs();
			logger.logTxt("Folder Error ! ", "Create it !");
		}
		if (type == GameOld.TYPE_CLIENT) {
			lvl = new Level("map", 50); // Cr�ation de notre map, de param�tre son nom et sa taille.
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

	public Level getMap() {
		return lvl;
	}

	public int getType() {
		return type;
	}
}
