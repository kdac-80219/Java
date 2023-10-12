package tester;

import com.app.vehicle.Vehicle;

public class TestVehicle {

	public static void main(String[] args) {
//		
//		Vehicle v1 = new Vehicle(1,"Red",450000);
//		v1.display();
//		
//		Vehicle v2 = new Vehicle(2,"White",650000);
//		v2.display();
		

		Vehicle v1 = new Vehicle(1,"Red",450000);
		v1.display();
		
		Vehicle v2 = new Vehicle(1,"White",650000);
		v2.display();
		
		if(v1.equals(v2))
		{
			System.out.println("SAME");
		}
		else
			System.out.println("DIFFERENT");
		
		
		

	}

}
