
import java.io.*;
import java.util.*;

public class Ride{
	public int startX;
	public int startY;
	public int endX;
	public int endY;
	public int earliestStart;
	public int latestFinish;
	
	public int pickup;
	public int timeToFinish;
	public int duration;

	
	public Ride(int startX, int startY, int endX, int endY, int earliestStart, int latestFinish){
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
		this.earliestStart = earliestStart;
		this.latestFinish = latestFinish;
		
		this.duration = Search.
	}
	
	public int getStartX(){ return this.startX; }
	public int getEndX(){ return this.endX; }
	public int getStartY(){ return this.startY; }
	public int getEndY(){ return this.endY; }
	public int getEarliestStart(){ return this.earliestStart; }
	public int getLatestFinish(){ return this.latestFinish; }
	
	public void setStartX(int startX){ this.startX = startX; }
	public void setEndX(int endX){ this.endX = endX; }
	public void setStartY(int startY){ this.startY = startY; }
	public void setEndY(int endY){ this.endY = endY; }
	public void setEarliestStart(int earliestStart){ this.earliestStart = earliestStart; }
	public void setLatestFinish(int latestFinish){ this.latestFinish = latestFinish; }
	
	public String toString() {
		return "RIDE - xi: " + this.startX + ", xf: " + this.endX
				+ ", yi: " + this.startY + ", yf: " + this.endY
				+ ", earliestStart: " + this.startY + ", earliestStart: " + this.endY;
	}
	
	public int getTimeToFinish(int currentTimeStep) {
		timeToFinish = currentTimeStep 
		return 
	}
}

