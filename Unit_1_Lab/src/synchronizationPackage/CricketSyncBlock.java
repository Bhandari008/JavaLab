package synchronizationPackage;

public class CricketSyncBlock {
	int total_balls = 6;
	public void throwBalls(int balls) {
		synchronized (this) {
			if(balls <= total_balls)
			{
				System.out.println(balls + " ball thrown");
				total_balls = total_balls - balls;
				System.out.println(total_balls + " ball remaining");
			}
			else {
				System.out.println(balls + " ball thrown.");
				System.out.println("Over Complete.");
			}	
		}

	}
}
