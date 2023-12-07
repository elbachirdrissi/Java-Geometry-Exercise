public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		x=0;
		y=0;
	}

	public double getX() {
        return x;
    }
	
    public double getY() {
        return y;
    }

	public double distanceTo(Point P) {
		return Math.sqrt( Math.pow( (P.x - this.x),2 ) + Math.pow( (P.y - this.y),2 ) );
	}
	
	public Point translate(double dx, double dy) {
		Point pt = new Point(x+dx, y+dy);
		return pt;
	}
	
	public static void main(String[] args) {
		Point p1, p2;
		p1 = new Point(4,5);
		p2 = new Point(6,7);
		System.out.println("les coordones du point p1 sont: ("+p1.x+","+p1.y+")");
		System.out.println("les coordones du point p2 sont: ("+p2.x+","+p2.y+")");
	}
}
