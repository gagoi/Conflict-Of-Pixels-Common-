package fr.cop.common.entities;

public class BaseEntity {

	protected int posX, posY;
	protected String UUID;

	public BaseEntity() {
		
	}

	
	public int getPosX(){
		return this.posX;
	}
	
	public int getPosY(){
		return this.posY;
	}
	
	public void setPosX(int posX){
		this.posX = posX;
	}
	
	public void setPosY(int posY){
		this.posY = posY;
	}
	
	public String getUUID(){
		return this.UUID;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "<Entity:" + UUID + ">: posX=" + posX + " | posY=" + posY;
	}
}
