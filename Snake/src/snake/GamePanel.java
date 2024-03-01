package snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
	
	// screen size settings based on cell size
	final int cellSize = 10;
	final int numCol = 40;
	final int numRow = 40;
	
	final int screenWidth = numRow * cellSize;
	final int screenHeight = numCol * cellSize;
	
	// FPS
	int FPS = 60;
	
	KeyHandler keyH = new KeyHandler();
	Thread gameThread;
	
	// Set snake default position
	int snakeX = 100;
	int snakeY = 100;
	// TODO: change to have typical automatic snake increment
	int playerSpeed = 10;
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
	}

	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
	public void run() {
		
		double drawInterval = 1000000000/FPS;
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		
		
		while(gameThread != null) {
			
			currentTime = System.nanoTime();	
			
			delta += (currentTime - lastTime) / drawInterval;
			
			lastTime  = currentTime;
			
			if(delta >= 1) {
				update();
				repaint();
				delta--;
			}
			
		}
		
	}
	
	public void update() {
		if(keyH.upPressed == true) {
			snakeY -= playerSpeed;
		} else if(keyH.downPressed == true) {
			snakeY += playerSpeed;
		} else if (keyH.leftPressed) {
			snakeX -= playerSpeed;
		} else if (keyH.rightPressed) {
			snakeX += playerSpeed;
		}
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.white);
		g.fillRect(snakeX, snakeY, cellSize, cellSize);
		g.dispose();
	}
	
}
