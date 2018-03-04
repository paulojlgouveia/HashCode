
import java.util.List;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;


class RunnableMain extends Thread {
	private InputReader _ir;
	
	RunnableMain(InputReader ir) {
		_ir = ir;
	}
	
	
	public void run() {
		int availableCars = _ir.getParams().get("F");
		int availableRides = _ir.getParams().get("N");
		int time = _ir.getParams().get("T");
		
		List<Car> cars = new ArrayList<Car>(availableCars);
		List<Ride> rides = new ArrayList<Ride>(availableRides);
		List<Ride> discardedRides = new ArrayList<Ride>();
		
		// populate lsit of cars
		for (int i = 0; i < availableCars; i++)
			cars.add(new Car());
		
		// populate lsit of rides
		int rideId = 0;
		for (String str : _ir.getRides())
			rides.add(new Ride(rideId++, str));
		
// 		Aux.printState(cars, rides, discardedRides);
		
		
		// FIXME: replace by desired ride distribution function
		RideAssignment.closestOrderedByFirstToEnd(cars, rides);
		
		
		OutputWriter.writeToFile("output/" + _ir.getOutputFileName(), cars);
		
		System.out.println("finished " + _ir.getOutputFileName());
	}
	
}
	
	

