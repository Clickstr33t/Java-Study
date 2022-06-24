package Chapter03.E03_16;

public class Bug {
	private int position;
	private int direction;
	
	public Bug(int initialPosition) {
		position=initialPosition;
		direction=1;
	}
	
	public void turn() {
		direction=1-direction;
	}
	
	public void move() {
		if (direction==1) {
			position++;
		}else {
			position--;
		}
	}
	
	public int getPosition() {
		return position;
	}

}
