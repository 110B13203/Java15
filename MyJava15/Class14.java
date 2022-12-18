package MyJava15;

class PrePaid extends Thread {
	public  static int sum = 200;

	public void run() {
		while (sum > 10) {
			int r = (int) (Math.random() * 100);
			sum -= r;
			Call.talk(sum);

		}
	}
}

class Call {
	public static void talk(int f) {
		try {
			Thread.sleep((int) (1000 * Math.random())); // 小睡0~1秒鐘
		} catch (InterruptedException e) {
		}
		if (f < 0)
			f=0;
		System.out.println("餘額:" + f);

	}
}

public class Class14 {

	public static void main(String[] args) {
		PrePaid a1 = new PrePaid();
		PrePaid a2 = new PrePaid();
		PrePaid a3 = new PrePaid();
		a1.start();
		a2.start();
		a3.start();
	}

}
