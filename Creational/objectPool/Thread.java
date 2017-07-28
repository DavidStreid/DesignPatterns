package Creational.objectPool;

import java.util.Calendar;

public class Thread{
	Calendar jobTerminationTime;
	int id;

	public Thread(Calendar jobTT, int id){
		this.jobTerminationTime = jobTT;
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void assign(Calendar jobTT){
		this.jobTerminationTime = jobTT;
	}
	public Calendar getCompletionTime(){
		return jobTerminationTime;
	}
}
