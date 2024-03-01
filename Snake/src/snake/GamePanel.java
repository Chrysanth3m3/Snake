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
	int FPS = 1;
	
	KeyHandler keyH = new KeyHandler();
	Thread gameThread;
	
	Snake snake = new Snake();
	
	
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
	  
		  System.out.println(snake.getSnakeDirection());
		  
		  if(keyH.upPressed == true) { 
			  snake.setSnakeDirection("up");
		  } else if(keyH.downPressed == true) {
			  snake.setSnakeDirection("down");
		  } else if (keyH.leftPressed == true) {
			  snake.setSnakeDirection("left");
		  } else if (keyH.rightPressed == true) {
			  snake.setSnakeDirection("right");
		  }
		  
		  snake.updatePositions();
	  
	  }
	 
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		// draw snake
		g.setColor(Color.white);
		for (SnakeComponent comp : snake.getSnakeComponents()) {
			g.fillRect(comp.getX(), comp.getY(), SnakeComponent.getWidth(), SnakeComponent.getHeight());
		}
		g.dispose();
	}
	
}
