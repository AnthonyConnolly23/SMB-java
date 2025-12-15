package com.game.object.util;

import java.awt.event.KeyAdapter;

// Extending keyAdapter allows the extending class (KeyInput) to become a keyEvent Listener
// A KeyEvent Listener takes action when certain events take place (keyPress, keyRelease, etc.)
public class KeyInput extends KeyAdapter {
	
	private boolean[] keyDown = new boolean[4];
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	//@Override
	//public void keyPressed(keyEvent e) {
		
	//}

}
