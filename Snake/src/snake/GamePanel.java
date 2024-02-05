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
	
	Thread gameThread;
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
	}

	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
	public void run() {
		
		while(gameThread != null) {
			
			System.out.println("The game is on.");
			
			//update();
			repaint();
			klkjh
		}
		
	}
	
	public void update() {
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.white);
		g.fillRect(10, 10, cellSize, cellSize);
		g.dispose();
	}
	
}
