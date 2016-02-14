package fr.cop.common;

import java.util.Timer;
import java.util.Vector;

import fr.cop.common.entities.BaseEntity;

public class Game2 {


	private Vector<BaseEntity> entities = new Vector<BaseEntity>(); // Contient toutes les entitées du jeu.
	private static Timer timer;
	
	
	public Game2() {
		timer = new Timer();
	}
	
	
	public Vector<BaseEntity> getEntities() {
		return this.entities;
	}
}
