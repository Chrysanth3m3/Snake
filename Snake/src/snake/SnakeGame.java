package snake;

import javax.swing.*;

public class SnakeGame {	

    public static void main(String[] args) {
        
    	JFrame frame = new JFrame("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
       
        
        
//        JButton button = new JButton("Start Game");
//        button.setBounds(50, 50, 100, 20);
//        JTextField textField = new JTextField();
//        textField.setBounds(10,10, 150,20); 
//        //button.addKeyListener(null);
//        button.addActionListener(new ActionListener(){
//        	public void actionPerformed(ActionEvent e) {
//        		textField.setText("Welcome to Snake");
//        	}
//        });
        
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.pack();
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        gamePanel.startGameThread();
        

    }

	
}
