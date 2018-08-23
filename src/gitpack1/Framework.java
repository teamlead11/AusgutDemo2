package gitpack1;

public class Framework {

	public static void main(String[] args) {
		System.out.println("this is my framework");
		add(5, 6);
		add(5, 6, 7);
		revbyGayatri(5);
		reverseByHemavi();

		reverseByBala("August"," ");
		reverseSaradha();

		
		reverseBySiva("WELCOME","");
		

		revBySilambarasan();

		reverseByPrabu("test","");
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
	public static void reverseByBala(String name, String rev) {

		
		
		for(int i=name.length()-1; i>=0; i--) {
			char ch = name.charAt(i);
		    rev = rev + ch;
		}
		System.out.println(rev);
		
	}
	
	
	
	public static int revbyGayatri(int a) {
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

public static void reverseSaradha() {
	String s= "Hello welcome All";
	String r="";
	for (int i=s.length()-1;i>0;i--) {
		r=r+s.charAt(i);
	}
	System.out.println(r);
	
	}

	public static void reverseBySiva(String name,String reverse) 
	{
		for(int i=name.length()-1; i>=0; i--) {
			char ch = name.charAt(i);
		    reverse = reverse + ch;
		}
		System.out.println(reverse);
		
		
	}

public static void revBySilambarasan() {
	String original="Silambarasan";
	String rev="";
	int len=original.length();
	for(int i=len-1;i>0;i++) {
		char ch=original.charAt(i);
		rev=rev+ch;
		
	}
	System.out.println(rev);
	
}
public static void reverseByPrabu(String name,String reverse) 
{
	for(int i=name.length()-1; i>=0; i--) {
		char ch = name.charAt(i);
	    reverse = reverse + ch;
	}
	System.out.println(reverse);
	

	
}
}
