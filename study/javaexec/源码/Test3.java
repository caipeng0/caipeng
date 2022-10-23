package test1;

import java.util.Scanner;

public class Test3 {
	public static int digit(int num) {
		int len = 0;
		while (num != 0){
			len++;
            num = num / 10;
        }
        return len;
	}
	
	public static int qiuhe(int num,int len) {
		int sum = 0;
		while(num != 0) {
			int product = 1;
			for (int i = 0; i < len; i++) {
				product *= (num % 10);
			}
			num = num / 10;
			sum += product;
		}
		return sum;
	}
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("input:");
		int num = input.nextInt();
		System.out.print("output:");
		if(qiuhe(num, digit(num)) == num) {
			System.out.print("TRUE");
		}else {
			System.out.print("FALSE");
		}
        
	}
}
