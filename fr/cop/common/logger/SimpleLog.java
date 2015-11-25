package fr.cop.common.logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import fr.cop.common.Game;

public class SimpleLog {

	public File logFile = new File(Game.gameFolder, "log.txt");
	private Calendar cal = Calendar.getInstance();
	private PrintWriter writer;

	public SimpleLog() {
		if (!Game.gameFolder.exists()) Game.gameFolder.mkdirs();
		if (!logFile.exists()) try {
			logFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			writer = new PrintWriter(new FileOutputStream(logFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public SimpleLog(String path) {
		Game.gameFolder = new File(path);
		if (!Game.gameFolder.exists()) Game.gameFolder.mkdirs();
		if (!logFile.exists()) try {
			logFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			writer = new PrintWriter(new FileOutputStream(logFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void logTxt(String tag, String message) {
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println("[" + hour + "H " + min + "M " + sec + "S] :: " + tag + " : " + message);
		writer.println("[" + hour + "H " + min + "M " + sec + "S] :: " + tag + " : " + message);
		writer.flush();
	}

	public void logErr(String tag, String message) {
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.err.println("[" + hour + "H " + min + "M " + sec + "S] :: " + "/!\\ERROR/!\\" + tag + " : " + message);
		writer.println("[" + hour + "H " + min + "M " + sec + "S] :: " + "/!\\ERROR/!\\" + tag + " : " + message);
		writer.flush();
	} 
}
