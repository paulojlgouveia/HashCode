
import java.util.*;
import java.lang.*;

public class RideAssignment {
	
	public static int manhattanDistance(int x1, int y1, int x2, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1-y2);
	}
	
	
	public static void firstTakesAll(List<Car> cars, List<Ride> rides) {
		for (Ride ride : rides)
			cars.get(0).addRide(ride);
	}
	
	
	public static void even(List<Car> cars, List<Ride> rides) {
		int counter = 0;
		for (Ride ride : rides) {
			if (counter >= cars.size())
				counter = 0;
				
			cars.get(counter).addRide(ride);
			counter++;
		}
	}



}

