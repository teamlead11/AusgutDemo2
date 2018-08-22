package gitpack1;

public class Framework {

	public static void main(String[] args) {
		System.out.println("this is my framework");
		add(5, 6);
		add(5, 6, 7);
		revbyGayatri(a);
		reverseByHemavi();

		reverseByManoj("August"," ");


	}

	static public void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void reversebyMounika() {
		System.out.println(reverse);

	public static void reverseByManoj(String name, String rev) {
		
		
		for(int i=name.length()-1; i>=0; i--) {
			char ch = name.charAt(i);
		    rev = rev + ch;
		}
		System.out.println(rev);
		
	}
	
	
	
	public static void revbyGayatri(int a) {
		int i=0,j=0;
		while(a>0) {
			i = a%10;
			j=(j*10)+i;
			a=a/10;

			}		return j;

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
