package player;
import java.util.Scanner;
public class strrev117 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		String str=sn.nextLine();
		String rev=" ";
		int a=str.length();
		for(int i=a-1;i>=0;i--)
			rev=rev+str.charAt(i)+"-";
		System.out.println(rev);

	}

}
