package gitpack1;

public class Framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my framework");
		add(5, 6);
		add(5, 6, 7);
		reverseBySanthi();

	}

	static public void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
		System.out.println("Adding nos");
	}
	public static void reverseBySanthi() {
		System.out.println("ihtnas");
	}
	
}
