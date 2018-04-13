
public class Point implements Moveable2D, Positionable {

	private double x;
	private double y;

	
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;	
	}
	
	public void move(double x, double y) {
		this.x +=x;
		this.y +=y;	
	}

	@Override
	public void getPosition() {
		
		System.out.println("x: "+x+" y: "+x);
		
	}



}
