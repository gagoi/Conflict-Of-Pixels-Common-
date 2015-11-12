package fr.cop.common.logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import fr.cop.game.core.Game_Frame;

public class SimpleLog {

	public File logFile = new File(Game_Frame.gameFolder, "log.txt");
	private PrintWriter writer;

	public SimpleLog() {
		if (!Game_Frame.gameFolder.exists()) Game_Frame.gameFolder.mkdirs();
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
		System.out.println(tag + " : " + message);
		writer.println(tag + " : " + message);
		writer.flush();
	}

	public void logErr(String tag, String message) {
		System.err.println("/!\\ERROR/!\\" + tag + " : " + message);
		writer.println("/!\\ERROR/!\\" + tag + " : " + message);
		writer.flush();
	}
}
