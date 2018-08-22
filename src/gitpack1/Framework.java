package gitpack1;

public class Framework {

	public static void main(String[] args) {
		System.out.println("this is my framework");
		add(5, 6);
		add(5, 6, 7);
		revbyGayatri(a);

	}

	static public void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	
	public static void revbyGayatri(int a) {
		int i=0,j=0;
		while(a>0) {
			i = a%10;
			j=(j*10)+i;
			a=a/10;

			}		return j;

	}
	
}
