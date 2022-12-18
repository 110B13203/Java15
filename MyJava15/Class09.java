package MyJava15;
class Test implements Runnable{
	private double time;
	private int num;
	public Test(double t,int n) {
		time=t;
		num=n;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			try
	         {
	            Thread.sleep((int)time*1000);
	         }
	         catch(InterruptedException e){}
			System.out.println("Thread "+num+" is running");
		}
	}
}
public class Class09 {
	public static void main(String args[]) {
		Test t1=new Test(1,1);
		Test t2=new Test(2.5,2);
		Thread x=new Thread(t1);
		Thread y=new Thread(t2);
		x.start();
		y.start();
	}
}