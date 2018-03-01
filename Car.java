import java.io.*;
import java.util.*;

public class Car{
	public int x;
	public int y;
	public Ride ride;

	public Car(int x, int y){
		this(x,y,null);
	}

	public Car(int x, int y, Ride ride){
		this.x = x;
		this.y = y;
		this.ride = ride;
	}

	public void setX(int x){
		this.x = x;
	}

	public int getX(){
		return this.x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int getY(){
		return this.y;
	}

	public void setRide(Ride ride){
		this.ride = ride;
	}

	public Ride getRide(){
		return this.ride;
	}
}

