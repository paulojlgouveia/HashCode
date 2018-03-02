
import java.io.*;
import java.util.*;

public class Car{
	private int _x;
	private int _y;
	private List<Ride> _rides = null;

	
	public Car(int x, int y) {
		_x = x;
		_y = y;
		_rides = new ArrayList<Ride>();
	}

	public Car(int x, int y, Ride ride) {
		this(x, y);
		_rides.add(ride);
	}
	
	public Car(int x, int y, List<Ride> rides) {
		_x = x;
		_y = y;
		_rides = rides;
	}
	
	
	
	public int getX() { return _x; }
	public int getY() { return _y; }
	public List<Ride> getRides() { return _rides; }

	public void setX(int x){ _x = x; }
	public void setY(int y){ _y = y; }
	public void setRides(List<Ride> rides){ _rides = rides; }
	
	public void addRide(Ride ride) { _rides.add(ride); }
	
	
	public String toString() {
		String out = null;
		
		if (_rides == null) {
			out = "CAR - x: " + _x + ", y: " + _y + ", rides: Null";
			
		} else {
			out = "CAR - x: " + _x + ", y: " + _y + ", rides: ";
			
			for (Ride ride : _rides)
				out += "\n\t" + ride.toString();	
		}
		
		return out;
	}
	
	public String toOutput(){
		String out = "" + _rides.size();
		
		for(Ride ride : _rides)
			out += " " + ride.getId();
			
		return out;
	}
	
	
	
// 	int earliestFinish(int currentTimeStep, Ride possibleRide) {
// 		return this.ride.getTimeToFinish(currentTimeStep) + possibleRide.getTimeToFinish(currentTimeStep);
// 	}


}

