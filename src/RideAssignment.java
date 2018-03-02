
import java.util.List;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class RideAssignment {
	
	///// comparator classes /////
	
	public static Comparator<Car> TravelDistanceComparator = new Comparator<Car>(){
		@Override
		public int compare(Car c1, Car c2) {
            return (int) (c1.getTravelledDistance() - c2.getTravelledDistance());
        }
	};
	
	
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
	
	
	public static void shortestTravellOrderedByFirstToEnd(List<Car> cars, List<Ride> rides) {
		
		Queue<Ride> orderedRides = new PriorityQueue<>(rides.size(), LatestFinishComparator);
		for (Ride ride : rides)
			orderedRides.add(ride);
			
		Queue<Car> orderedCars= new PriorityQueue<>(cars.size(), TravelDistanceComparator);
		for (Car car: cars)
			orderedCars.add(car);
		
		Car car = null;
		while (orderedRides.size() > 0) {
			car = orderedCars.remove();
			car.addRide(orderedRides.remove());
			orderedCars.add(car);
		}
	}
	
	
	public static void closestOrderedByFirstToEnd(List<Car> cars, List<Ride> rides) {
		
		Queue<Ride> orderedRides = new PriorityQueue<>(rides.size(), LatestFinishComparator);
		for (Ride ride : rides)
			orderedRides.add(ride);
			
		Ride ride = null;
		int xi, yi;
		while (orderedRides.size() > 0) {
			ride = orderedRides.remove();
			xi = ride.getStartX();
			yi = ride.getStartY();
			
			Car bestCar = cars.get(0);
			int delta = Aux.manhattanDistance(bestCar.getX(), bestCar.getY(), xi, yi);
			int bestDistance = delta;
			
			for (Car car : cars) {
				delta = Aux.manhattanDistance(car.getX(), car.getY(), xi, yi);
				
				if (delta < bestDistance) {
					bestDistance = delta;
					bestCar = car;
				}
			}
			
			bestCar.addRide(ride);
		}
		
		
		Queue<Car> orderedCars= new PriorityQueue<>(cars.size(), TravelDistanceComparator);
		for (Car car: cars)
			orderedCars.add(car);
		
		Car car = null;
		while (orderedRides.size() > 0) {
			car = orderedCars.remove();
			car.addRide(orderedRides.remove());
			orderedCars.add(car);
		}
	}


}

