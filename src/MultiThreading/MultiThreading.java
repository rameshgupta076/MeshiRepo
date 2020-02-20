package MultiThreading;

public class MultiThreading extends Thread {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Countdown countdown = new Countdown();
 CountDownThread t1= new CountDownThread(countdown);
 t1.setName("Thread 1");
 CountDownThread t2= new CountDownThread(countdown);
 t2.setName("Thread 2");
		
	t1.start();
	t2.start();
			
		}
	}

class Countdown {{
		
		for (int i=10;i>0;i--){
		System.out.println(Thread.currentThread().getName() +"  i: "+i);
		
	}
}
}


class CountDownThread extends Thread {
	private Countdown ThreadCountdown;
	
	public CountDownThread(Countdown countdown){
		
		ThreadCountdown =countdown;
	}
}