
import java.util.List;
import java.lang.Math;

public class Aux {
	
	public static int manhattanDistance(int x1, int y1, int x2, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1-y2);
	}
	
	
	public static void printState(List<Car> cars, List<Ride> undistributed, List<Ride> discarded) {
		for(Car car : cars)
			System.out.println(car.toString());
		
		System.out.println("Discarded rides:");
		for(Ride ride : discarded)
			System.out.println("    " + ride.toString());
		
		System.out.println("Undistributed rides:");
		for(Ride ride : undistributed)
			System.out.println("    " + ride.toString());
		
	}
	

}

