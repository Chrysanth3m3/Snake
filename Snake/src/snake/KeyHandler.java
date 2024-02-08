package snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
	
	public boolean upPressed, rightPressed, downPressed, leftPressed;

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		 
		if (code == (KeyEvent.VK_W | KeyEvent.VK_UP)) {
			 upPressed = true;
		}
		 
		if (code == (KeyEvent.VK_D | KeyEvent.VK_RIGHT)) {
			rightPressed = true;	 
		}
		
		if (code == (KeyEvent.VK_S | KeyEvent.VK_DOWN)) {
			downPressed = true;
		}
		
		if (code == (KeyEvent.VK_A | KeyEvent.VK_LEFT)) {
			leftPressed = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		 
		if (code == (KeyEvent.VK_W | KeyEvent.VK_UP)) {
			 upPressed = false;
		}
		 
		if (code == (KeyEvent.VK_D | KeyEvent.VK_RIGHT)) {
			rightPressed = false;	 
		}
		
		if (code == (KeyEvent.VK_S | KeyEvent.VK_DOWN)) {
			downPressed = false;
		}
		
		if (code == (KeyEvent.VK_A | KeyEvent.VK_LEFT)) {
			leftPressed = false;
		}
		
	}

}
