
public class LineSegment {
	private Point point1, point2;

	public LineSegment(Point p1, Point p2) {
		point1 = new Point(p1.getX(), p1.getY());
		point2 = new Point(p2.getY(), p2.getY());
	}

	public double legnth() {
		return point1.distanceTo(point2);
	}
}
