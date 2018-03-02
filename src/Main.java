
import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {

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
	
	
	private static ArrayList<InputReader> getAllInputs(String dirName, String extension) {
		
		ArrayList<InputReader> irList = new ArrayList<InputReader>();
		
		File directory = new File(dirName);
		File[] directoryListing = directory.listFiles();
		if (directoryListing != null) {
			for (File file : directoryListing) {
				irList.add(new InputReader(directory.getName() + "/" + file.getName()));
			}
			
		} else {
			System.out.println("'" + directory + "'" + "is not a directory.");
		}
		
		return irList;
	}
	
	
	public static void writeToFile(String outFile, List<Car> cars) {
		
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
	
// 	class RunnableMain extends Thread {
// 		private InputReader _ir;
// 		
// 		RunnableMain(InputReader ir) { _ir = ir; }
// 		
// 		public void run() {
// // 			try {
// 				int availableCars = _ir.getParams().get("F");
// 				int availableRides = _ir.getParams().get("N");
// 				int time = _ir.getParams().get("T");
// 				
// 				List<Car> cars = new ArrayList<Car>(availableCars);
// 				List<Ride> rides = new ArrayList<Ride>(availableRides);
// 				List<Ride> discardedRides = new ArrayList<Ride>();
// 				
// 				for (int i = 0; i < availableCars; i++)
// 					cars.add(new Car(0, 0));
// 				
// 				int rideId = 0;
// 				for (String str : _ir.getRides()) {
// 					String parse[] = str.split(" ");
// 					rides.add(new Ride(rideId, Integer.parseInt(parse[0]),
// 												Integer.parseInt(parse[1]),
// 												Integer.parseInt(parse[2]),
// 												Integer.parseInt(parse[3]),
// 												Integer.parseInt(parse[4]),
// 												Integer.parseInt(parse[5])));
// 					rideId++;
// 				}
// 				
// // 				printState(cars, rides, discardedRides);
// 				
// 				// FIXME
// 				RideAssignment.even(cars, rides);
// 				
// 				
// 				writeToFile("output/" + _ir.getOutputFileName(), cars);
// 				
// // 			} catch (InterruptedException e) {
// // 				System.out.println("Computation for " + _ir.getOutputFileName() + "interrupted." );
// // 			}
// 			
// 			System.out.println("finished " + _ir.getOutputFileName());
// 		}
// 		
// 	}
	

	public static void main(String args[]) {
		
		ArrayList<InputReader> irList = getAllInputs("input/", ".in");
		for (InputReader ir : irList) {
			
			int availableCars = ir.getParams().get("F");
			int availableRides = ir.getParams().get("N");
			int time = ir.getParams().get("T");
			
			List<Car> cars = new ArrayList<Car>(availableCars);
			List<Ride> rides = new ArrayList<Ride>(availableRides);
			List<Ride> discardedRides = new ArrayList<Ride>();
			
			for (int i = 0; i < availableCars; i++)
				cars.add(new Car(0, 0));
			
			int rideId = 0;
			for (String str : ir.getRides()) {
				String parse[] = str.split(" ");
				rides.add(new Ride(rideId, Integer.parseInt(parse[0]),
											Integer.parseInt(parse[1]),
											Integer.parseInt(parse[2]),
											Integer.parseInt(parse[3]),
											Integer.parseInt(parse[4]),
											Integer.parseInt(parse[5])));
				rideId++;
			}
			
// 			printState(cars, rides, discardedRides);
			
			
			
			// FIXME
			RideAssignment.even(cars, rides);
			
			
			
			writeToFile("output/" + ir.getOutputFileName(), cars);
			System.out.println("finished " + ir.getOutputFileName());
		}
		
	}
	
}

