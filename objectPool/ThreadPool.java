package objectPool;

import java.util.*;

public class ThreadPool{
	private static ThreadPool threadPool;
	private static Set<Thread> inUse, available;
	private static int threadCount;
	
	private ThreadPool(){
		inUse = new HashSet<Thread>();
		available = new HashSet<Thread>();	
		threadCount = 0;
	}

	public static ThreadPool getPool(){
		if(threadPool==null){
			return new ThreadPool();
		} else{
			return threadPool;
		}
	}

	public static Thread getThread(int jobTimeLength){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, jobTimeLength);

		// Check if any jobs have completed
		for(Thread t : inUse){
			if(t.getCompletionTime().compareTo(calendar) >= 0){
				inUse.remove(t);
				available.add(t);
				System.out.println("Thread completed");
			}
		}

		if(!available.isEmpty()){
			Thread oldThread = available.iterator().next();	
			available.remove(oldThread);
			inUse.add(oldThread);
			oldThread.assign(calendar);
			return oldThread;
		} 

		// Create new thread because none are available;
		threadCount++;
		System.out.println("New Thread Created, thread " + Integer.toString(threadCount));
		Thread newThread = new Thread(calendar);
		inUse.add(newThread);
		return newThread;
	}
		
	public static void returnThread(Thread terminatedThread){
		inUse.remove(terminatedThread);
		available.add(terminatedThread);
	}
}
