
import java.io.*;
import java.util.*;

public class Car{
	public int id;
	public int x;
	public int y;
	public Ride ride;
	public List<Ride> rides = new ArrayList<Ride>();
	

	public Car(int id, int x, int y){
		this(id, x,y,null);
	}

	public Car(int id, int x, int y, Ride ride){
		this.id = id;
		this.x = x;
		this.y = y;
		this.ride = ride;
	}
	
	public int getX(){ return this.x; }
	public int getY(){ return this.y; }
	public Ride getRide(){ return this.ride; }

	public void setX(int x){ this.x = x; }
	public void setY(int y){ this.y = y; }
	public void setRide(Ride ride){ this.ride = ride; }
	public void addRide(Ride ride){ this.rides.add(ride);}
	
	
	public String toOutput(){
		String ret = "" + id;
		for(Ride ride : rides){
			ret += " " + ride.getId();
		}
		return ret;
	}
	public String toString() {
		if (ride == null) {
			return "CAR - x: " + x + ", y: " + y + ", ride: Null";
			
		} else {
			return "CAR - x: " + x + ", y: " + y + ", ride: " + ride.toString();
		}
	}
	
	int earliestFinish(int currentTimeStep, Ride possibleRide) {
		return this.ride.getTimeToFinish(currentTimeStep) + possibleRide.getTimeToFinish(currentTimeStep);
	}


}

