package gitpack1;

public class Framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my framework");
		add(5, 6);
		add(5, 6, 7);
		reverseByHemavi();

	}

	static public void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public static void reverseByHemavi() {
		String original="Hemavi";
		String reverse="";
		int len=original.length();
		for(int i=len-1;i>0;i++) {
			char ch=original.charAt(i);
			reverse=reverse+ch;
			
		}
		System.out.println(reverse);
		
	}
}
