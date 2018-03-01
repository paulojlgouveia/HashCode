import java.io.*;
import java.util.*;

public class Ride{
	public int startX;
	public int startY;
	public int endX;
	public int endY;
	public int earliestStart;
	public int latestFinish;

	public Ride(int startX, int startY, int endX, int endY, int earliestStart, int latestFinish){
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
		this.earliestStart = earliestStart;
		this.latestFinish = latestFinish;
	}

	public void setStartX(int startX){
		this.startX = startX;
	}

	public int getStartX(){
		return this.startX;
	}

	public void setStartY(int startY){
		this.startY = startY;
	}

	public int getStartY(){
		return this.startY;
	}

	public void setEndX(int endX){
		this.endX = endX;
	}

	public int getEndX(){
		return this.endX;
	}

	public void setEndY(int endY){
		this.endY = endY;
	}

	public int getEarliestStart(){
		return this.earliestStart;
	}

	public void setEarliestStart(int earliestStart){
		this.earliestStart = earliestStart;
	}

	public int getEarliestStart(){
		return this.earliestStart;
	}

	public void setLatestFinish(int latestFinish){
		this.latestFinish = latestFinish;
	}

	public int getLatestFinish(){
		return this.latestFinish;
	}
}

