package synchronizationPackage;

public class SynchronizedConcept extends Thread{
	static CricketSyncMethod cric;
	static CricketSyncBlock cricBlock;
	int balls;
	
	public void run()
	{
		cric.throwBalls(balls);
	}

	public static void main(String[] args) {
		
		// Synchronization using sync method
		cric = new CricketSyncMethod();
		SynchronizedConcept sandip = new SynchronizedConcept();
		sandip.balls = 1;
		sandip.start();
		
		SynchronizedConcept dipendra = new SynchronizedConcept();
		dipendra.balls = 6;
		dipendra.start();
		
		// Synchronization using sync block
		cricBlock = new CricketSyncBlock();
		SynchronizedConcept sandipBlock = new SynchronizedConcept();
		sandipBlock.balls = 1;
		sandipBlock.start();
		
		SynchronizedConcept dipendraBlock = new SynchronizedConcept();
		dipendraBlock.balls = 6;
		dipendraBlock.start();
		
		
		
		
		
		
	}

}
