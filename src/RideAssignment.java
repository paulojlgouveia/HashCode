
import java.util.*;
import java.lang.*;

public class RideAssignment {
	
	public static int manhattanDistance(int x1, int y1, int x2, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1-y2);
	}
	
	
	
	///// comparator classes /////
	
	public static Comparator<Ride> LatestFinishComparator = new Comparator<Ride>(){
		@Override
		public int compare(Ride r1, Ride r2) {
            return (int) (r1.getLatestFinish() - r2.getLatestFinish());
        }
	};
	
	public static Comparator<Ride> DurationComparator = new Comparator<Ride>(){
		@Override
		public int compare(Ride r1, Ride r2) {
            return (int) (r1.getDuration() - r2.getDuration());
        }
	};
	
	
	
	///// ride distribution functions /////
	
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

	public static void evenOrderedByFirstToEnd(List<Car> cars, List<Ride> rides) {
		
		// fyi PriorityQueue implements min/maxHeap => O(log(n)) operations
		Queue<Ride> orderedRides = new PriorityQueue<>(rides.size(), LatestFinishComparator);
		for (Ride ride : rides)
			orderedRides.add(ride);
		
		int counter = 0;
		while (orderedRides.size() > 0) {
			if (counter >= cars.size())
				counter = 0;
				
			cars.get(counter).addRide(orderedRides.remove());
			counter++;
		}
	}
	
	public static void evenOrderedByDuration(List<Car> cars, List<Ride> rides) {
		
		Queue<Ride> orderedRides = new PriorityQueue<>(rides.size(), DurationComparator);
		for (Ride ride : rides)
			orderedRides.add(ride);
		
		int counter = 0;
		while (orderedRides.size() > 0) {
			if (counter >= cars.size())
				counter = 0;
				
			cars.get(counter).addRide(orderedRides.remove());
			counter++;
		}
	}
	


}

