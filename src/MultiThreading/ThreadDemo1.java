package MultiThreading;

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("This is Main Thread");
		
	 Thread anotherThread= new AnotherThread();
	 anotherThread.setName("===Another Thread=========");
	 
	 anotherThread.run();
	 
	 
	 //Anonymous Thread 
	 new Thread() {
		 
		 public void run(){
			 
			 System.out.println("This is anonymous class");
		 }
	 }.start();
	 
	 System.out.println("Lets run again the Main thread"); //Run the Main Thread again
	 
	 //anotherThread.start(); -- Illegal state Exception as Another Thread is already started
	 
	 Thread myRunnableThread= new Thread(new MyRunnable(){
		 
		 @Override
	
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("This is the Run method from Anonomous Block of Runnable Interface");
			try{
				anotherThread.join();
				System.out.println("Another Thread Terminated");
			}
			catch(InterruptedException e){
				System.out.println("Inturuppted"+e);
			}
		}
		 });
	
		
		myRunnableThread.start();

		
	
		}
	 
	
	 //myRunnableThread.start();
}
