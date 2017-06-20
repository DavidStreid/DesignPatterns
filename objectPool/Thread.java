package objectPool;

import java.util.Calendar;

public class Thread{
	Calendar jobTerminationTime;
	public Thread(Calendar jobTT){
		this.jobTerminationTime = jobTT;
	}
	public void assign(Calendar jobTT){
		this.jobTerminationTime = jobTT;
	}
	public Calendar getCompletionTime(){
		return jobTerminationTime;
	}
}
