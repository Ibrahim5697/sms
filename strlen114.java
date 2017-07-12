package player;
import java.util.Scanner;
public class strlen114 {

	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	String str=sn.nextLine();
	String str1=sn.nextLine();
	int a=str.length();
	int b=str1.length();
	if(a>b)
		System.out.println(str.substring(a-b)+str1.substring(0));
	else if(a<b)
		System.out.println(str.substring(0)+str1.substring(b-a));
	else {
		String c=str.concat(str1);
		System.out.println(c);
	}
	}

}
