package com.gt.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//ARITHMETIC EXCEPTION
System.out.println(1);
System.out.println(2);
System.out.println(2+2);
//System.out.println(2/0);

//NULLPOINT EXCEPTION
//String s7=""; //prints length as 0
//String s7=null;
//System.out.println(s7.length());

//ARRAY INDEX OUT OF BOUNDS
int a[]=new int[3];
a[0]=1;
a[1]=1;
a[2]=2;
//System.out.println(a[9]);

//STRING INDEX OUT OF BOUNDS
//String s="Hello";
//System.out.println(s.charAt(8));

//NUMBER FORMAT EXCEPTION
//String s1="Hello All";
//int a1=Integer.parseInt(s1);
//System.out.println(a1);

//INPUT MISMATCH EXCEPTION
Scanner obj=new Scanner(System.in);
System.out.println("Enter the value");
int a2=obj.nextInt();
obj.close();

//INDEX OUT OF BOUNDS EXCEPTION
List<Integer> list=new ArrayList();
list.add(100);
list.add(45);
System.out.println(list.get(6));
	}

}
