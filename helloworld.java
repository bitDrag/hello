
public class helloworld implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print(Thread.currentThread().getName());
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		helloworld rv=new helloworld();
		Thread t1=new Thread(rv);
		Thread t2=new Thread(rv);
		Thread t3=new Thread(rv);
		Thread t4=new Thread(rv);
		Thread t5=new Thread(rv);
		Thread t6=new Thread(rv);
		Thread t7=new Thread(rv);
		Thread t8=new Thread(rv);
		Thread t9=new Thread(rv);
		Thread t10=new Thread(rv);
		t1.setName("H");
		Thread.sleep(2147483647);
		t1.start();
		t2.setName("e");
		Thread.sleep(2147483647);
		t2.start();
		t3.setName("l");
		Thread.sleep(2147483647);
		t3.start();
		t4.setName("l");
		Thread.sleep(2147483647);
		t4.start();
		t5.setName("o");
		Thread.sleep(2147483647);
		t5.start();
		t6.setName(" w");
		Thread.sleep(2147483647);
		t6.start();
		t7.setName("o");
		Thread.sleep(2147483647);
		t7.start();
		t8.setName("r");
		Thread.sleep(2147483647);
		t8.start();
		t9.setName("l");
		Thread.sleep(2147483647);
		t9.start();
		t10.setName("d");
		Thread.sleep(2147483647);
		t10.start();
	}
}
