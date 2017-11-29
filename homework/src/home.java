class TimerRunnable implements Runnable {
	int count = 1;
	int sleepTime;
	static int sno = 0;
	int no;
	 TimerRunnable(int sleepTime){
		no=++sno;
		this.sleepTime = sleepTime;
		
	}
	
	public void run() {
		while (true) {
			System.out.println(no+ "thread-- " +count);
			count++;
			try {
				Thread.sleep(1000*sleepTime);   //�ڴ½ð��� 1��, 2��, 3�ʷ� �ٸ�����
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class home {
	public static void main(String[] args) {
		Thread th1 = new Thread(new TimerRunnable(1));
		Thread th2 = new Thread(new TimerRunnable(2));
		Thread th3 = new Thread(new TimerRunnable(3));
		th1.start();
		th2.start();
		th3.start();
	}
}
