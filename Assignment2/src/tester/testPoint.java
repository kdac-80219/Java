package tester;

import com.app.geometry.Point2D;

public class testPoint {

	public static void main(String[] args) {
		
		boolean result1;
		boolean result2;
		Point2D p1 = new Point2D(1,2);
		Point2D p2 = new Point2D(4,6);
		
		System.out.println("Point 1 ="+p1.getString());
		System.out.println("Point 2 ="+p2.getString());
		
		if(p1.isEqual(p1, p2))
		{
			System.out.println("Both Points are equal!!!");
		}
		else
		{
			System.out.println("Distance between two points = "+p1.calculateDistance(p1, p2));
		}
		
		
	}

}
