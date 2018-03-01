
import java.util.*;


public class Main{
	public static void main(String args[]){
		InputReader ir = new InputReader();
		
		int totalCars = ir.getParams().get("F");
		int totalRides = ir.getParams().get("N");
		
		
		ArrayList<Car> cars = ArrayList<Cars>(totalCars)
		
		for (int i = 0; i++ ; i < totalCars) {
			cars.add(new Car(0, 0))
		}
		
		
		ArrayList<Ride> rides = ArrayList<Ride>(totalRides)
		
		for String str in ir.getRides() {
			String parse[] = str.split(' ');
			
			rides.add(new Ride(Integer.parseInt(parse[0]),
								Integer.parseInt(parse[1]),
								Integer.parseInt(parse[2]),
								Integer.parseInt(parse[3]),
								Integer.parseInt(parse[4]),
								Integer.parseInt(parse[5])))
		}
		
	}
}