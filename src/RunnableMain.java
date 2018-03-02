
import java.util.List;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;


class RunnableMain extends Thread {
	private InputReader _ir;
	
	RunnableMain(InputReader ir) {
		_ir = ir;
	}
	
	public static void printState(List<Car> cars, List<Ride> undistributed, List<Ride> discarded) {
		for(Car car : cars)
			System.out.println(car.toString());
		
		System.out.println("Discarded rides:");
		for(Ride ride : discarded)
			System.out.println(ride.toString());
		
		System.out.println("Undistributed rides:");
		for(Ride ride : undistributed)
			System.out.println(ride.toString());
		
	}
	
	
	public void writeToFile(String outFile, List<Car> cars) {
		
		try {
			String str = "";
			for (Car car : cars) {
				str = str + car.toOutput() + "\n";
			}
			
			FileOutputStream outputStream = new FileOutputStream(outFile);
			byte[] strToBytes = str.getBytes();
			outputStream.write(strToBytes);
			
			outputStream.close();
			
		} catch(IOException ex) {
			System.out.println("Unable to write to output file '" + outFile + "'");                  
		}
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
			cars.add(new Car(0, 0));
		
		// populate lsit of rides
		int rideId = 0;
		for (String str : _ir.getRides())
			rides.add(new Ride(rideId++, str));
		
// 		printState(cars, rides, discardedRides);
		
		
		// FIXME: replace by desired ride distribution function
		RideAssignment.even(cars, rides);
		
		
		writeToFile("output/" + _ir.getOutputFileName(), cars);
		
		System.out.println("finished " + _ir.getOutputFileName());
	}
	
}
	
	

