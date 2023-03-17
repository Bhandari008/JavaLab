package multithreadPackage;

public class ThreadYieldMethod {

	synchronized public void run() {
		for(int i=0;i<3;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " is running");
		}
	}
	
		
	public static void main(String[] args){

			ThreadSleepMethod tm1 = new ThreadSleepMethod();
			tm1.start();
			
			for(int i=0;i<3;i++) {
				System.out.println(Thread.currentThread().getName() + " is running");
			}		
	}
}

