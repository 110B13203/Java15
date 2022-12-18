package MyJava15;
class Add implements Runnable{
	private int n;
	private int num=0;
	public Add(int a) {
		n=a;
	}
	public void run() {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=100000000;j++);
			num+=i;
		}
		System.out.println(num);
	}
}
public class Class06 {

	public static void main(String[] args) {
		Add n1=new Add(5);
		Add n2=new Add(10);
		Thread t1=new Thread(n1);
		Thread t2=new Thread(n2);
		t1.start();
		t2.start();
		
	}

}
