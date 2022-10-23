package test1;

public class Test1{
    public static void c(String[] args){
        String[] str2 = new String[3]; 
        for (int i = 0; i < args.length; i++) {
        str2[i] = args[args.length-i-1];
        }
        for (int i = 0; i < str2.length; i++) {
        	System.out.println(str2[i]);
        }
    }
    
    public static void main(String[] args) {
    	String[] str1 = {"A","BC","dog"};
        c(str1);
    }
}
