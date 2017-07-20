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
		Calendar now = Calendar.getInstance();

		// Check if any jobs have completed and if so, add threads back to available
		ListIterator litr = (new ArrayList<Thread>(inUse)).listIterator();
		Thread currThread;
		while(litr.hasNext()){
			currThread = (Thread) litr.next();
			if(currThread.getCompletionTime().compareTo(now) <= 0){
				litr.remove();
				available.add(currThread);
				System.out.println("\tAdding Thread " + Integer.toString(currThread.getId()) + " back to threadPool");
			}
		}

		Calendar threadEnd = Calendar.getInstance();
		threadEnd.setTimeInMillis(System.currentTimeMillis() + jobTimeLength);
		//threadEnd.add(Calendar.MILLISECONDS, jobTimeLength);
		if(!available.isEmpty()){
			Thread oldThread = available.iterator().next();	
			available.remove(oldThread);
			inUse.add(oldThread);
			oldThread.assign(threadEnd);
			System.out.println("\tTaking Thread " + Integer.toString(oldThread.getId()) + " from threadPool");
			return oldThread;
		} 

		// Create new thread because none are available;
		threadCount++;
		System.out.println("New Thread Created, thread " + Integer.toString(threadCount));
		Thread newThread = new Thread(threadEnd, threadCount);
		inUse.add(newThread);
		return newThread;
	}
		
	public static void returnThread(Thread terminatedThread){
		inUse.remove(terminatedThread);
		available.add(terminatedThread);
	}
}
