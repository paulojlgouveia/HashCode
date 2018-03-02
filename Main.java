
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{

	
	public static void writeToFile(List<Car> cars) throws IOException {
		String str = "";
		
		for (Car car : cars) {
			str = str + car.toOutput() + "\n";
		}
		
		FileOutputStream outputStream = new FileOutputStream("outputE.txt");
		byte[] strToBytes = str.getBytes();
		outputStream.write(strToBytes);
		
		outputStream.close();
	}
	

	public static void main(String args[]) throws IOException {
		InputReader ir = new InputReader();
		
		int totalCars = ir.getParams().get("F");
		int totalRides = ir.getParams().get("N");
		int time = ir.getParams().get("T");
		
		List<Car> cars = new ArrayList<Car>(totalCars);
		
		for (int i = 0; i < totalCars; i++) {
			cars.add(new Car(i+1, 0, 0));
		}
		

		
		
		List<Ride> rides = new ArrayList<Ride>(totalRides);
		int count = 0;
		for (String str : ir.getRides()) {

			String parse[] = str.split(" ");
			
			rides.add(new Ride(count,
							Integer.parseInt(parse[0]),
							Integer.parseInt(parse[1]),
							Integer.parseInt(parse[2]),
							Integer.parseInt(parse[3]),
							Integer.parseInt(parse[4]),
							Integer.parseInt(parse[5])));
			count++;
		}

		for(int i = 0; i < Math.min(cars.size(),rides.size()); i++){
			cars.get(i).setRide(rides.get(i));

		}

		List<Ride> willRemove = new ArrayList<Ride>(totalRides);

		for(int t = 1; t < time; t++){
			//update cars
			for (Car car : cars) {
				if(car.getRide() != null && car.earliestFinish(t,car.getRide()) == 0  ){
					car.setRide(null);
				}
			}
			//check for rides
			for (Ride ride : rides) {
				Car bestCar = null;	
				int bestDist = 0;	
				for (Car car : cars) {
					if(bestCar == null){
						bestCar = car;
						bestDist = car.earliestFinish(t,ride);
						continue;
					} 
					if(car.earliestFinish(t,ride) < bestDist && car.getRide() == null){
						bestCar = car;
						bestDist = car.earliestFinish(t,ride);
					}
				}
				bestCar.addRide(ride);
				bestCar.setRide(ride);
				willRemove.add(ride);
			}	
			for(Ride ride: willRemove){
				rides.remove(ride);
			}
		}
		for(Car car: cars){
			System.out.println(car.toOutput());
		}
		
		writeToFile(cars);
		
		
	}
}