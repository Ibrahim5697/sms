package player;
import java.util.Scanner;
public class countvowel {

	public static void main(String[] args) {
		int count=0;
		Scanner sn=new Scanner(System.in);
		String a=sn.next();
		for(int i=0;i<a.length();i++) {
			char b=a.charAt(i);
			if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U')
			count++;
		}
System.out.println(count);
sn.close();
	}

}
