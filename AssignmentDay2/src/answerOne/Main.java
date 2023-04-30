package answerOne;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA t1= new ThreadA();
		ThreadB t2= new ThreadB(t1);
		t1.start();
		t2.start();
		

	}

}
