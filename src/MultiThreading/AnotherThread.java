package MultiThreading;

public class AnotherThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
System.out.println("Hello from the"+getName());	


System.out.println("I am going to Sleep for 3 Seconds");

try {
	
	Thread.sleep(3000);
	
	return ;
}
catch( InterruptedException e){
	
	System.out.println("Exception Caught"+ e);
}

System.out.println("Thread is Getting Awake...!!!");
	}

}
