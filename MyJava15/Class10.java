package MyJava15;
class CTest implements Runnable{
	String id;
	public CTest(String str){
		id=str;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			double r=(Math.random()*(2-0+1))+0;
			try {
				Thread.sleep((int)(r*1000));
			} catch (InterruptedException e){}
			finally {
				System.out.println(id+" "+i);
			}
		}
	}
}
public class Class10 {

	public static void main(String[] args) {
		CTest hi=new CTest("Hello");
		CTest bye=new CTest("Good bye");
		CTest morning=new CTest("Good morning");
		CTest night=new CTest("Good night");
		Thread t1=new Thread(hi);
		Thread t2=new Thread(bye);
		Thread t3=new Thread(morning);
		Thread t4=new Thread(night);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
