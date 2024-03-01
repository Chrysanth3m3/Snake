package snake;

import java.util.LinkedList;

public class Snake {
	
	// is made up of snake components
	// moves in a certain direction
	// needs to remember path - pass current position to next element
	private static int snakeIncrement = 10;
	
	private String snakeDirection = "down";
	
	
	// list of snake components that compose the snake
	private LinkedList<SnakeComponent> snakeComponents = new LinkedList<SnakeComponent>(); 
	
	// creates first component with default position
	public Snake() {
		SnakeComponent firstSnakeComp = new SnakeComponent(200, 50);
		addSnakeComponent(firstSnakeComp);
	}
	
	// getters and setters
	public String getSnakeDirection() {
		return snakeDirection;
	}

	public void setSnakeDirection(String snakeDirection) {
		this.snakeDirection = snakeDirection;
	}

	public LinkedList<SnakeComponent> getSnakeComponents() {
		return snakeComponents;
	}

	// add new component
	public void addSnakeComponent(SnakeComponent snakeComponent) {
		this.snakeComponents.add(snakeComponent);
	}
	
	// generate snake component with position from last component
	public void generateNewLastSnakeComponent() {
		// TODO
	}
	
	// function to update component positions
	public void updatePositions() {
		// just for one component
		SnakeComponent snakeHead = this.getSnakeComponents().getFirst();
		if(this.getSnakeDirection() == "up") {
			snakeHead.setY(snakeHead.getY() - Snake.snakeIncrement);
		} else if (this.getSnakeDirection() == "down") {
			snakeHead.setY(snakeHead.getY() + Snake.snakeIncrement);
		} else if (this.getSnakeDirection() == "left") {
			snakeHead.setX(snakeHead.getX() - Snake.snakeIncrement);
		} else if (this.getSnakeDirection() == "right") {
			snakeHead.setX(snakeHead.getX() + Snake.snakeIncrement);
		}
	}
}
