
import java.util.*;
import java.lang.*;

public class Main{

	public static void main(String args[]){
		InputReader ir = new InputReader();
		
		int totalCars = ir.getParams().get("F");
		int totalRides = ir.getParams().get("N");
		int time = ir.getParams().get("T");
		
		List<Car> cars = new ArrayList<Car>(totalCars);
		
		for (int i = 0; i < totalCars; i++) {
			cars.add(new Car(0, 0));
		}
		
		
		List<Ride> rides = new ArrayList<Ride>(totalRides);
		
		for (String str : ir.getRides()) {
			String parse[] = str.split(" ");
			
			rides.add(new Ride(Integer.parseInt(parse[0]),
								Integer.parseInt(parse[1]),
								Integer.parseInt(parse[2]),
								Integer.parseInt(parse[3]),
								Integer.parseInt(parse[4]),
								Integer.parseInt(parse[5])));
		}

		for(int i = 0; i < Math.min(cars.size(),rides.size()); r++){
			cars.get(i).SetRide(rides.get(i));

		}

		for(int t = 1; t < time; t++){
			for(Car car : cars){

			}
		}
		
	}
}