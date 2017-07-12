package player;

import java.util.Scanner;

public class wordrev133 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		String a=sn.nextLine();
		String str[] = a.split(" ");
	    String b="";
	        for(int i=str.length-1;i>=0;i--){
	            b+=str[i]+" ";
	        }
	        System.out.println(b);

	}

}
