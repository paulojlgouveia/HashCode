
import java.io.*;
import java.util.*;

public class Ride {
	
	private int _id;
	private int _xi, _xf, _yi, _yf;
	private int _earliestStart;
	private int _latestFinish;
	private int _duration;
	
	private int _pickup;

	
	public Ride(int id, int xi, int yi, int xf, int yf, int es, int lf) {
		_id = id;
		_xi = xi;
		_yi = yi;
		_xf = xf;
		_yf = yf;
		_earliestStart = es;
		_latestFinish = lf;
		
		_duration = RideAssignment.manhattanDistance(xi, yi, xf, yf);
		_pickup = 0;
	}
	
	public int getId() { return _id;}
	public int getStartX() { return _xi; }
	public int getStartY() { return _yi; }
	public int getEndX() { return _xf; }
	public int getEndY() { return _yf; }
	public int getEarliestStart() { return _earliestStart; }
	public int getLatestFinish() { return _latestFinish; }
	public int getPickup() { return _pickup; }
	
	
	public void setStartX(int startX) { _xi = startX; }
	public void setStartY(int startY) { _yi = startY; }
	public void setEndX(int endX) { _xf = endX; }
	public void setEndY(int endY) { _yf = endY; }
	public void setEarliestStart(int earliestStart) { _earliestStart = earliestStart; }
	public void setLatestFinish(int latestFinish) { _latestFinish = latestFinish; }
	public void setPickup(int currentTimeStep) { _pickup = currentTimeStep; }
	
	
	
	public String toString() {
		String out = "RIDE - ";
		out += "[" + _xi + "," + _yi + "]" + " > " + "[" + _xf + "," + _yf + "]"
			+ ", earliestStart: " + _earliestStart
			+ ", latestFinish: " + _latestFinish;
		
		return out;
	}
	
	public int getTimeToFinish(int currentTimeStep) {
		return (_pickup + _duration) - currentTimeStep;
	}
}

