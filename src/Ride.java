
public class Ride {
	
	private int _id;
	private int _xi, _xf, _yi, _yf;
	private int _earliestStart;
	private int _latestFinish;
	private int _duration;
	
	
	public Ride(int id, String rideAsString) {
		_id = id;
		
		String parsed[] = rideAsString.split(" ");
		_xi = Integer.parseInt(parsed[0]);
		_yi = Integer.parseInt(parsed[1]);
		_xf = Integer.parseInt(parsed[2]);
		_yf = Integer.parseInt(parsed[3]);
		_earliestStart = Integer.parseInt(parsed[4]);
		_latestFinish = Integer.parseInt(parsed[5]);
		
		_duration = Aux.manhattanDistance(_xi, _yi, _xf, _yf);
	}
	
	public Ride(int id, int xi, int yi, int xf, int yf, int es, int lf) {
		_id = id;
		_xi = xi;
		_yi = yi;
		_xf = xf;
		_yf = yf;
		_earliestStart = es;
		_latestFinish = lf;
		
		_duration = Aux.manhattanDistance(xi, yi, xf, yf);
	}
	
	
	public int getId() { return _id;}
	public int getStartX() { return _xi; }
	public int getStartY() { return _yi; }
	public int getEndX() { return _xf; }
	public int getEndY() { return _yf; }
	public int getEarliestStart() { return _earliestStart; }
	public int getLatestFinish() { return _latestFinish; }
	public int getDuration() { return _duration; }
	
	
	public void setStartX(int startX) { _xi = startX; }
	public void setStartY(int startY) { _yi = startY; }
	public void setEndX(int endX) { _xf = endX; }
	public void setEndY(int endY) { _yf = endY; }
	public void setEarliestStart(int earliestStart) { _earliestStart = earliestStart; }
	public void setLatestFinish(int latestFinish) { _latestFinish = latestFinish; }
	
	
	
	public String toString() {
		String out = "RIDE - ";
		out += "[" + _xi + "," + _yi + "]" + " > " + "[" + _xf + "," + _yf + "]"
			+ ", earliestStart: " + _earliestStart
			+ ", latestFinish: " + _latestFinish;
		
		return out;
	}
	
// 	public int getTimeToFinish(int currentTimeStep) {
// 		return (_pickup + _duration) - currentTimeStep;
// 	}
}

