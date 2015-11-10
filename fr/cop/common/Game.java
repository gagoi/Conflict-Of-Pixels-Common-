package fr.cop.common;

import fr.cop.common.entities.champions.Champion;

public class Game {

	private int time; // Temps de jeu (en secondes).
	private Champion[] champs;

	
	
	public Game(){
		
	}
	
	
	public void incrementTime(){
		time++;
	}
	public int getTime(){
		return time;
	}
	public String formatedTime(){
		int hour = time%3600;
		int min =  (time-hour*3600)%60;
		int sec = time-min*60;
		if(hour >= 1) return (hour + ":" + min + ":" + sec);
		else return (min + ":" + sec);
	}


	public void getInformation() {
		
	}

	public void setChampions(Champion[] champs){
		this.champs = champs;
	}

	public Champion getChampion(int id){
		return champs[id];
	}

}
