package test1;

import java.util.Scanner;

public class Test2 {

	public static String f(String s1,String s2) {
		if(s1.indexOf(s2) != -1){
			return "TRUE";
        }else{
        	return "FALSE";
        }
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("input str1:");
		String str1 = input.nextLine();
		System.out.print("input str2:");
		String str2 = input.nextLine();
        System.out.println(f(str1,str2));
	}
}

