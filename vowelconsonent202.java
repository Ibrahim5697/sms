package player;

import java.util.Scanner;

public class vowelconsonent202 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		String a=sn.nextLine();
		String b=a.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]","");
		String c=a.replaceAll("[aeiouAEIOU]","");
		System.out.println(b+""+c);

	}

}
