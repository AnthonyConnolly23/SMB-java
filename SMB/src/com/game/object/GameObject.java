package com.game.object;
import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.object.util.ObjectId;

public abstract class GameObject {
	
	private float x;
	private float y;
	private ObjectId id;
	private float velX, velY;
	private float width, height;
	private int scale;
	
	public GameObject(float x, float y, ObjectId id, float width, float height, int scale) {
		this.x = x * scale;
		this.y = y * scale;
		this.id = id;
		this.width = width * scale;
		this.height = height * scale;
		this.scale = scale;
	}
	
	// tick() is our update function (game saves, position saves)
	// render updates graphics on screen
	// get bounds - bounding box for collision detection
	
	
	public abstract void tick();			 // methods that will not be defined by the abstract class
	public abstract void render(Graphics g); // up to the player class to determine what these attributes do
	public abstract Rectangle getBounds();
	
	public void applyGravity() {
		
		velY += 0.5f; // gravity function (change to make it look good)
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public void setID(ObjectId id) {
		this.id = id;
	}
	
	public void setVelX(float velX) {
		this.velX = velX;
	}
	
	public void setVelY(float velY) {
		this.velY = velY;
	}
	
	public void setWidth(float width) {
		this.width = width * scale;
	}
	
	public void setHeight( float height) {
		this.height = height * scale;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}

	public ObjectId getID() {
		return id;
	}
	
	public float getVelX() {
		return velX;
	}
	
	public float getVelY() {
		return velY;
	}
	
	public float getWidth() {
		return width;
	}
	
	public float getHeight() {
		return height;
	}
	
	
	
	
}

