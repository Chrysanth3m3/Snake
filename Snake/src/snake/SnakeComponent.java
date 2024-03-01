package snake;

public class SnakeComponent {

	private static int height = 10;
	private static int width = 10;
	private int x;
	private int y;
	
	public SnakeComponent(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static int getHeight() {
		return height;
	}

	public static int getWidth() {
		return width;
	}
	
	
}
