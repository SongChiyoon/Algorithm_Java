package simulatedAnnealing2;

public class City {
	private int x;
	private int y;
	City(){
		x = (int)Math.random() * 100;
		y = (int)Math.random() * 100;
		
	}
	City(int x, int y){
		this.x = x;
		this.y = y;
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
	public double distanceTo(City c){
		int xDistance = Math.abs(getX() - c.getX());
		int yDistance = Math.abs(getY() - c.getY());
		return Math.sqrt((xDistance*xDistance) + (yDistance * yDistance));
	}
	@Override 
	public String toString(){
		return x +"-" +y;
	}
}
